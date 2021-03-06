package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsCouponHistory")
@Data
@Table(name = "sms_coupon_history")
public class SmsCouponHistory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "coupon_id")
    @ApiModelProperty(value="couponId")
    private Long couponId;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    @Column(name = "coupon_code")
    @ApiModelProperty(value="couponCode")
    private String couponCode;

    /**
     * 领取人昵称
     */
    @Column(name = "member_nickname")
    @ApiModelProperty(value="memberNickname领取人昵称")
    private String memberNickname;

    /**
     * 获取类型：0->后台赠送；1->主动获取
     */
    @Column(name = "get_type")
    @ApiModelProperty(value="getType获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    /**
     * 使用状态：0->未使用；1->已使用；2->已过期
     */
    @Column(name = "use_status")
    @ApiModelProperty(value="useStatus使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    /**
     * 使用时间
     */
    @Column(name = "use_time")
    @ApiModelProperty(value="useTime使用时间")
    private Date useTime;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    @ApiModelProperty(value="orderId订单编号")
    private Long orderId;

    /**
     * 订单号码
     */
    @Column(name = "order_sn")
    @ApiModelProperty(value="orderSn订单号码")
    private String orderSn;

    private static final long serialVersionUID = 1L;
}