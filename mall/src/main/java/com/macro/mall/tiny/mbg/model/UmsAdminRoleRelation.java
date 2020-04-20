package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsAdminRoleRelation")
@Data
@Table(name = "ums_admin_role_relation")
public class UmsAdminRoleRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "admin_id")
    @ApiModelProperty(value="adminId")
    private Long adminId;

    @Column(name = "role_id")
    @ApiModelProperty(value="roleId")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}