package com.clrke.todo.data.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TODO_USER")
data class UserEntity(
        @Id
        @Column(name = "id")
        val id: Long,

        @Column(name = "username")
        val username: String,

        @Column(name = "first_name")
        val firstName: String,

        @Column(name = "last_name")
        val lastName: String,

        @Column(name = "create_date")
        val createDate: Date,

        @Column(name = "modify_date")
        val modifyDate: Date,

        @Column(name = "deactivation_date")
        val deactivationDate: Date,

        @Column(name = "status")
        val status: Int
)
