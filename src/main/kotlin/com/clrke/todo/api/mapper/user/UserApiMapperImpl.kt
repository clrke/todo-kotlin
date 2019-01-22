package com.clrke.todo.api.mapper.user

import com.clrke.todo.api.form.user.UserForm
import com.clrke.todo.api.resp.user.UserApiResp
import com.clrke.todo.domain.model.User
import com.clrke.todo.domain.param.user.UserParam
import org.springframework.stereotype.Service

@Service
class UserApiMapperImpl : UserApiMapper {
    override fun map(users: List<User>): List<UserApiResp> = users.map {
        map(it)
    }

    override fun map(user: User): UserApiResp = UserApiResp(
            user.id,
            user.username,
            user.firstName,
            user.lastName,
            user.createDate,
            user.deactivationDate
    )

    override fun map(form: UserForm): UserParam = UserParam(
            form.username,
            form.firstName,
            form.lastName
    )

}