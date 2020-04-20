package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsSubject")
@Data
@Table(name = "cms_subject")
public class CmsSubject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "category_id")
    @ApiModelProperty(value="categoryId")
    private Long categoryId;

    @ApiModelProperty(value="title")
    private String title;

    /**
     * 专题主图
     */
    @ApiModelProperty(value="pic专题主图")
    private String pic;

    /**
     * 关联产品数量
     */
    @Column(name = "product_count")
    @ApiModelProperty(value="productCount关联产品数量")
    private Integer productCount;

    @Column(name = "recommend_status")
    @ApiModelProperty(value="recommendStatus")
    private Integer recommendStatus;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @Column(name = "collect_count")
    @ApiModelProperty(value="collectCount")
    private Integer collectCount;

    @Column(name = "read_count")
    @ApiModelProperty(value="readCount")
    private Integer readCount;

    @Column(name = "comment_count")
    @ApiModelProperty(value="commentCount")
    private Integer commentCount;

    /**
     * 画册图片用逗号分割
     */
    @Column(name = "album_pics")
    @ApiModelProperty(value="albumPics画册图片用逗号分割")
    private String albumPics;

    @ApiModelProperty(value="description")
    private String description;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus显示状态：0->不显示；1->显示")
    private Integer showStatus;

    /**
     * 转发数
     */
    @Column(name = "forward_count")
    @ApiModelProperty(value="forwardCount转发数")
    private Integer forwardCount;

    /**
     * 专题分类名称
     */
    @Column(name = "category_name")
    @ApiModelProperty(value="categoryName专题分类名称")
    private String categoryName;

    @ApiModelProperty(value="content")
    private String content;

    private static final long serialVersionUID = 1L;
}