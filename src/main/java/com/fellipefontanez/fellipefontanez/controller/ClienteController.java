package com.fellipefontanez.fellipefontanez.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    @GetMapping
    public ResponseEntity getClientes(){
        return ResponseEntity.ok().build();
    }

}
