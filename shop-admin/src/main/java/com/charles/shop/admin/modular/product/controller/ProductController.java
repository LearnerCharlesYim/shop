package com.charles.shop.admin.modular.product.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "商品管理")
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
}
