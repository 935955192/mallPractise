package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsAdmin")
@Data
@Table(name = "ums_admin")
public class UmsAdmin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="username")
    private String username;

    @ApiModelProperty(value="password")
    private String password;

    /**
     * 头像
     */
    @ApiModelProperty(value="icon头像")
    private String icon;

    /**
     * 邮箱
     */
    @ApiModelProperty(value="email邮箱")
    private String email;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    @ApiModelProperty(value="nickName昵称")
    private String nickName;

    /**
     * 备注信息
     */
    @ApiModelProperty(value="note备注信息")
    private String note;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    @ApiModelProperty(value="loginTime最后登录时间")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @ApiModelProperty(value="status帐号启用状态：0->禁用；1->启用")
    private Integer status;

    private static final long serialVersionUID = 1L;
}