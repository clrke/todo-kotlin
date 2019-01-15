package com.clrke.todo.data.gateway.task

import com.clrke.todo.data.mapper.task.TaskDataMapper
import com.clrke.todo.data.repository.task.TaskRepository
import com.clrke.todo.domain.gateway.task.TaskGateway
import com.clrke.todo.domain.model.Task
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TaskGatewayImpl @Autowired constructor(
        val mapper: TaskDataMapper,
        val repository: TaskRepository
) : TaskGateway {
    override fun findAll(): List<Task> = mapper.map(repository.findAll())

    override fun findOne(id: Long): Task = mapper.map(repository.findByIdOrNull(id)!!)
}