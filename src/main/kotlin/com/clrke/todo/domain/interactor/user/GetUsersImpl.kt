package com.clrke.todo.domain.interactor.user

import com.clrke.todo.domain.gateway.user.UserGateway
import com.clrke.todo.domain.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetUsersImpl @Autowired constructor(val gateway: UserGateway) : GetUsers  {
    override fun execute(q: String?): List<User> = gateway.findAll(q)
}