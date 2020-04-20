package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberMemberTagRelation")
@Data
@Table(name = "ums_member_member_tag_relation")
public class UmsMemberMemberTagRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    @Column(name = "tag_id")
    @ApiModelProperty(value="tagId")
    private Long tagId;

    private static final long serialVersionUID = 1L;
}