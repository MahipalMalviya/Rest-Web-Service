package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SpringJava4sController {

    @RequestMapping("/")
    fun welcome(): String {
        return "Welcome to Web Service Example"
    }

    @RequestMapping("/hello")
    fun myData(): String {
        return "Hello From Mahipal !!"
    }
}