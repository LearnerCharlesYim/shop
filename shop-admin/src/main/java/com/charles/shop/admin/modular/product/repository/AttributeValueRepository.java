package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.AttributeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AttributeValueRepository extends JpaRepository<AttributeValue, Long>, JpaSpecificationExecutor<AttributeValue> {
}
