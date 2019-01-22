package com.clrke.todo.api.form.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserForm(
        @JsonProperty("username")
        val username: String,

        @JsonProperty("first_name")
        val firstName: String,

        @JsonProperty("last_name")
        val lastName: String
)

