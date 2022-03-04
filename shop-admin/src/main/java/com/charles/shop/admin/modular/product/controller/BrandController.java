package com.charles.shop.admin.modular.product.controller;

import com.charles.shop.admin.modular.product.domain.dto.BrandParam;
import com.charles.shop.admin.modular.product.domain.entity.Brand;
import com.charles.shop.admin.modular.product.service.BrandService;
import com.charles.shop.common.domain.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "商品品牌管理")
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @ApiOperation("获取全部品牌列表")
    @GetMapping("/listAll")
    public R<List<Brand>> getList() {
        return R.ok(brandService.listAllBrand());
    }

    @ApiOperation("品牌添加")
    @PostMapping
    public R<Void> add(@Validated @RequestBody BrandParam brandParam){
        brandService.createBrand(brandParam);
        return R.ok();
    }
}
