package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * create table pms_product_category_attribute_relation
 * (
 *    id                   bigint not null auto_increment,
 *    product_category_id  bigint comment '商品分类id',
 *    product_attribute_id bigint comment '商品属性id',
 *    primary key (id)
 * );
 */
@Entity
@Table(name = "pms_product_category_attribute_relation")
@Data
@ApiModel("商品分类和属性的关系表")
public class CategoryAttributeRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;


    @ApiModelProperty("商品分类id")
    private Long productCategoryId;

    @ApiModelProperty("商品属性id")
    private Long productAttributeId;
}
