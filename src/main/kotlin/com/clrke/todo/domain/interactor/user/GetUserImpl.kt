package com.clrke.todo.domain.interactor.user

import com.clrke.todo.domain.gateway.user.UserGateway
import com.clrke.todo.domain.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetUserImpl @Autowired constructor(
       val gateway: UserGateway
) : GetUser {
    override fun execute(id: Long): User = gateway.findOne(id)
}