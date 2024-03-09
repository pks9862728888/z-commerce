package com.demo.zcommerce.controller;

import com.demo.zcommerce.entities.ProductCategory;
import com.demo.zcommerce.services.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product-category")
public class ProductCategoryController extends GenericExceptionHandler {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    public ResponseEntity<List<ProductCategory>> getProductCategories() {
        return new ResponseEntity<>(productCategoryService.findAll(), HttpStatus.OK);
    }
}
