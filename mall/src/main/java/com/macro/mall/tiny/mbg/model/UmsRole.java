package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsRole")
@Data
@Table(name = "ums_role")
public class UmsRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 名称
     */
    @ApiModelProperty(value="name名称")
    private String name;

    /**
     * 描述
     */
    @ApiModelProperty(value="description描述")
    private String description;

    /**
     * 后台用户数量
     */
    @Column(name = "admin_count")
    @ApiModelProperty(value="adminCount后台用户数量")
    private Integer adminCount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    /**
     * 启用状态：0->禁用；1->启用
     */
    @ApiModelProperty(value="status启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value="sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}