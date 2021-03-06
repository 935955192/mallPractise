package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberStatisticsInfo")
@Data
@Table(name = "ums_member_statistics_info")
public class UmsMemberStatisticsInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    /**
     * 累计消费金额
     */
    @Column(name = "consume_amount")
    @ApiModelProperty(value="consumeAmount累计消费金额")
    private BigDecimal consumeAmount;

    /**
     * 订单数量
     */
    @Column(name = "order_count")
    @ApiModelProperty(value="orderCount订单数量")
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    @Column(name = "coupon_count")
    @ApiModelProperty(value="couponCount优惠券数量")
    private Integer couponCount;

    /**
     * 评价数
     */
    @Column(name = "comment_count")
    @ApiModelProperty(value="commentCount评价数")
    private Integer commentCount;

    /**
     * 退货数量
     */
    @Column(name = "return_order_count")
    @ApiModelProperty(value="returnOrderCount退货数量")
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    @ApiModelProperty(value="loginCount登录次数")
    private Integer loginCount;

    /**
     * 关注数量
     */
    @Column(name = "attend_count")
    @ApiModelProperty(value="attendCount关注数量")
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    @Column(name = "fans_count")
    @ApiModelProperty(value="fansCount粉丝数量")
    private Integer fansCount;

    @Column(name = "collect_product_count")
    @ApiModelProperty(value="collectProductCount")
    private Integer collectProductCount;

    @Column(name = "collect_subject_count")
    @ApiModelProperty(value="collectSubjectCount")
    private Integer collectSubjectCount;

    @Column(name = "collect_topic_count")
    @ApiModelProperty(value="collectTopicCount")
    private Integer collectTopicCount;

    @Column(name = "collect_comment_count")
    @ApiModelProperty(value="collectCommentCount")
    private Integer collectCommentCount;

    @Column(name = "invite_friend_count")
    @ApiModelProperty(value="inviteFriendCount")
    private Integer inviteFriendCount;

    /**
     * 最后一次下订单时间
     */
    @Column(name = "recent_order_time")
    @ApiModelProperty(value="recentOrderTime最后一次下订单时间")
    private Date recentOrderTime;

    private static final long serialVersionUID = 1L;
}