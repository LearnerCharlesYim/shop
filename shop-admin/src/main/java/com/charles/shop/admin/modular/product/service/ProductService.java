package com.charles.shop.admin.modular.product.service;

import com.charles.shop.admin.modular.product.domain.entity.Product;
import com.charles.shop.admin.modular.product.repository.ProductRepository;
import com.charles.shop.common.domain.PageBean;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public PageBean<Product> listAll(Integer pageNum, Integer pageSize) {
        Page<Product> page = productRepository.findAll(PageRequest.of(pageNum - 1, pageSize, Sort.by(Sort.Direction.ASC, "sort")));
        return PageBean.restPage(page);
    }
}
