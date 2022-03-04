package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pms_product_vertify_record")
@Data
@ApiModel("产品评价回复表")
public class ProductVertifyRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    private Long productId;

    private Date createTime;

    @ApiModelProperty(value = "审核人")
    private String vertifyMan;

    @ApiModelProperty(value = "审核后的状态：0->未通过,1,审核中,2->已通过")
    private Integer status;

    @ApiModelProperty(value = "反馈详情")
    private String detail;
}