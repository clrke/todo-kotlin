package com.clrke.todo.data.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TODO_TASK")
data class TaskEntity(
        @Id
        @Column(name = "id")
        val id: Long,

        @Column(name = "title")
        val title: String,

        @Column(name = "description")
        val description: String,

        @Column(name = "status")
        val status: Int
)
