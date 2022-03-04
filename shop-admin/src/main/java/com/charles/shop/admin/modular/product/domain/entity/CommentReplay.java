package com.charles.shop.admin.modular.product.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pms_comment_replay")
@Data
@ApiModel("产品评价回复表")
public class CommentReplay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Long id;

    private Long commentId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    @CreationTimestamp
    private Date createTime;

    @ApiModelProperty(value = "评论人员类型；0->会员；1->管理员")
    private Integer type;

}