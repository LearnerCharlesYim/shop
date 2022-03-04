package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * create table pms_product_attribute_category
 * (
 *    id                   bigint not null auto_increment,
 *    name                 varchar(64) comment '名称',
 *    attribute_count      int comment '属性数量',
 *    param_count          int comment '参数数量',
 *    primary key (id)
 * );
 */
@Entity
@Table(name="pms_product_attribute_category")
@Data
@ApiModel("商品属性分类表")
public class AttributeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("属性名称")
    private String name;

    @ApiModelProperty("属性数量")
    private Integer attributeCount;

    @ApiModelProperty("参数数量")
    private Integer paramCount;

}
