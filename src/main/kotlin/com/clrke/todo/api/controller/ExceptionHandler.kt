package com.clrke.todo.api.controller

import com.clrke.todo.api.resp.error.ApiErrorResp
import com.clrke.todo.domain.exception.ParamException
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver

// @ControllerAdvice
class ExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [ParamException::class])
    protected fun handleParamException(ex: ParamException, request: WebRequest): ResponseEntity<Any> {
        return handleExceptionInternal(
                ex,
                ApiErrorResp(ex.message!!),
                HttpHeaders(),
                HttpStatus.UNPROCESSABLE_ENTITY,
                request
        )
    }
}