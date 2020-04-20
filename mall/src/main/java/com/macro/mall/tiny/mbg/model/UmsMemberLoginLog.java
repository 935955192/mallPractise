package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberLoginLog")
@Data
@Table(name = "ums_member_login_log")
public class UmsMemberLoginLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @ApiModelProperty(value="ip")
    private String ip;

    @ApiModelProperty(value="city")
    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    @Column(name = "login_type")
    @ApiModelProperty(value="loginType登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    @ApiModelProperty(value="province")
    private String province;

    private static final long serialVersionUID = 1L;
}