package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsAlbum")
@Data
@Table(name = "pms_album")
public class PmsAlbum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="name")
    private String name;

    @Column(name = "cover_pic")
    @ApiModelProperty(value="coverPic")
    private String coverPic;

    @Column(name = "pic_count")
    @ApiModelProperty(value="picCount")
    private Integer picCount;

    @ApiModelProperty(value="sort")
    private Integer sort;

    @ApiModelProperty(value="description")
    private String description;

    private static final long serialVersionUID = 1L;
}