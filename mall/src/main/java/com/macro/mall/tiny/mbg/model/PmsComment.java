package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsComment")
@Data
@Table(name = "pms_comment")
public class PmsComment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "member_nick_name")
    @ApiModelProperty(value="memberNickName")
    private String memberNickName;

    @Column(name = "product_name")
    @ApiModelProperty(value="productName")
    private String productName;

    /**
     * 评价星数：0->5
     */
    @ApiModelProperty(value="star评价星数：0->5")
    private Integer star;

    /**
     * 评价的ip
     */
    @Column(name = "member_ip")
    @ApiModelProperty(value="memberIp评价的ip")
    private String memberIp;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    @Column(name = "product_attribute")
    @ApiModelProperty(value="productAttribute购买时的商品属性")
    private String productAttribute;

    @Column(name = "collect_couont")
    @ApiModelProperty(value="collectCouont")
    private Integer collectCouont;

    @Column(name = "read_count")
    @ApiModelProperty(value="readCount")
    private Integer readCount;

    /**
     * 上传图片地址，以逗号隔开
     */
    @ApiModelProperty(value="pics上传图片地址，以逗号隔开")
    private String pics;

    /**
     * 评论用户头像
     */
    @Column(name = "member_icon")
    @ApiModelProperty(value="memberIcon评论用户头像")
    private String memberIcon;

    @Column(name = "replay_count")
    @ApiModelProperty(value="replayCount")
    private Integer replayCount;

    @ApiModelProperty(value="content")
    private String content;

    private static final long serialVersionUID = 1L;
}