package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductCategoryAttributeRelation")
@Data
@Table(name = "pms_product_category_attribute_relation")
public class PmsProductCategoryAttributeRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_category_id")
    @ApiModelProperty(value="productCategoryId")
    private Long productCategoryId;

    @Column(name = "product_attribute_id")
    @ApiModelProperty(value="productAttributeId")
    private Long productAttributeId;

    private static final long serialVersionUID = 1L;
}