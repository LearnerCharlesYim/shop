package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.SkuStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SkuStockRepository extends JpaRepository<SkuStock, Long>, JpaSpecificationExecutor<SkuStock> {
}
