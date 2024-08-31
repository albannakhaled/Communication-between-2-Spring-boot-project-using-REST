package com.communication.web.rest.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CarRestClient {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    @Autowired
    public CarRestClient(RestTemplate restTemplate, @Value("${car.service.url}") String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    public Boolean isExpensive(double price) {
        String url = baseUrl + "/cars/isExpensive?price=" + price;
        return restTemplate.getForObject(url, Boolean.class);
    }
}