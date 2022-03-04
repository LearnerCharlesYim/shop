package com.charles.shop.admin.modular.product.service;

import com.charles.shop.admin.modular.product.domain.dto.BrandParam;
import com.charles.shop.admin.modular.product.domain.entity.Brand;
import com.charles.shop.admin.modular.product.repository.BrandRepository;
import com.charles.shop.common.domain.ResultCode;
import com.charles.shop.common.exception.Asserts;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

    public List<Brand> listAllBrand() {
        return brandRepository.findAll();
    }

    public void createBrand(BrandParam brandParam) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandParam, brand);
        try {
            brandRepository.save(brand);
        } catch (Exception e) {
            Asserts.fail(ResultCode.DATABASE_ERROR);
        }
    }
}
