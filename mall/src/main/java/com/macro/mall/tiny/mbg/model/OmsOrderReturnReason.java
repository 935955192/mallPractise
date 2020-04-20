package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.OmsOrderReturnReason")
@Data
@Table(name = "oms_order_return_reason")
public class OmsOrderReturnReason implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 退货类型
     */
    @ApiModelProperty(value="name退货类型")
    private String name;

    @ApiModelProperty(value="sort")
    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    @ApiModelProperty(value="status状态：0->不启用；1->启用")
    private Integer status;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime添加时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}