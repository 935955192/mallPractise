package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@ApiModel(value="com.macro.mall.tiny.mbg.model.PmsAlbumPic")
@Data
@Table(name = "pms_album_pic")
public class PmsAlbumPic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Long id;

    @Column(name = "album_id")
    @ApiModelProperty(value="albumId")
    private Long albumId;

    @ApiModelProperty(value="pic")
    private String pic;

    private static final long serialVersionUID = 1L;
}