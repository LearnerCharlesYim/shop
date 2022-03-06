package com.charles.shop.admin.modular.product.controller;

import com.charles.shop.admin.modular.product.domain.dto.CategoryDto;
import com.charles.shop.admin.modular.product.domain.dto.CategoryQuery;
import com.charles.shop.admin.modular.product.domain.entity.Category;
import com.charles.shop.admin.modular.product.service.CategoryService;
import com.charles.shop.common.domain.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/tree")
    public R<List<CategoryDto>> tree() {
        return R.ok(categoryService.treeList2());
    }

    @GetMapping("/one")
    public R<List<Category>> findOne(){
        return R.ok(categoryService.findOne());
    }

    @PostMapping
    public R<List<Category>> query(@RequestBody(required = false) CategoryQuery categoryQuery){
        return R.ok(categoryService.query(categoryQuery));
    }
}
