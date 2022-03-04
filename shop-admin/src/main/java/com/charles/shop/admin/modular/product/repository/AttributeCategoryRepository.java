package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.AttributeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AttributeCategoryRepository extends JpaRepository<AttributeCategory, Long>, JpaSpecificationExecutor<AttributeCategory> {
}
