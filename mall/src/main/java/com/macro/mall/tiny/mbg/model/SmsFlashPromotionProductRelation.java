package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsFlashPromotionProductRelation")
@Data
@Table(name = "sms_flash_promotion_product_relation")
public class SmsFlashPromotionProductRelation implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id编号")
    private Long id;

    @Column(name = "flash_promotion_id")
    @ApiModelProperty(value="flashPromotionId")
    private Long flashPromotionId;

    /**
     * 编号
     */
    @Column(name = "flash_promotion_session_id")
    @ApiModelProperty(value="flashPromotionSessionId编号")
    private Long flashPromotionSessionId;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    /**
     * 限时购价格
     */
    @Column(name = "flash_promotion_price")
    @ApiModelProperty(value="flashPromotionPrice限时购价格")
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    @Column(name = "flash_promotion_count")
    @ApiModelProperty(value="flashPromotionCount限时购数量")
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    @Column(name = "flash_promotion_limit")
    @ApiModelProperty(value="flashPromotionLimit每人限购数量")
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    @ApiModelProperty(value="sort排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}