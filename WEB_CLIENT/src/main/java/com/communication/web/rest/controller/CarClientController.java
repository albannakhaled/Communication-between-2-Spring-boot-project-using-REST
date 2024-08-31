package com.communication.web.rest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.communication.web.rest.client.CarRestClient;

@RestController
@RequestMapping("/api")
public class CarClientController {
    private final CarRestClient carRestClient;

    @Autowired
    public CarClientController(CarRestClient carRestClient) {
        this.carRestClient = carRestClient;
    }

	@GetMapping("/evaluate-price")
    public ResponseEntity<String> evaluatePrice(@RequestParam double price) {
        boolean isExpensive = carRestClient.isExpensive(price);

        if (isExpensive) {
            return ResponseEntity.ok("Price evaluation completed. Check console for results.");
        } else {
            return ResponseEntity.badRequest().body("The price is not considered expensive.");
        }
    }
}