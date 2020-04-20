package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsTopic")
@Data
@Table(name = "cms_topic")
public class CmsTopic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "category_id")
    @ApiModelProperty(value="categoryId")
    private Long categoryId;

    @ApiModelProperty(value="name")
    private String name;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @Column(name = "start_time")
    @ApiModelProperty(value="startTime")
    private Date startTime;

    @Column(name = "end_time")
    @ApiModelProperty(value="endTime")
    private Date endTime;

    /**
     * 参与人数
     */
    @Column(name = "attend_count")
    @ApiModelProperty(value="attendCount参与人数")
    private Integer attendCount;

    /**
     * 关注人数
     */
    @Column(name = "attention_count")
    @ApiModelProperty(value="attentionCount关注人数")
    private Integer attentionCount;

    @Column(name = "read_count")
    @ApiModelProperty(value="readCount")
    private Integer readCount;

    /**
     * 奖品名称
     */
    @Column(name = "award_name")
    @ApiModelProperty(value="awardName奖品名称")
    private String awardName;

    /**
     * 参与方式
     */
    @Column(name = "attend_type")
    @ApiModelProperty(value="attendType参与方式")
    private String attendType;

    /**
     * 话题内容
     */
    @ApiModelProperty(value="content话题内容")
    private String content;

    private static final long serialVersionUID = 1L;
}