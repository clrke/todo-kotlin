package com.clrke.todo.data.mapper.task

import com.clrke.todo.data.entity.TaskEntity
import com.clrke.todo.domain.model.Task

interface TaskDataMapper {
    fun map(entities: List<TaskEntity>): List<Task>
    fun map(entity: TaskEntity): Task
}
