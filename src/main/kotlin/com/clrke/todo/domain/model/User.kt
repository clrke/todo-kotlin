package com.clrke.todo.domain.model

import java.util.*

data class User (
        val id: Long,
        val username: String,
        val firstName: String,
        val lastName: String,
        val createDate: Date,
        val modifyDate: Date,
        val deactivationDate: Date,
        val active: Boolean
)

