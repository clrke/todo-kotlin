package com.clrke.todo.domain.gateway.task

import com.clrke.todo.domain.model.Task

interface TaskGateway {
    fun findAll(): List<Task>
    fun findOne(id: Long): Task
}
