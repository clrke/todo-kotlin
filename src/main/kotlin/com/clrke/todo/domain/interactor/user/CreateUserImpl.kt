package com.clrke.todo.domain.interactor.user

import com.clrke.todo.domain.exception.param.user.EmptyFirstNameException
import com.clrke.todo.domain.exception.param.user.EmptyLastNameException
import com.clrke.todo.domain.exception.param.user.EmptyUsernameException
import com.clrke.todo.domain.exception.param.user.UsernameAlreadyExistsException
import com.clrke.todo.domain.gateway.user.UserGateway
import com.clrke.todo.domain.model.User
import com.clrke.todo.domain.param.user.UserParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateUserImpl @Autowired constructor(
        val gateway: UserGateway
) : CreateUser {
    override fun execute(param: UserParam): User {
        if (param.username.isEmpty()) throw EmptyUsernameException()
        if (param.firstName.isEmpty()) throw EmptyFirstNameException()
        if (param.lastName.isEmpty()) throw EmptyLastNameException()

        if (gateway.usernameAlreadyExists(param.username)) {
            throw UsernameAlreadyExistsException()
        }

        return gateway.create(param)
    }
}