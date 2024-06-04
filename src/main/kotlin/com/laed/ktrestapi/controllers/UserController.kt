package com.laed.ktrestapi.controllers

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api")
class UserController {

    @GetMapping("/user")
    fun getUser() = "hello kotlin with spring"
}
