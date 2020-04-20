package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsCouponProductCategoryRelation")
@Data
@Table(name = "sms_coupon_product_category_relation")
public class SmsCouponProductCategoryRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "coupon_id")
    @ApiModelProperty(value="couponId")
    private Long couponId;

    @Column(name = "product_category_id")
    @ApiModelProperty(value="productCategoryId")
    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    @Column(name = "product_category_name")
    @ApiModelProperty(value="productCategoryName产品分类名称")
    private String productCategoryName;

    /**
     * 父分类名称
     */
    @Column(name = "parent_category_name")
    @ApiModelProperty(value="parentCategoryName父分类名称")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;
}