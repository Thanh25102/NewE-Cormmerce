package com.buimanhthanh.controller;

import com.buimanhthanh.model.AccessDTO;
import com.buimanhthanh.model.ProductDTO;
import com.buimanhthanh.service.impl.AccessService;
import com.buimanhthanh.service.impl.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class MainController {
    private final ProductService productService;
    private final AccessService accessService;

    public MainController(ProductService productService, AccessService accessService) {
        this.productService = productService;
        this.accessService = accessService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> index() {
        return ResponseEntity.ok(productService.findAll());
    }
    @GetMapping("/access")
    public ResponseEntity<List<AccessDTO>> index2() {
        return ResponseEntity.ok(accessService.findAll());
    }
}
