package com.buimanhthanh.controller.api;

import com.buimanhthanh.entity.Product;
import com.buimanhthanh.model.*;
import com.buimanhthanh.repository.CategoryRepo;
import com.buimanhthanh.repository.ProductRepo;
import com.buimanhthanh.service.impl.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class MainController {
    private final CategoryRepo categoryRepo;
    private final ProductService productService;
    private final ProductRepo productRepo;
    private final AccessService accessService;
    private final AccountService accountService;
    private final CartService cartService;
    private final CategoryService categoryService;

    public MainController(CategoryRepo categoryRepo, ProductService productService, ProductRepo productRepo, AccessService accessService, AccountService accountService, CartService cartService, CategoryService categoryService) {
        this.categoryRepo = categoryRepo;
        this.productService = productService;
        this.productRepo = productRepo;
        this.accessService = accessService;
        this.accountService = accountService;
        this.cartService = cartService;
        this.categoryService = categoryService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> index() {
        return ResponseEntity.ok(productService.findAll());
    }
    @GetMapping("/access")
    public ResponseEntity<List<AccessDTO>> index2() {
        return ResponseEntity.ok(accessService.findAll());
    }
    @GetMapping("/account")
    public ResponseEntity<List<AccountDTO>> index3() {
        return ResponseEntity.ok(accountService.findAll());
    }
    @GetMapping("/cart")
    public ResponseEntity<List<CartDTO>> index4() {
        return ResponseEntity.ok(cartService.findAll());
    }
    @GetMapping("/category")
    public ResponseEntity<List<CategoryDTO>> index5() {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping("/save")
    public void index6(){
        Product p = productRepo.findById(2).get();
        p.setName("THANH 2");
        productService.save(p);
    }
}
