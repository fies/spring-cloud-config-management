package com.fies.shipment.controller;

import com.fies.shipment.configuration.ProductServiceConfiguration;
import com.fies.shipment.configuration.ProductServiceInfoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/shipment/api")
public class ShipmentController {

    private final ProductServiceConfiguration productServiceConfiguration;
    public ShipmentController(ProductServiceConfiguration productServiceConfiguration) {
        this.productServiceConfiguration = productServiceConfiguration;
    }

    @GetMapping("/product-service-info")
    public ResponseEntity<ProductServiceInfoDTO> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ProductServiceInfoDTO.of(productServiceConfiguration.getUrl(), productServiceConfiguration.getApiKey()));
    }
}
