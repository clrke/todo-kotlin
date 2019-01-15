package com.clrke.todo.domain.interactor.task

import com.clrke.todo.domain.gateway.task.TaskGateway
import com.clrke.todo.domain.model.Task
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetTaskImpl @Autowired constructor(
        val gateway: TaskGateway
) : GetTask {
    override fun execute(id: Long): Task = gateway.findOne(id)
}