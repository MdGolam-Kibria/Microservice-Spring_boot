package com.apigetway.apigetway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User service is taken longer then expected ! Please try again later ";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentsServiceFallBackMethod() {
        return "departments service is taken longer then expected ! Please try again later ";
    }
}
