package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsIntegrationChangeHistory")
@Data
@Table(name = "ums_integration_change_history")
public class UmsIntegrationChangeHistory implements Serializable {
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

    /**
     * 改变类型：0->增加；1->减少
     */
    @Column(name = "change_type")
    @ApiModelProperty(value="changeType改变类型：0->增加；1->减少")
    private Integer changeType;

    /**
     * 积分改变数量
     */
    @Column(name = "change_count")
    @ApiModelProperty(value="changeCount积分改变数量")
    private Integer changeCount;

    /**
     * 操作人员
     */
    @Column(name = "operate_man")
    @ApiModelProperty(value="operateMan操作人员")
    private String operateMan;

    /**
     * 操作备注
     */
    @Column(name = "operate_note")
    @ApiModelProperty(value="operateNote操作备注")
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    @Column(name = "source_type")
    @ApiModelProperty(value="sourceType积分来源：0->购物；1->管理员修改")
    private Integer sourceType;

    private static final long serialVersionUID = 1L;
}