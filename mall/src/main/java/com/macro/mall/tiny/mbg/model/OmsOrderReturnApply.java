package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.OmsOrderReturnApply")
@Data
@Table(name = "oms_order_return_apply")
public class OmsOrderReturnApply implements Serializable {
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
     * 收货地址表id
     */
    @Column(name = "company_address_id")
    @ApiModelProperty(value="companyAddressId收货地址表id")
    private Long companyAddressId;

    /**
     * 退货商品id
     */
    @Column(name = "product_id")
    @ApiModelProperty(value="productId退货商品id")
    private Long productId;

    /**
     * 订单编号
     */
    @Column(name = "order_sn")
    @ApiModelProperty(value="orderSn订单编号")
    private String orderSn;

    /**
     * 申请时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime申请时间")
    private Date createTime;

    /**
     * 会员用户名
     */
    @Column(name = "member_username")
    @ApiModelProperty(value="memberUsername会员用户名")
    private String memberUsername;

    /**
     * 退款金额
     */
    @Column(name = "return_amount")
    @ApiModelProperty(value="returnAmount退款金额")
    private BigDecimal returnAmount;

    /**
     * 退货人姓名
     */
    @Column(name = "return_name")
    @ApiModelProperty(value="returnName退货人姓名")
    private String returnName;

    /**
     * 退货人电话
     */
    @Column(name = "return_phone")
    @ApiModelProperty(value="returnPhone退货人电话")
    private String returnPhone;

    /**
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     */
    @ApiModelProperty(value="status申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    /**
     * 处理时间
     */
    @Column(name = "handle_time")
    @ApiModelProperty(value="handleTime处理时间")
    private Date handleTime;

    /**
     * 商品图片
     */
    @Column(name = "product_pic")
    @ApiModelProperty(value="productPic商品图片")
    private String productPic;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    @ApiModelProperty(value="productName商品名称")
    private String productName;

    /**
     * 商品品牌
     */
    @Column(name = "product_brand")
    @ApiModelProperty(value="productBrand商品品牌")
    private String productBrand;

    /**
     * 商品销售属性：颜色：红色；尺码：xl;
     */
    @Column(name = "product_attr")
    @ApiModelProperty(value="productAttr商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;

    /**
     * 退货数量
     */
    @Column(name = "product_count")
    @ApiModelProperty(value="productCount退货数量")
    private Integer productCount;

    /**
     * 商品单价
     */
    @Column(name = "product_price")
    @ApiModelProperty(value="productPrice商品单价")
    private BigDecimal productPrice;

    /**
     * 商品实际支付单价
     */
    @Column(name = "product_real_price")
    @ApiModelProperty(value="productRealPrice商品实际支付单价")
    private BigDecimal productRealPrice;

    /**
     * 原因
     */
    @ApiModelProperty(value="reason原因")
    private String reason;

    /**
     * 描述
     */
    @ApiModelProperty(value="description描述")
    private String description;

    /**
     * 凭证图片，以逗号隔开
     */
    @Column(name = "proof_pics")
    @ApiModelProperty(value="proofPics凭证图片，以逗号隔开")
    private String proofPics;

    /**
     * 处理备注
     */
    @Column(name = "handle_note")
    @ApiModelProperty(value="handleNote处理备注")
    private String handleNote;

    /**
     * 处理人员
     */
    @Column(name = "handle_man")
    @ApiModelProperty(value="handleMan处理人员")
    private String handleMan;

    /**
     * 收货人
     */
    @Column(name = "receive_man")
    @ApiModelProperty(value="receiveMan收货人")
    private String receiveMan;

    /**
     * 收货时间
     */
    @Column(name = "receive_time")
    @ApiModelProperty(value="receiveTime收货时间")
    private Date receiveTime;

    /**
     * 收货备注
     */
    @Column(name = "receive_note")
    @ApiModelProperty(value="receiveNote收货备注")
    private String receiveNote;

    private static final long serialVersionUID = 1L;
}