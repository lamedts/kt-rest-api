package com.laed.ktrestapi.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class GeneralErrorResponse(
    val message:String,
    val requestUrl: String? = null,
    val errorStackStace: String? = null
)
