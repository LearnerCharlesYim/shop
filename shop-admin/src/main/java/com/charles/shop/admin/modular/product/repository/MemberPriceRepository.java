package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.MemberPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MemberPriceRepository extends JpaRepository<MemberPrice, Long>, JpaSpecificationExecutor<MemberPrice> {
}
