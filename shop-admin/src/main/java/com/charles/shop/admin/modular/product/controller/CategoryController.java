package com.charles.shop.admin.modular.product.controller;

import com.charles.shop.admin.modular.product.domain.dto.CategoryDto;
import com.charles.shop.admin.modular.product.domain.entity.Category;
import com.charles.shop.admin.modular.product.service.CategoryService;
import com.charles.shop.common.domain.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @RequestMapping("/tree")
    public R<List<CategoryDto>> tree() {
        return R.ok(categoryService.treeList2());
    }
}
