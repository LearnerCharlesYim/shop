package com.charles.shop.admin.modular.product.controller;

import com.charles.shop.admin.modular.product.domain.entity.Product;
import com.charles.shop.admin.modular.product.service.ProductService;
import com.charles.shop.common.domain.PageBean;
import com.charles.shop.common.domain.R;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "商品管理")
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public R<PageBean<Product>> listAll(@RequestParam(defaultValue = "1") Integer pageNum,
                                        @RequestParam(defaultValue = "10") Integer pageSize){
        return R.ok(productService.listAll(pageNum,pageSize));
    }
}
