package com.communication.web.client.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.communication.web.client.service.CarAction;

@RestController
@RequestMapping("/cars")
public class CarController {
    
    private final CarAction carAction;

    @Autowired
    public CarController(CarAction carAction) {
        this.carAction = carAction;
    }

    @GetMapping("/isExpensive")
    public ResponseEntity<Boolean> isExpensive(@RequestParam double price) {
        Boolean isExpensive = carAction.isExpensive(price);
        if (isExpensive != null) {
            return ResponseEntity.ok(isExpensive);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
