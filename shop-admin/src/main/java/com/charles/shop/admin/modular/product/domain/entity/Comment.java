package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pms_comment")
@Data
@ApiModel("商品评价表")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    @ApiModelProperty(value = "评价星数：0->5")
    private Integer star;

    @ApiModelProperty(value = "评价的ip")
    private String memberIp;

    @CreationTimestamp
    private Date createTime;

    private Integer showStatus;

    @ApiModelProperty(value = "购买时的商品属性")
    private String productAttribute;

    private Integer collectCount;

    private Integer readCount;

    @ApiModelProperty(value = "上传图片地址，以逗号隔开")
    private String pics;

    @ApiModelProperty(value = "评论用户头像")
    private String memberIcon;

    private Integer replayCount;

    @Lob
    private String content;
}