package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.OmsOrderOperateHistory")
@Data
@Table(name = "oms_order_operate_history")
public class OmsOrderOperateHistory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    @ApiModelProperty(value="orderId订单id")
    private Long orderId;

    /**
     * 操作人：用户；系统；后台管理员
     */
    @Column(name = "operate_man")
    @ApiModelProperty(value="operateMan操作人：用户；系统；后台管理员")
    private String operateMan;

    /**
     * 操作时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime操作时间")
    private Date createTime;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @Column(name = "order_status")
    @ApiModelProperty(value="orderStatus订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer orderStatus;

    /**
     * 备注
     */
    @ApiModelProperty(value="note备注")
    private String note;

    private static final long serialVersionUID = 1L;
}