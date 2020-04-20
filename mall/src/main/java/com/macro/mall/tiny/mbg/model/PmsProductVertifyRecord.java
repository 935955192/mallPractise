package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsProductVertifyRecord")
@Data
@Table(name = "pms_product_vertify_record")
public class PmsProductVertifyRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    /**
     * 审核人
     */
    @Column(name = "vertify_man")
    @ApiModelProperty(value="vertifyMan审核人")
    private String vertifyMan;

    @ApiModelProperty(value="status")
    private Integer status;

    /**
     * 反馈详情
     */
    @ApiModelProperty(value="detail反馈详情")
    private String detail;

    private static final long serialVersionUID = 1L;
}