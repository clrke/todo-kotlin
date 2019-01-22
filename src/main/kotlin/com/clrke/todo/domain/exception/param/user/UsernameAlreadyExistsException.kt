package com.clrke.todo.domain.exception.param.user

import com.clrke.todo.domain.exception.param.AlreadyExistsException

class UsernameAlreadyExistsException : AlreadyExistsException("Username")
