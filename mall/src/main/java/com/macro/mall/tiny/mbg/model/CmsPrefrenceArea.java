package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsPrefrenceArea")
@Data
@Table(name = "cms_prefrence_area")
public class CmsPrefrenceArea implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    @Column(name = "sub_title")
    @ApiModelProperty(value="subTitle")
    private String subTitle;

    @ApiModelProperty(value="sort")
    private Integer sort;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    /**
     * 展示图片
     */
    @ApiModelProperty(value="pic展示图片")
    private byte[] pic;

    private static final long serialVersionUID = 1L;
}