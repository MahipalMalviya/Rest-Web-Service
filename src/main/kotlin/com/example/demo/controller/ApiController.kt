package com.example.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @RequestMapping("/")
    fun welcome(): String {
        return "Welcome to Web Service Example"
    }

    @RequestMapping("/hello")
    fun myData(): String {
        return "Hello From Mahipal !!"
    }
}