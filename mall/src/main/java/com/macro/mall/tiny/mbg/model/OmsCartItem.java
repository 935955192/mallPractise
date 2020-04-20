package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.OmsCartItem")
@Data
@Table(name = "oms_cart_item")
public class OmsCartItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "product_id")
    @ApiModelProperty(value="productId")
    private Long productId;

    @Column(name = "product_sku_id")
    @ApiModelProperty(value="productSkuId")
    private Long productSkuId;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    /**
     * 购买数量
     */
    @ApiModelProperty(value="quantity购买数量")
    private Integer quantity;

    /**
     * 添加到购物车的价格
     */
    @ApiModelProperty(value="price添加到购物车的价格")
    private BigDecimal price;

    /**
     * 销售属性1
     */
    @ApiModelProperty(value="sp1销售属性1")
    private String sp1;

    /**
     * 销售属性2
     */
    @ApiModelProperty(value="sp2销售属性2")
    private String sp2;

    /**
     * 销售属性3
     */
    @ApiModelProperty(value="sp3销售属性3")
    private String sp3;

    /**
     * 商品主图
     */
    @Column(name = "product_pic")
    @ApiModelProperty(value="productPic商品主图")
    private String productPic;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    @ApiModelProperty(value="productName商品名称")
    private String productName;

    /**
     * 商品副标题（卖点）
     */
    @Column(name = "product_sub_title")
    @ApiModelProperty(value="productSubTitle商品副标题（卖点）")
    private String productSubTitle;

    /**
     * 商品sku条码
     */
    @Column(name = "product_sku_code")
    @ApiModelProperty(value="productSkuCode商品sku条码")
    private String productSkuCode;

    /**
     * 会员昵称
     */
    @Column(name = "member_nickname")
    @ApiModelProperty(value="memberNickname会员昵称")
    private String memberNickname;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    @ApiModelProperty(value="createDate创建时间")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "modify_date")
    @ApiModelProperty(value="modifyDate修改时间")
    private Date modifyDate;

    /**
     * 是否删除
     */
    @Column(name = "delete_status")
    @ApiModelProperty(value="deleteStatus是否删除")
    private Integer deleteStatus;

    /**
     * 商品分类
     */
    @Column(name = "product_category_id")
    @ApiModelProperty(value="productCategoryId商品分类")
    private Long productCategoryId;

    @Column(name = "product_brand")
    @ApiModelProperty(value="productBrand")
    private String productBrand;

    @Column(name = "product_sn")
    @ApiModelProperty(value="productSn")
    private String productSn;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @Column(name = "product_attr")
    @ApiModelProperty(value="productAttr商品销售属性:[{key:颜色,value:颜色},{key:容量,value:4G}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}