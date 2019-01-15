package com.clrke.todo.data.mapper.user

import com.clrke.todo.data.entity.UserEntity
import com.clrke.todo.domain.model.User
import org.springframework.stereotype.Service

@Service
class UserDataMapperImpl : UserDataMapper {
    override fun map(entities: List<UserEntity>): List<User> = entities.map { map(it) }

    override fun map(entity: UserEntity): User = User(
            entity.id,
            entity.username,
            entity.firstName,
            entity.lastName,
            entity.createDate,
            entity.modifyDate,
            entity.deactivationDate,
            entity.status == 1
    )
}