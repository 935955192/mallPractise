package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductAttributeCategory")
@Data
@Table(name = "pms_product_attribute_category")
public class PmsProductAttributeCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 属性数量
     */
    @Column(name = "attribute_count")
    @ApiModelProperty(value="attributeCount属性数量")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @Column(name = "param_count")
    @ApiModelProperty(value="paramCount参数数量")
    private Integer paramCount;

    private static final long serialVersionUID = 1L;
}