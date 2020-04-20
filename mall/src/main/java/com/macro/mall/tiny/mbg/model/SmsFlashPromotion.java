package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsFlashPromotion")
@Data
@Table(name = "sms_flash_promotion")
public class SmsFlashPromotion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="title")
    private String title;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    @ApiModelProperty(value="startDate开始日期")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    @ApiModelProperty(value="endDate结束日期")
    private Date endDate;

    /**
     * 上下线状态
     */
    @ApiModelProperty(value="status上下线状态")
    private Integer status;

    /**
     * 秒杀时间段名称
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime秒杀时间段名称")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}