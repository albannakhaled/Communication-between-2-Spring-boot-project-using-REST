package com.communication.web.client.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.communication.web.client.model.Car;
import com.communication.web.client.service.CarAction;

@Service
public class CarImpl implements CarAction {
    
    // Initialize with dummy data
    private List<Car> cars = new ArrayList<>();

    public CarImpl() {
        cars.add(new Car("Toyota", "Camry", 2022, "White", 25000.00));
        cars.add(new Car("Honda", "Accord", 2021, "Black", 22000.00));
        cars.add(new Car("Ford", "Mustang", 2023, "Red", 30000.00));
    }

    @Override
    public Boolean isExpensive(double price) {
        // Define a threshold for expensive cars
        double threshold = 25000.00;
        return price > threshold;
    }
}
