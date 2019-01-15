package com.clrke.todo.api.controller.task

import com.clrke.todo.api.mapper.task.TaskApiMapper
import com.clrke.todo.api.resp.task.TaskApiResp
import com.clrke.todo.domain.interactor.task.GetTask
import com.clrke.todo.domain.interactor.task.GetTasks
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tasks")
class TaskController @Autowired constructor(
        val mapper: TaskApiMapper,
        val getTasks: GetTasks,
        val getTask: GetTask
) {
    @GetMapping("")
    fun index(): List<TaskApiResp> = mapper.map(getTasks.execute())

    @GetMapping("{id}")
    fun show(@PathVariable id: Long): TaskApiResp = mapper.map(getTask.execute(id))
}

