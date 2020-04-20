package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsCoupon")
@Data
@Table(name = "sms_coupon")
public class SmsCoupon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     */
    @ApiModelProperty(value="type优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 使用平台：0->全部；1->移动；2->PC
     */
    @ApiModelProperty(value="platform使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    /**
     * 数量
     */
    @ApiModelProperty(value="count数量")
    private Integer count;

    /**
     * 金额
     */
    @ApiModelProperty(value="amount金额")
    private BigDecimal amount;

    /**
     * 每人限领张数
     */
    @Column(name = "per_limit")
    @ApiModelProperty(value="perLimit每人限领张数")
    private Integer perLimit;

    /**
     * 使用门槛；0表示无门槛
     */
    @Column(name = "min_point")
    @ApiModelProperty(value="minPoint使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    @Column(name = "start_time")
    @ApiModelProperty(value="startTime")
    private Date startTime;

    @Column(name = "end_time")
    @ApiModelProperty(value="endTime")
    private Date endTime;

    /**
     * 使用类型：0->全场通用；1->指定分类；2->指定商品
     */
    @Column(name = "use_type")
    @ApiModelProperty(value="useType使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    /**
     * 备注
     */
    @ApiModelProperty(value="note备注")
    private String note;

    /**
     * 发行数量
     */
    @Column(name = "publish_count")
    @ApiModelProperty(value="publishCount发行数量")
    private Integer publishCount;

    /**
     * 已使用数量
     */
    @Column(name = "use_count")
    @ApiModelProperty(value="useCount已使用数量")
    private Integer useCount;

    /**
     * 领取数量
     */
    @Column(name = "receive_count")
    @ApiModelProperty(value="receiveCount领取数量")
    private Integer receiveCount;

    /**
     * 可以领取的日期
     */
    @Column(name = "enable_time")
    @ApiModelProperty(value="enableTime可以领取的日期")
    private Date enableTime;

    /**
     * 优惠码
     */
    @ApiModelProperty(value="code优惠码")
    private String code;

    /**
     * 可领取的会员类型：0->无限时
     */
    @Column(name = "member_level")
    @ApiModelProperty(value="memberLevel可领取的会员类型：0->无限时")
    private Integer memberLevel;

    private static final long serialVersionUID = 1L;
}