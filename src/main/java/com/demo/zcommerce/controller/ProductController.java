package com.demo.zcommerce.controller;

import com.demo.zcommerce.entities.Product;
import com.demo.zcommerce.services.ProductService;
import com.demo.zcommerce.utils.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController extends GenericExceptionHandler {

    @Autowired
    private ProductService productService;

    @GetMapping(params = {"page", "size"})
    public ResponseEntity<Page<Product>> listProducts(
            @RequestParam int page, @RequestParam int size) {
        return new ResponseEntity<>(productService.findAll(RestUtils.getPageable(page, size)), HttpStatus.OK);
    }
}
