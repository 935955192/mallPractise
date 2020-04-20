package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsTopicComment")
@Data
@Table(name = "cms_topic_comment")
public class CmsTopicComment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_nick_name")
    @ApiModelProperty(value="memberNickName")
    private String memberNickName;

    @Column(name = "topic_id")
    @ApiModelProperty(value="topicId")
    private Long topicId;

    @Column(name = "member_icon")
    @ApiModelProperty(value="memberIcon")
    private String memberIcon;

    @ApiModelProperty(value="content")
    private String content;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @Column(name = "show_status")
    @ApiModelProperty(value="showStatus")
    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}