package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pms_product_full_reduction")
@Data
@ApiModel("商品满减表")
public class ProductFullReduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("商品id")
    private Long productId;

    @ApiModelProperty("商品满足金额")
    private BigDecimal fullPrice;

    @ApiModelProperty("商品减少金额")
    private BigDecimal reducePrice;
}