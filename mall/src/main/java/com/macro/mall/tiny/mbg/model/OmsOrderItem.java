package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.OmsOrderItem")
@Data
@Table(name = "oms_order_item")
public class OmsOrderItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    @ApiModelProperty(value="orderId订单id")
    private Long orderId;

    /**
     * 订单编号
     */
    @Column(name = "order_sn")
    @ApiModelProperty(value="orderSn订单编号")
    private String orderSn;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "product_pic")
    @ApiModelProperty(value="productPic")
    private String productPic;

    @Column(name = "product_name")
    @ApiModelProperty(value="productName")
    private String productName;

    @Column(name = "product_brand")
    @ApiModelProperty(value="productBrand")
    private String productBrand;

    @Column(name = "product_sn")
    @ApiModelProperty(value="productSn")
    private String productSn;

    /**
     * 销售价格
     */
    @Column(name = "product_price")
    @ApiModelProperty(value="productPrice销售价格")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @Column(name = "product_quantity")
    @ApiModelProperty(value="productQuantity购买数量")
    private Integer productQuantity;

    /**
     * 商品sku编号
     */
    @Column(name = "product_sku_id")
    @ApiModelProperty(value="productSkuId商品sku编号")
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    @Column(name = "product_sku_code")
    @ApiModelProperty(value="productSkuCode商品sku条码")
    private String productSkuCode;

    /**
     * 商品分类id
     */
    @Column(name = "product_category_id")
    @ApiModelProperty(value="productCategoryId商品分类id")
    private Long productCategoryId;

    /**
     * 商品的销售属性
     */
    @ApiModelProperty(value="sp1商品的销售属性")
    private String sp1;

    @ApiModelProperty(value="sp2")
    private String sp2;

    @ApiModelProperty(value="sp3")
    private String sp3;

    /**
     * 商品促销名称
     */
    @Column(name = "promotion_name")
    @ApiModelProperty(value="promotionName商品促销名称")
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    @Column(name = "promotion_amount")
    @ApiModelProperty(value="promotionAmount商品促销分解金额")
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @Column(name = "coupon_amount")
    @ApiModelProperty(value="couponAmount优惠券优惠分解金额")
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    @Column(name = "integration_amount")
    @ApiModelProperty(value="integrationAmount积分优惠分解金额")
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @Column(name = "real_amount")
    @ApiModelProperty(value="realAmount该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @Column(name = "gift_integration")
    @ApiModelProperty(value="giftIntegration")
    private Integer giftIntegration;

    @Column(name = "gift_growth")
    @ApiModelProperty(value="giftGrowth")
    private Integer giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @Column(name = "product_attr")
    @ApiModelProperty(value="productAttr商品销售属性:[{\"key\":\"颜色\",\"value\":\"颜色\"},{\"key\":\"容量\",\"value\":\"4G\"}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}