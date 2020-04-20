package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsAdminPermissionRelation")
@Data
@Table(name = "ums_admin_permission_relation")
public class UmsAdminPermissionRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "admin_id")
    @ApiModelProperty(value="adminId")
    private Long adminId;

    @Column(name = "permission_id")
    @ApiModelProperty(value="permissionId")
    private Long permissionId;

    @ApiModelProperty(value="type")
    private Integer type;

    private static final long serialVersionUID = 1L;
}