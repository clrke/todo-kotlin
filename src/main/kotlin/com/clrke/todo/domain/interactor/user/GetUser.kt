package com.clrke.todo.domain.interactor.user

import com.clrke.todo.domain.model.User

interface GetUser {
    fun execute(id: Long): User
}
