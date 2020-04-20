package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsMemberPrice")
@Data
@Table(name = "pms_member_price")
public class PmsMemberPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "member_level_id")
    @ApiModelProperty(value="memberLevelId")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @Column(name = "member_price")
    @ApiModelProperty(value="memberPrice会员价格")
    private BigDecimal memberPrice;

    @Column(name = "member_level_name")
    @ApiModelProperty(value="memberLevelName")
    private String memberLevelName;

    private static final long serialVersionUID = 1L;
}