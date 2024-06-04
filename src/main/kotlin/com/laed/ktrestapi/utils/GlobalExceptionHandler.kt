package com.laed.ktrestapi.utils

import com.laed.ktrestapi.model.GeneralErrorResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Throwable::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun handleException(request: HttpServletRequest, error: Exception): GeneralErrorResponse {
        return GeneralErrorResponse("Error occurred!", request.requestURL.toString(), error.stackTraceAsString())
    }
}
