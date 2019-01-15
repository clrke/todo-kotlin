package com.clrke.todo.data.mapper.task

import com.clrke.todo.data.entity.TaskEntity
import com.clrke.todo.domain.model.Task
import org.springframework.stereotype.Service

@Service
class TaskDataMapperImpl : TaskDataMapper {
    override fun map(entities: List<TaskEntity>): List<Task> = entities.map { map(it) }

    override fun map(entity: TaskEntity): Task = Task(
            entity.id,
            entity.title,
            entity.description,
            entity.status == 1
    )
}