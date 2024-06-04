package com.laed.ktrestapi.utils

import java.io.PrintWriter
import java.io.StringWriter

fun Throwable.stackTraceAsString(): String {
    val errors = StringWriter()
    this.printStackTrace(PrintWriter(errors))
    return errors.toString()
}
