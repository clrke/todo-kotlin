package com.clrke.todo.domain.gateway.user

import com.clrke.todo.domain.model.User
import com.clrke.todo.domain.param.user.UserParam

interface UserGateway {
    fun findAll(q: String?): List<User>
    fun findOne(id: Long): User
    fun create(param: UserParam): User
    fun usernameAlreadyExists(username: String): Boolean
}
