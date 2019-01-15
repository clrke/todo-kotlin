package com.clrke.todo.domain.interactor.task

import com.clrke.todo.domain.model.Task

interface GetTask {
    fun execute(id: Long): Task
}
