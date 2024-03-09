package com.demo.zcommerce.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface RestUtils {

    static Pageable getPageable(int page, int size) {
        return PageRequest.of(page, size);
    }
}
