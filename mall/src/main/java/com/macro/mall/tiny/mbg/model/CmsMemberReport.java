package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsMemberReport")
@Data
@Table(name = "cms_member_report")
public class CmsMemberReport implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    @Column(name = "report_type")
    @ApiModelProperty(value="reportType举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    /**
     * 举报人
     */
    @Column(name = "report_member_name")
    @ApiModelProperty(value="reportMemberName举报人")
    private String reportMemberName;

    @Column(name = "create_time")
    @ApiModelProperty(value="createTime")
    private Date createTime;

    @Column(name = "report_object")
    @ApiModelProperty(value="reportObject")
    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    @Column(name = "report_status")
    @ApiModelProperty(value="reportStatus举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @Column(name = "handle_status")
    @ApiModelProperty(value="handleStatus处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    @ApiModelProperty(value="note")
    private String note;

    private static final long serialVersionUID = 1L;
}