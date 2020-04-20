package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsHelpCategory")
@Data
@Table(name = "cms_help_category")
public class CmsHelpCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 分类图标
     */
    @ApiModelProperty(value="icon分类图标")
    private String icon;

    /**
     * 专题数量
     */
    @Column(name = "help_count")
    @ApiModelProperty(value="helpCount专题数量")
    private Integer helpCount;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    @ApiModelProperty(value="sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}