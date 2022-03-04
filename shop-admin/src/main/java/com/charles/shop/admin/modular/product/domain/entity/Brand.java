package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * create table pms_brand
 * (
 *    id                   bigint not null auto_increment,
 *    name                 varchar(64) comment '名称',
 *    first_letter         varchar(8) comment '首字母',
 *    sort                 int comment '排序',
 *    factory_status       int(1) comment '是否为品牌制造商：0->不是；1->是',
 *    show_status          int(1) comment '是否显示',
 *    product_count        int comment '产品数量',
 *    product_comment_count int comment '产品评论数量',
 *    logo                 varchar(255) comment '品牌logo',
 *    big_pic              varchar(255) comment '专区大图',
 *    brand_story          text comment '品牌故事',
 *    primary key (id)
 * );
 */
@Entity
@Table(name="pms_brand")
@Data
@ApiModel("商品品牌表")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("首字母")
    private String firstLetter;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    @ApiModelProperty("是否显示")
    private Integer showStatus;

    @ApiModelProperty("产品数量")
    private Integer productCount;

    @ApiModelProperty("产品评论数量")
    private Integer productCommentCount;

    @ApiModelProperty("品牌logo")
    private String logo;

    @ApiModelProperty("专区大图")
    private String bigPic;

    @ApiModelProperty("品牌故事")
    @Lob
    private String brandStory;

}
