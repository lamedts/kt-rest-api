package com.laed.ktrestapi

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtRestApiApplication

fun main(args: Array<String>) {
    runApplication<KtRestApiApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
