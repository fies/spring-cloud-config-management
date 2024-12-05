package com.fies.payment.controller;

import com.fies.payment.configuration.ProductServiceConfiguration;
import com.fies.payment.configuration.ProductServiceInfoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payment/api")
public class PaymentController {

    private final ProductServiceConfiguration productServiceConfiguration;
    public PaymentController(ProductServiceConfiguration productServiceConfiguration) {
        this.productServiceConfiguration = productServiceConfiguration;
    }

    @GetMapping("/product-service-info")
    public ResponseEntity<ProductServiceInfoDTO> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ProductServiceInfoDTO.of(productServiceConfiguration.getUrl(), productServiceConfiguration.getApiKey()));
    }
}
