package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsCommentReplay")
@Data
@Table(name = "pms_comment_replay")
public class PmsCommentReplay implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "comment_id")
    @ApiModelProperty(value="commentId")
    private Long commentId;

    @Column(name = "member_nick_name")
    @ApiModelProperty(value="memberNickName")
    private String memberNickName;

    @Column(name = "member_icon")
    @ApiModelProperty(value="memberIcon")
    private String memberIcon;

    @ApiModelProperty(value="content")
    private String content;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    @ApiModelProperty(value="type评论人员类型；0->会员；1->管理员")
    private Integer type;

    private static final long serialVersionUID = 1L;
}