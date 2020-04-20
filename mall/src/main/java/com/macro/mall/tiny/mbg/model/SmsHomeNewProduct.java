package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsHomeNewProduct")
@Data
@Table(name = "sms_home_new_product")
public class SmsHomeNewProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "product_name")
    @ApiModelProperty(value="productName")
    private String productName;

    @Column(name = "recommend_status")
    @ApiModelProperty(value="recommendStatus")
    private Integer recommendStatus;

    @ApiModelProperty(value="sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}