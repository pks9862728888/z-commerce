package com.demo.zcommerce.services;

import com.demo.zcommerce.entities.ProductCategory;
import com.demo.zcommerce.repositories.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public Page<ProductCategory> findAll(Pageable pageRequest) {
        return productCategoryRepository.findAll(pageRequest);
    }
}
