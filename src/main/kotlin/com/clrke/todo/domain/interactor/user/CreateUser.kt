package com.clrke.todo.domain.interactor.user

import com.clrke.todo.domain.model.User
import com.clrke.todo.domain.param.user.UserParam

interface CreateUser {
    fun execute(param: UserParam): User
}
