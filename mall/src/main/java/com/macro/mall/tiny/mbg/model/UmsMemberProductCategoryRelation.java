package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberProductCategoryRelation")
@Data
@Table(name = "ums_member_product_category_relation")
public class UmsMemberProductCategoryRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    @Column(name = "product_category_id")
    @ApiModelProperty(value="productCategoryId")
    private Long productCategoryId;

    private static final long serialVersionUID = 1L;
}