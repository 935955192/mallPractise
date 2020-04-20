package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsBrand")
@Data
@Table(name = "pms_brand")
public class PmsBrand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    /**
     * 首字母
     */
    @Column(name = "first_letter")
    @ApiModelProperty(value="firstLetter首字母")
    private String firstLetter;

    @ApiModelProperty(value="sort")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @Column(name = "factory_status")
    @ApiModelProperty(value="factoryStatus是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @Column(name = "product_count")
    @ApiModelProperty(value="productCount产品数量")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @Column(name = "product_comment_count")
    @ApiModelProperty(value="productCommentCount产品评论数量")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @ApiModelProperty(value="logo品牌logo")
    private String logo;

    /**
     * 专区大图
     */
    @Column(name = "big_pic")
    @ApiModelProperty(value="bigPic专区大图")
    private String bigPic;

    /**
     * 品牌故事
     */
    @Column(name = "brand_story")
    @ApiModelProperty(value="brandStory品牌故事")
    private String brandStory;

    private static final long serialVersionUID = 1L;
}