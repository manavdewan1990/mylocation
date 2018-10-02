package com.mylocation.mylocation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {


    @GetMapping("/check")
    public String createRole() {
        return "Audit App working";
    }


}
