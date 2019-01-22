package com.clrke.todo.data.gateway.user

import com.clrke.todo.data.entity.UserEntity
import com.clrke.todo.data.mapper.user.UserDataMapper
import com.clrke.todo.data.repository.user.UserRepository
import com.clrke.todo.domain.gateway.user.UserGateway
import com.clrke.todo.domain.model.User
import com.clrke.todo.domain.param.user.UserParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserGatewayImpl @Autowired constructor(
        val mapper: UserDataMapper,
        val repository: UserRepository
) : UserGateway {
    override fun findAll(q: String?): List<User> {
        if (q.isNullOrBlank()) {
            return mapper.map(repository.findAll())
        }
        return mapper.map(repository.findAllByFirstNameContains(q!!))
    }

    override fun findOne(id: Long): User = mapper.map(repository.findByIdOrNull(id)!!)

    override fun create(param: UserParam): User {
        return mapper.map(repository.save(UserEntity(
                param.username,
                param.firstName,
                param.lastName
        )))
    }

    override fun usernameAlreadyExists(username: String): Boolean {
        return repository.findByUsername(username) != null
    }
}