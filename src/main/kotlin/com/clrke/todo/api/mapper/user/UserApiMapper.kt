package com.clrke.todo.api.mapper.user

import com.clrke.todo.api.form.user.UserForm
import com.clrke.todo.api.resp.user.UserApiResp
import com.clrke.todo.domain.model.User
import com.clrke.todo.domain.param.user.UserParam

interface UserApiMapper {
    fun map(users: List<User>): List<UserApiResp>
    fun map(user: User): UserApiResp
    fun map(form: UserForm): UserParam
}
