package com.battleship.springsecuritywithjwt.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<?> hello(Authentication authentication) {
        return ResponseEntity.ok("hello: " + authentication.getName() + " "  + authentication.getAuthorities());
    }

    @GetMapping("hello-admin")
    public ResponseEntity<?> helloAdmin(Authentication authentication) {
        return ResponseEntity.ok("hello admin:  " + authentication.getName() + " "  + authentication.getAuthorities());
    }
}