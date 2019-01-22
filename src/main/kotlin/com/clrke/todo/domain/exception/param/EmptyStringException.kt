package com.clrke.todo.domain.exception.param

import com.clrke.todo.domain.exception.ParamException

abstract class EmptyStringException(field: String) : ParamException("$field cannot be empty!")
