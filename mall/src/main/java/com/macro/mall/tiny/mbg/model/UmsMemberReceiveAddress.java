package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMemberReceiveAddress")
@Data
@Table(name = "ums_member_receive_address")
public class UmsMemberReceiveAddress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_id")
    @ApiModelProperty(value="memberId")
    private Long memberId;

    /**
     * 收货人名称
     */
    @ApiModelProperty(value="name收货人名称")
    private String name;

    @Column(name = "phone_number")
    @ApiModelProperty(value="phoneNumber")
    private String phoneNumber;

    /**
     * 是否为默认
     */
    @Column(name = "default_status")
    @ApiModelProperty(value="defaultStatus是否为默认")
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    @Column(name = "post_code")
    @ApiModelProperty(value="postCode邮政编码")
    private String postCode;

    /**
     * 省份/直辖市
     */
    @ApiModelProperty(value="province省份/直辖市")
    private String province;

    /**
     * 城市
     */
    @ApiModelProperty(value="city城市")
    private String city;

    /**
     * 区
     */
    @ApiModelProperty(value="region区")
    private String region;

    /**
     * 详细地址(街道)
     */
    @Column(name = "detail_address")
    @ApiModelProperty(value="detailAddress详细地址(街道)")
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}