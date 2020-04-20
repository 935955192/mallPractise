package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsPermission")
@Data
@Table(name = "ums_permission")
public class UmsPermission implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 父级权限id
     */
    @ApiModelProperty(value="pid父级权限id")
    private Long pid;

    /**
     * 名称
     */
    @ApiModelProperty(value="name名称")
    private String name;

    /**
     * 权限值
     */
    @ApiModelProperty(value="value权限值")
    private String value;

    /**
     * 图标
     */
    @ApiModelProperty(value="icon图标")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @ApiModelProperty(value="type权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * 前端资源路径
     */
    @ApiModelProperty(value="uri前端资源路径")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @ApiModelProperty(value="status启用状态；0->禁用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    /**
     * 排序
     */
    @ApiModelProperty(value="sort排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}