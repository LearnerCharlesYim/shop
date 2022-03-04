package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * create table pms_product_attribute_value
 * (
 * id                   bigint not null auto_increment,
 * product_id           bigint comment '商品id',
 * product_attribute_id bigint comment '商品属性id',
 * value                varchar(64) comment '手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开',
 * primary key (id)
 * );
 */
@Entity
@Table(name = "pms_product_attribute_value")
@Data
@ApiModel("商品属性值表")
public class AttributeValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("商品id")
    private Long productId;

    @ApiModelProperty("商品属性id")
    private Long productAttributeId;

    @ApiModelProperty("手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;
}
