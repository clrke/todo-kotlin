package com.clrke.todo.api.controller.user

import com.clrke.todo.api.mapper.user.UserApiMapper
import com.clrke.todo.api.resp.user.UserApiResp
import com.clrke.todo.domain.interactor.user.GetUser
import com.clrke.todo.domain.interactor.user.GetUsers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController @Autowired constructor(
        val mapper: UserApiMapper,
        val getUsers: GetUsers,
        val getUser: GetUser
) {
    @GetMapping("")
    fun index(@RequestParam q: String?): List<UserApiResp> {
        return mapper.map(getUsers.execute(q))
    }

    @GetMapping("{id}")
    fun show(@PathVariable id: Long): UserApiResp = mapper.map(getUser.execute(id))
}

