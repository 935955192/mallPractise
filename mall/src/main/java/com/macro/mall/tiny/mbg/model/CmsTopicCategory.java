package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsTopicCategory")
@Data
@Table(name = "cms_topic_category")
public class CmsTopicCategory implements Serializable {
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
    @Column(name = "subject_count")
    @ApiModelProperty(value="subjectCount专题数量")
    private Integer subjectCount;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    @ApiModelProperty(value="sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}