package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsHomeBrand")
@Data
@Table(name = "sms_home_brand")
public class SmsHomeBrand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "brand_id")
    @ApiModelProperty(value="brandId")
    private Long brandId;

    @Column(name = "brand_name")
    @ApiModelProperty(value="brandName")
    private String brandName;

    @Column(name = "recommend_status")
    @ApiModelProperty(value="recommendStatus")
    private Integer recommendStatus;

    @ApiModelProperty(value="sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}