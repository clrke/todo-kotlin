package com.clrke.todo.data.repository.user

import com.clrke.todo.data.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findAllByFirstNameContains(q: String): List<UserEntity>
}


