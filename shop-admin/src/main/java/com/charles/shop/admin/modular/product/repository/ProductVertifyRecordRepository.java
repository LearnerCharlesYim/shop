package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.ProductVertifyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductVertifyRecordRepository extends JpaRepository<ProductVertifyRecord, Long>, JpaSpecificationExecutor<ProductVertifyRecord> {
}
