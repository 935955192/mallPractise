package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsSkuStock")
@Data
@Table(name = "pms_sku_stock")
public class PmsSkuStock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    /**
     * sku编码
     */
    @Column(name = "sku_code")
    @ApiModelProperty(value="skuCodesku编码")
    private String skuCode;

    @ApiModelProperty(value="price")
    private BigDecimal price;

    /**
     * 库存
     */
    @ApiModelProperty(value="stock库存")
    private Integer stock;

    /**
     * 预警库存
     */
    @Column(name = "low_stock")
    @ApiModelProperty(value="lowStock预警库存")
    private Integer lowStock;

    /**
     * 销售属性1
     */
    @ApiModelProperty(value="sp1销售属性1")
    private String sp1;

    @ApiModelProperty(value="sp2")
    private String sp2;

    @ApiModelProperty(value="sp3")
    private String sp3;

    /**
     * 展示图片
     */
    @ApiModelProperty(value="pic展示图片")
    private String pic;

    /**
     * 销量
     */
    @ApiModelProperty(value="sale销量")
    private Integer sale;

    /**
     * 单品促销价格
     */
    @Column(name = "promotion_price")
    @ApiModelProperty(value="promotionPrice单品促销价格")
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    @Column(name = "lock_stock")
    @ApiModelProperty(value="lockStock锁定库存")
    private Integer lockStock;

    private static final long serialVersionUID = 1L;
}