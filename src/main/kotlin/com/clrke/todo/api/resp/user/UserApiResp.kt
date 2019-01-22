package com.clrke.todo.api.resp.user

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class UserApiResp(
        @JsonProperty("id")
        val id: Long,

        @JsonProperty("username")
        val username: String,

        @JsonProperty("first_name")
        val firstName: String,

        @JsonProperty("last_name")
        val lastName: String,

        @JsonProperty("create_date")
        val createDate: Date,

        @JsonProperty("deactivation_date")
        val deactivationDate: Date?
)
