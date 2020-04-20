package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.CmsSubjectProductRelation")
@Data
@Table(name = "cms_subject_product_relation")
public class CmsSubjectProductRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "subject_id")
    @ApiModelProperty(value="subjectId")
    private Long subjectId;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    private static final long serialVersionUID = 1L;
}