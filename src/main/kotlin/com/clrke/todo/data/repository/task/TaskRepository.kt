package com.clrke.todo.data.repository.task

import com.clrke.todo.data.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<TaskEntity, Long>
