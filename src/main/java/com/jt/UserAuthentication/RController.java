package com.jt.UserAuthentication;

import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RController {
	@GetMapping("/")
    public String home() {
        return "<h1>Welcome<h1>";
    }

    @Test

    @GetMapping("/user")
    public String user() {
        return "<h1>Welcome user<h1>";
    }
    @Test

    @GetMapping("/admin")
    public String admin(){

        //TODO:

        return "<h1>Welcome admin<h1>";



    }
}
