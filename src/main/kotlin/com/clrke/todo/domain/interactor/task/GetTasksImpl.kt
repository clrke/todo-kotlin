package com.clrke.todo.domain.interactor.task

import com.clrke.todo.domain.gateway.task.TaskGateway
import com.clrke.todo.domain.model.Task
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetTasksImpl @Autowired constructor(
       val gateway: TaskGateway
) : GetTasks {
    override fun execute(): List<Task> = gateway.findAll()

}