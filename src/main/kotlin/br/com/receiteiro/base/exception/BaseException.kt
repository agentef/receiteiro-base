package br.com.receiteiro.base.exception

import org.springframework.http.HttpStatus

open class BaseException(var httpStatus: HttpStatus, var description: String) : RuntimeException() {

    private val _codePrefix: String = "RC-"
    val codePrefix: String
        get() = _codePrefix

}