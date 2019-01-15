package com.clrke.todo.data.mapper.user

import com.clrke.todo.data.entity.UserEntity
import com.clrke.todo.domain.model.User

interface UserDataMapper {
    fun map(entities: List<UserEntity>): List<User>
    fun map(entity: UserEntity): User
}
