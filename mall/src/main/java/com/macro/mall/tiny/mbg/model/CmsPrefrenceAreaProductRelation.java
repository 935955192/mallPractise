package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsPrefrenceAreaProductRelation")
@Data
@Table(name = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "prefrence_area_id")
    @ApiModelProperty(value="prefrenceAreaId")
    private Long prefrenceAreaId;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    private static final long serialVersionUID = 1L;
}