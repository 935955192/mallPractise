package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.SmsHomeRecommendSubject")
@Data
@Table(name = "sms_home_recommend_subject")
public class SmsHomeRecommendSubject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "subject_id")
    @ApiModelProperty(value="subjectId")
    private Long subjectId;

    @Column(name = "subject_name")
    @ApiModelProperty(value="subjectName")
    private String subjectName;

    @Column(name = "recommend_status")
    @ApiModelProperty(value="recommendStatus")
    private Integer recommendStatus;

    @ApiModelProperty(value="sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}