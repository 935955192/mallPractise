package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductOperateLog")
@Data
@Table(name = "pms_product_operate_log")
public class PmsProductOperateLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "price_old")
    @ApiModelProperty(value="priceOld")
    private BigDecimal priceOld;

    @Column(name = "price_new")
    @ApiModelProperty(value="priceNew")
    private BigDecimal priceNew;

    @Column(name = "sale_price_old")
    @ApiModelProperty(value="salePriceOld")
    private BigDecimal salePriceOld;

    @Column(name = "sale_price_new")
    @ApiModelProperty(value="salePriceNew")
    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     */
    @Column(name = "gift_point_old")
    @ApiModelProperty(value="giftPointOld赠送的积分")
    private Integer giftPointOld;

    @Column(name = "gift_point_new")
    @ApiModelProperty(value="giftPointNew")
    private Integer giftPointNew;

    @Column(name = "use_point_limit_old")
    @ApiModelProperty(value="usePointLimitOld")
    private Integer usePointLimitOld;

    @Column(name = "use_point_limit_new")
    @ApiModelProperty(value="usePointLimitNew")
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    @Column(name = "operate_man")
    @ApiModelProperty(value="operateMan操作人")
    private String operateMan;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}