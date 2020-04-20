package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsHomeAdvertise")
@Data
@Table(name = "sms_home_advertise")
public class SmsHomeAdvertise implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 轮播位置：0->PC首页轮播；1->app首页轮播
     */
    @ApiModelProperty(value="type轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    @ApiModelProperty(value="pic")
    private String pic;

    @Column(name = "start_time")
    @ApiModelProperty(value="startTime")
    private Date startTime;

    @Column(name = "end_time")
    @ApiModelProperty(value="endTime")
    private Date endTime;

    /**
     * 上下线状态：0->下线；1->上线
     */
    @ApiModelProperty(value="status上下线状态：0->下线；1->上线")
    private Integer status;

    /**
     * 点击数
     */
    @Column(name = "click_count")
    @ApiModelProperty(value="clickCount点击数")
    private Integer clickCount;

    /**
     * 下单数
     */
    @Column(name = "order_count")
    @ApiModelProperty(value="orderCount下单数")
    private Integer orderCount;

    /**
     * 链接地址
     */
    @ApiModelProperty(value="url链接地址")
    private String url;

    /**
     * 备注
     */
    @ApiModelProperty(value="note备注")
    private String note;

    /**
     * 排序
     */
    @ApiModelProperty(value="sort排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}