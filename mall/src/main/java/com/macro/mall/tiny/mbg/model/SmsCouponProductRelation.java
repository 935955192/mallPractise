package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsCouponProductRelation")
@Data
@Table(name = "sms_coupon_product_relation")
public class SmsCouponProductRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "coupon_id")
    @ApiModelProperty(value="couponId")
    private Long couponId;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    @ApiModelProperty(value="productName商品名称")
    private String productName;

    /**
     * 商品编码
     */
    @Column(name = "product_sn")
    @ApiModelProperty(value="productSn商品编码")
    private String productSn;

    private static final long serialVersionUID = 1L;
}