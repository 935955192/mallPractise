package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberLevel")
@Data
@Table(name = "ums_member_level")
public class UmsMemberLevel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    @Column(name = "growth_point")
    @ApiModelProperty(value="growthPoint")
    private Integer growthPoint;

    /**
     * 是否为默认等级：0->不是；1->是
     */
    @Column(name = "default_status")
    @ApiModelProperty(value="defaultStatus是否为默认等级：0->不是；1->是")
    private Integer defaultStatus;

    /**
     * 免运费标准
     */
    @Column(name = "free_freight_point")
    @ApiModelProperty(value="freeFreightPoint免运费标准")
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    @Column(name = "comment_growth_point")
    @ApiModelProperty(value="commentGrowthPoint每次评价获取的成长值")
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    @Column(name = "priviledge_free_freight")
    @ApiModelProperty(value="priviledgeFreeFreight是否有免邮特权")
    private Integer priviledgeFreeFreight;

    /**
     * 是否有签到特权
     */
    @Column(name = "priviledge_sign_in")
    @ApiModelProperty(value="priviledgeSignIn是否有签到特权")
    private Integer priviledgeSignIn;

    /**
     * 是否有评论获奖励特权
     */
    @Column(name = "priviledge_comment")
    @ApiModelProperty(value="priviledgeComment是否有评论获奖励特权")
    private Integer priviledgeComment;

    /**
     * 是否有专享活动特权
     */
    @Column(name = "priviledge_promotion")
    @ApiModelProperty(value="priviledgePromotion是否有专享活动特权")
    private Integer priviledgePromotion;

    /**
     * 是否有会员价格特权
     */
    @Column(name = "priviledge_member_price")
    @ApiModelProperty(value="priviledgeMemberPrice是否有会员价格特权")
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @Column(name = "priviledge_birthday")
    @ApiModelProperty(value="priviledgeBirthday是否有生日特权")
    private Integer priviledgeBirthday;

    @ApiModelProperty(value="note")
    private String note;

    private static final long serialVersionUID = 1L;
}