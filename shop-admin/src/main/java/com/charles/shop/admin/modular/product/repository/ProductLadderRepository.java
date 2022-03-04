package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.ProductLadder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductLadderRepository extends JpaRepository<ProductLadder, Long>, JpaSpecificationExecutor<ProductLadder> {
}
