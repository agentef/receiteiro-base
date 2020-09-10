package br.com.receiteiro.base.exception

import org.springframework.http.HttpStatus
import org.springframework.web.client.HttpServerErrorException

open class BaseException(var httpStatus: HttpStatus, var description: String) : RuntimeException() {

    private val _codePrefix: String = "RC-"
    val codePrefix: String
        get() = _codePrefix

    override val cause: Throwable?
        get() = HttpServerErrorException(httpStatus)
}