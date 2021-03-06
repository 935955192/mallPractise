package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberTag")
@Data
@Table(name = "ums_member_tag")
public class UmsMemberTag implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    @Column(name = "finish_order_count")
    @ApiModelProperty(value="finishOrderCount自动打标签完成订单数量")
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    @Column(name = "finish_order_amount")
    @ApiModelProperty(value="finishOrderAmount自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

    private static final long serialVersionUID = 1L;
}