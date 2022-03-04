package com.charles.shop.admin.modular.product.domain.dto;

import com.charles.shop.admin.modular.product.domain.entity.Category;
import com.charles.shop.common.utils.TreeUtil;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto implements TreeUtil.TreeNode {

    private Long id;

    private Long parentId;

    private String name;

    private List<CategoryDto> children;

    @Override
    @SuppressWarnings("unchecked")
    public <T extends TreeUtil.TreeNode> void setChildren(List<T> children) {
        this.children = (List<CategoryDto>) children;
    }
}
