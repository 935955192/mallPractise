package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsFeightTemplate")
@Data
@Table(name = "pms_feight_template")
public class PmsFeightTemplate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    @Column(name = "charge_type")
    @ApiModelProperty(value="chargeType计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    /**
     * 首重kg
     */
    @Column(name = "first_weight")
    @ApiModelProperty(value="firstWeight首重kg")
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    @Column(name = "first_fee")
    @ApiModelProperty(value="firstFee首费（元）")
    private BigDecimal firstFee;

    @Column(name = "continue_weight")
    @ApiModelProperty(value="continueWeight")
    private BigDecimal continueWeight;

    @Column(name = "continme_fee")
    @ApiModelProperty(value="continmeFee")
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    @ApiModelProperty(value="dest目的地（省、市）")
    private String dest;

    private static final long serialVersionUID = 1L;
}