package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductLadder")
@Data
@Table(name = "pms_product_ladder")
public class PmsProductLadder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    /**
     * 满足的商品数量
     */
    @ApiModelProperty(value="count满足的商品数量")
    private Integer count;

    /**
     * 折扣
     */
    @ApiModelProperty(value="discount折扣")
    private BigDecimal discount;

    /**
     * 折后价格
     */
    @ApiModelProperty(value="price折后价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}