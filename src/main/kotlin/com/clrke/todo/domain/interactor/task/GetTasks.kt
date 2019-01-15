package com.clrke.todo.domain.interactor.task

import com.clrke.todo.domain.model.Task

interface GetTasks {
    fun execute(): List<Task>
}
