package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.CategoryAttributeRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryAttributeRelationRepository extends JpaRepository<CategoryAttributeRelation, Long>, JpaSpecificationExecutor<CategoryAttributeRelation> {
}
