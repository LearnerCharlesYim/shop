package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * create table pms_product
 * (
 * id                   bigint not null auto_increment,
 * brand_id             bigint comment '品牌id',
 * product_category_id  bigint comment '品牌分类id',
 * feight_template_id   bigint comment '运费模版id',
 * product_attribute_category_id bigint comment '品牌属性分类id',
 * name                 varchar(64) not null comment '商品名称',
 * pic                  varchar(255) comment '图片',
 * product_sn           varchar(64) not null comment '货号',
 * delete_status        int(1) comment '删除状态：0->未删除；1->已删除',
 * publish_status       int(1) comment '上架状态：0->下架；1->上架',
 * new_status           int(1) comment '新品状态:0->不是新品；1->新品',
 * recommend_status     int(1) comment '推荐状态；0->不推荐；1->推荐',
 * verify_status        int(1) comment '审核状态：0->未审核；1->审核通过',
 * sort                 int comment '排序',
 * sale                 int comment '销量',
 * price                decimal(10,2) comment '价格',
 * promotion_price      decimal(10,2) comment '促销价格',
 * gift_growth          int default 0 comment '赠送的成长值',
 * gift_point           int default 0 comment '赠送的积分',
 * use_point_limit      int comment '限制使用的积分数',
 * sub_title            varchar(255) comment '副标题',
 * description          text comment '商品描述',
 * original_price       decimal(10,2) comment '市场价',
 * stock                int comment '库存',
 * low_stock            int comment '库存预警值',
 * unit                 varchar(16) comment '单位',
 * weight               decimal(10,2) comment '商品重量，默认为克',
 * preview_status       int(1) comment '是否为预告商品：0->不是；1->是',
 * service_ids          varchar(64) comment '以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮',
 * keywords             varchar(255) comment '关键字',
 * note                 varchar(255) comment '备注',
 * album_pics           varchar(255) comment '画册图片，连产品图片限制为5张，以逗号分割',
 * detail_title         varchar(255) comment '详情标题',
 * detail_desc          text comment '详情描述',
 * detail_html          text comment '产品详情网页内容',
 * detail_mobile_html   text comment '移动端网页详情',
 * promotion_start_time datetime comment '促销开始时间',
 * promotion_end_time   datetime comment '促销结束时间',
 * promotion_per_limit  int comment '活动限购数量',
 * promotion_type       int(1) comment '促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购',
 * product_category_name varchar(255) comment '产品分类名称',
 * brand_name           varchar(255) comment '品牌名称',
 * primary key (id)
 * );
 */
@Entity
@Table(name = "pms_product")
@Data
@ApiModel("商品表")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "品牌分类id")
    private Long productCategoryId;

    @ApiModelProperty(value = "运费模版id")
    private Long feightTemplateId;

    @ApiModelProperty(value = "品牌属性分类id")
    private Long productAttributeCategoryId;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "图片")
    private String pic;

    @ApiModelProperty(value = "货号")
    private String productSn;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "上架状态：0->下架；1->上架")
    private Integer publishStatus;

    @ApiModelProperty(value = "新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    @ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐")
    private Integer recommendStatus;

    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "促销价格")
    private BigDecimal promotionPrice;

    @ApiModelProperty(value = "赠送的成长值")
    private Integer giftGrowth;

    @ApiModelProperty(value = "赠送的积分")
    private Integer giftPoint;

    @ApiModelProperty(value = "限制使用的积分数")
    private Integer usePointLimit;

    @ApiModelProperty(value = "副标题")
    private String subTitle;

    @ApiModelProperty(value = "市场价")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "库存预警值")
    private Integer lowStock;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "商品重量，默认为克")
    private BigDecimal weight;

    @ApiModelProperty(value = "是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    @ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    @ApiModelProperty(value = "关键字")
    private String keywords;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    @ApiModelProperty(value = "详情标题")
    private String detailTitle;

    @ApiModelProperty(value = "促销开始时间")
    private Date promotionStartTime;

    @ApiModelProperty(value = "促销结束时间")
    private Date promotionEndTime;

    @ApiModelProperty(value = "活动限购数量")
    private Integer promotionPerLimit;

    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "商品分类名称")
    private String productCategoryName;

    @ApiModelProperty(value = "商品描述")
    @Lob
    private String description;

    @ApiModelProperty(value = "详情描述")
    @Lob
    private String detailDesc;

    @ApiModelProperty(value = "产品详情网页内容")
    @Lob
    private String detailHtml;

    @ApiModelProperty(value = "移动端网页详情")
    @Lob
    private String detailMobileHtml;
}
