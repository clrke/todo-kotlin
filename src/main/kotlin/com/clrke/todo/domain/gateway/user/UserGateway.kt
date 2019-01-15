package com.clrke.todo.domain.gateway.user

import com.clrke.todo.domain.model.User

interface UserGateway {
    fun findAll(q: String?): List<User>
    fun findOne(id: Long): User
}
