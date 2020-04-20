package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsAdminLoginLog")
@Data
@Table(name = "ums_admin_login_log")
public class UmsAdminLoginLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "admin_id")
    @ApiModelProperty(value="adminId")
    private Long adminId;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @ApiModelProperty(value="ip")
    private String ip;

    @ApiModelProperty(value="address")
    private String address;

    /**
     * 浏览器登录类型
     */
    @Column(name = "user_agent")
    @ApiModelProperty(value="userAgent浏览器登录类型")
    private String userAgent;

    private static final long serialVersionUID = 1L;
}