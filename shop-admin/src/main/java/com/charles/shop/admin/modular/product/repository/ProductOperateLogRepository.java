package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.ProductOperateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductOperateLogRepository extends JpaRepository<ProductOperateLog, Long>, JpaSpecificationExecutor<ProductOperateLog> {
}
