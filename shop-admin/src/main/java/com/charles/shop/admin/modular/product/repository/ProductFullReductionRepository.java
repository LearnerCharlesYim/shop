package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.ProductFullReduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductFullReductionRepository extends JpaRepository<ProductFullReduction, Long>, JpaSpecificationExecutor<ProductFullReduction> {
}
