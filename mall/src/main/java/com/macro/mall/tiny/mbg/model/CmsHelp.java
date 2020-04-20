package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsHelp")
@Data
@Table(name = "cms_help")
public class CmsHelp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "category_id")
    @ApiModelProperty(value="categoryId")
    private Long categoryId;

    @ApiModelProperty(value="icon")
    private String icon;

    /**
     * 名称
     */
    @ApiModelProperty(value="title名称")
    private String title;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @Column(name = "read_count")
    @ApiModelProperty(value="readCount")
    private Integer readCount;

    @ApiModelProperty(value="content")
    private String content;

    private static final long serialVersionUID = 1L;
}