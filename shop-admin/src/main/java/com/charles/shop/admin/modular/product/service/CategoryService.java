package com.charles.shop.admin.modular.product.service;

import com.charles.shop.admin.modular.product.domain.dto.CategoryDto;
import com.charles.shop.admin.modular.product.domain.dto.CategoryQuery;
import com.charles.shop.admin.modular.product.domain.entity.Category;
import com.charles.shop.admin.modular.product.repository.CategoryRepository;
import com.charles.shop.common.domain.jpa.QueryHelp;
import com.charles.shop.common.utils.TreeUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> listAllCategory() {
        return categoryRepository.findAll();
    }

    public List<Category> treeList() {
        List<Category> categories = categoryRepository.findAll();
        return TreeUtil.generateTree(categories);
    }

    public List<CategoryDto> treeList2() {
        List<Category> categories = categoryRepository.findAll();
        return TreeUtil.generateTree(categories, CategoryDto.class);
    }

    public List<Category> findOne() {
        return categoryRepository.findByLevelOrderBySort(0);
    }

    public List<Category> query(CategoryQuery categoryQuery) {
        if (categoryQuery == null) return categoryRepository.findAll();
        return categoryRepository.findAll(((root, criteria, cb) -> QueryHelp.getPredicate(root, categoryQuery, cb)));
    }
}
