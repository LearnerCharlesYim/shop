package com.charles.shop.admin.modular.product.domain.entity;

import com.charles.shop.common.utils.TreeUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * create table pms_product_category
 * (
 * id                   bigint not null auto_increment,
 * parent_id            bigint comment '上级分类的编号：0表示一级分类',
 * name                 varchar(64) comment '名称',
 * level                int(1) comment '分类级别：0->1级；1->2级',
 * product_count        int comment '商品数量',
 * product_unit         varchar(64) comment '商品单位',
 * nav_status           int(1) comment '是否显示在导航栏：0->不显示；1->显示',
 * show_status          int(1) comment '显示状态：0->不显示；1->显示',
 * sort                 int comment '排序',
 * icon                 varchar(255) comment '图标',
 * keywords             varchar(255) comment '关键字',
 * description          text comment '描述',
 * primary key (id)
 * );
 */
@Entity
@Table(name = "pms_product_category")
@Data
@ApiModel("商品分类表")
public class Category implements TreeUtil.TreeNode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("上级分类的编号：0表示一级分类")
    private Long parentId;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("分类级别：0->1级；1->2级")
    private Integer level;

    @ApiModelProperty("商品数量")
    private Integer productCount;

    @ApiModelProperty("商品单位")
    private String productUnit;

    @ApiModelProperty("是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    @ApiModelProperty("显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("关键字")
    private String keywords;

    @ApiModelProperty("描述")
    @Lob
    private String description;

    @Transient
    private List<Category> children;

    @Override
    @SuppressWarnings("unchecked")
    public <T extends TreeUtil.TreeNode> void setChildren(List<T> children) {
        this.children = (List<Category>) children;
    }
}
