package com.clrke.todo.api.mapper.task

import com.clrke.todo.api.resp.task.TaskApiResp
import com.clrke.todo.domain.model.Task
import org.springframework.stereotype.Service

@Service
class TaskApiMapperImpl : TaskApiMapper {
    override fun map(tasks: List<Task>): List<TaskApiResp> = tasks.map { map(it) }

    override fun map(task: Task): TaskApiResp = TaskApiResp(
            task.title,
            task.description,
            task.completed
    )
}