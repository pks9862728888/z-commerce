package com.demo.zcommerce.controller;

import com.demo.zcommerce.entities.ProductCategory;
import com.demo.zcommerce.services.ProductCategoryService;
import com.demo.zcommerce.utils.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.demo.zcommerce.utils.RestUtils.getPageable;

@RestController
@RequestMapping("/product-category")
public class ProductCategoryController extends GenericExceptionHandler {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping(params = {"page", "size"})
    public ResponseEntity<Page<ProductCategory>> getProductCategories(
            @RequestParam int page, @RequestParam int size) {
        return new ResponseEntity<>(productCategoryService.findAll(getPageable(page, size)), HttpStatus.OK);
    }
}
