package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductCategory")
@Data
@Table(name = "pms_product_category")
public class PmsProductCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @Column(name = "parent_id")
    @ApiModelProperty(value="parentId上机分类的编号：0表示一级分类")
    private Long parentId;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @ApiModelProperty(value="level分类级别：0->1级；1->2级")
    private Integer level;

    @Column(name = "product_count")
    @ApiModelProperty(value="productCount")
    private Integer productCount;

    @Column(name = "product_unit")
    @ApiModelProperty(value="productUnit")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @Column(name = "nav_status")
    @ApiModelProperty(value="navStatus是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @ApiModelProperty(value="sort")
    private Integer sort;

    /**
     * 图标
     */
    @ApiModelProperty(value="icon图标")
    private String icon;

    @ApiModelProperty(value="keywords")
    private String keywords;

    /**
     * 描述
     */
    @ApiModelProperty(value="description描述")
    private String description;

    private static final long serialVersionUID = 1L;
}