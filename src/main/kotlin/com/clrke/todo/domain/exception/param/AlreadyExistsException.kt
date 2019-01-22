package com.clrke.todo.domain.exception.param

import com.clrke.todo.domain.exception.ParamException

abstract class AlreadyExistsException(field: String) : ParamException("$field already exists!")
