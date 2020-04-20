package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsFlashPromotionLog")
@Data
@Table(name = "sms_flash_promotion_log")
public class SmsFlashPromotionLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Integer id;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Integer memberId;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "member_phone")
    @ApiModelProperty(value="memberPhone")
    private String memberPhone;

    @Column(name = "product_name")
    @ApiModelProperty(value="productName")
    private String productName;

    /**
     * 会员订阅时间
     */
    @Column(name = "subscribe_time")
    @ApiModelProperty(value="subscribeTime会员订阅时间")
    private Date subscribeTime;

    @Column(name = "send_time")
    @ApiModelProperty(value="sendTime")
    private Date sendTime;

    private static final long serialVersionUID = 1L;
}