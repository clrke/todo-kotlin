package com.clrke.todo.domain.interactor.user

import com.clrke.todo.domain.model.User

interface GetUsers {
    fun execute(q: String?): List<User>
}
