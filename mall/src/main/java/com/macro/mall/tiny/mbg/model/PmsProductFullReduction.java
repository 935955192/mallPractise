package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductFullReduction")
@Data
@Table(name = "pms_product_full_reduction")
public class PmsProductFullReduction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "full_price")
    @ApiModelProperty(value="fullPrice")
    private BigDecimal fullPrice;

    @Column(name = "reduce_price")
    @ApiModelProperty(value="reducePrice")
    private BigDecimal reducePrice;

    private static final long serialVersionUID = 1L;
}