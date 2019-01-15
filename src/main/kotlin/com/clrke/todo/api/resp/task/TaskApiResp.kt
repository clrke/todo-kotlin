package com.clrke.todo.api.resp.task

import com.fasterxml.jackson.annotation.JsonProperty

data class TaskApiResp (
        @JsonProperty("id")
        val title: String,

        @JsonProperty("description")
        val description: String,

        @JsonProperty("completed")
        val completed: Boolean
)
