package cn.liupeng.liupenglog.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 图片表(LiupengImg)实体类
 *
 * @author liupeng
 * @since 2021-04-13 23:43:51
 */
@ApiModel(value = "LiupengImg")
public class LiupengImg implements Serializable {
    private static final long serialVersionUID = -89924109966630625L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 上传时间
     */
    @ApiModelProperty(value = "上传时间", notes = "上传时间")
    private String uploadDateTime;
    /**
     * 路径
     */
    @ApiModelProperty(value = "路径", notes = "路径")
    private String path;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", notes = "名称")
    private String name;
    /**
     * 图片概要
     */
    @ApiModelProperty(value = "图片概要", notes = "图片概要")
    private String abstract;
    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除", notes = "是否删除")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(String uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbstract() {
        return abstract
    }

    public void setAbstract(String abstract) {
        this. abstract =abstract
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
