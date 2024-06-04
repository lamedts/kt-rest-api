package com.laed.ktrestapi.controllers

import com.laed.ktrestapi.model.GeneralMessageResponse
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api")
class HelloController {

    @GetMapping("/hello")
    fun getHello(@RequestParam("name", defaultValue = "World") name: String): GeneralMessageResponse {
        return GeneralMessageResponse("Hello, $name")
    }

    @PostMapping("/hello")
    fun postHello(@RequestParam("name", defaultValue = "World") name: String): GeneralMessageResponse {
        return GeneralMessageResponse("Hello, $name (from post)")
    }

    @RequestMapping("/testErr")
    fun testErr() {
        throw Exception("test exception")
    }
}
