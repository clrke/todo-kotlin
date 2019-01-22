package com.clrke.todo.domain.exception.param.user

import com.clrke.todo.domain.exception.param.EmptyStringException

class EmptyLastNameException : EmptyStringException("Last name")
