package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.UmsMember")
@Data
@Table(name = "ums_member")
public class UmsMember implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "member_level_id")
    @ApiModelProperty(value="memberLevelId")
    private Long memberLevelId;

    /**
     * 用户名
     */
    @ApiModelProperty(value="username用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value="password密码")
    private String password;

    /**
     * 昵称
     */
    @ApiModelProperty(value="nickname昵称")
    private String nickname;

    /**
     * 手机号码
     */
    @ApiModelProperty(value="phone手机号码")
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    @ApiModelProperty(value="status帐号启用状态:0->禁用；1->启用")
    private Integer status;

    /**
     * 注册时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime注册时间")
    private Date createTime;

    /**
     * 头像
     */
    @ApiModelProperty(value="icon头像")
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    @ApiModelProperty(value="gender性别：0->未知；1->男；2->女")
    private Integer gender;

    /**
     * 生日
     */
    @ApiModelProperty(value="birthday生日")
    private Date birthday;

    /**
     * 所做城市
     */
    @ApiModelProperty(value="city所做城市")
    private String city;

    /**
     * 职业
     */
    @ApiModelProperty(value="job职业")
    private String job;

    /**
     * 个性签名
     */
    @Column(name = "personalized_signature")
    @ApiModelProperty(value="personalizedSignature个性签名")
    private String personalizedSignature;

    /**
     * 用户来源
     */
    @Column(name = "source_type")
    @ApiModelProperty(value="sourceType用户来源")
    private Integer sourceType;

    /**
     * 积分
     */
    @ApiModelProperty(value="integration积分")
    private Integer integration;

    /**
     * 成长值
     */
    @ApiModelProperty(value="growth成长值")
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    @Column(name = "luckey_count")
    @ApiModelProperty(value="luckeyCount剩余抽奖次数")
    private Integer luckeyCount;

    /**
     * 历史积分数量
     */
    @Column(name = "history_integration")
    @ApiModelProperty(value="historyIntegration历史积分数量")
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;
}