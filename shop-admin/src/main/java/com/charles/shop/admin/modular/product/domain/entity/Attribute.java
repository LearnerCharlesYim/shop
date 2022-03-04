package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * create table pms_product_attribute
 * (
 *    id                   bigint not null auto_increment,
 *    product_attribute_category_id bigint comment '商品属性分类id',
 *    name                 varchar(64) comment '名称',
 *    select_type          int(1) comment '属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；',
 *    input_type           int(1) comment '属性录入方式：0->手工录入；1->从列表中选取',
 *    input_list           varchar(255) comment '可选值列表，以逗号隔开',
 *    sort                 int comment '排序字段：最高的可以单独上传图片',
 *    filter_type          int(1) comment '分类筛选样式：0->普通；1->颜色',
 *    search_type          int(1) comment '检索类型；0->不需要进行检索；1->关键字检索；2->范围检索',
 *    related_status       int(1) comment '相同属性产品是否关联；0->不关联；1->关联',
 *    hand_add_status      int(1) comment '是否支持手动新增；0->不支持；1->支持',
 *    type                 int(1) comment '属性的类型；0->规格；1->参数',
 *    primary key (id)
 * );
 */
@Entity
@Table(name="pms_product_attribute")
@Data
@ApiModel("商品属性表")
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("商品属性分类id")
    private Long productAttributeCategoryId;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同")
    private Integer selectType;

    @ApiModelProperty("属性录入方式：0->手工录入；1->从列表中选取")
    private Integer inputType;

    @ApiModelProperty("可选值列表，以逗号隔开")
    private String inputList;

    @ApiModelProperty("排序字段：最高的可以单独上传图片")
    private Integer sort;

    @ApiModelProperty("分类筛选样式：0->普通；1->颜色")
    private Integer filterType;

    @ApiModelProperty("检索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    private Integer searchType;

    @ApiModelProperty("相同属性产品是否关联；0->不关联；1->关联")
    private Integer relatedStatus;

    @ApiModelProperty("是否支持手动新增；0->不支持；1->支持")
    private Integer handAddStatus;

    @ApiModelProperty("属性的类型；0->规格；1->参数")
    private Integer type;

}
