package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsRolePermissionRelation")
@Data
@Table(name = "ums_role_permission_relation")
public class UmsRolePermissionRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "role_id")
    @ApiModelProperty(value="roleId")
    private Long roleId;

    @Column(name = "permission_id")
    @ApiModelProperty(value="permissionId")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}