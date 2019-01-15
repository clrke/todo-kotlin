package com.clrke.todo.api.mapper.user

import com.clrke.todo.api.resp.user.UserApiResp
import com.clrke.todo.domain.model.User

interface UserApiMapper {
    fun map(users: List<User>): List<UserApiResp>
    fun map(user: User): UserApiResp
}
