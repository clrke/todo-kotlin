package com.clrke.todo.api.mapper.task

import com.clrke.todo.api.resp.task.TaskApiResp
import com.clrke.todo.domain.model.Task

interface TaskApiMapper {
    fun map(tasks: List<Task>): List<TaskApiResp>
    fun map(task: Task): TaskApiResp
}
