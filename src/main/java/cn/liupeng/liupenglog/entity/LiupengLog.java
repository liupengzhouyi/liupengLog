package cn.liupeng.liupenglog.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 日志表(LiupengLog)实体类
 *
 * @author liupeng
 * @since 2021-04-14 13:11:50
 */
@ApiModel(value = "LiupengLog")
public class LiupengLog implements Serializable {
    private static final long serialVersionUID = 384828275680535104L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", notes = "名称")
    private String name;
    /**
     * 概要
     */
    @ApiModelProperty(value = "概要", notes = "概要")
    private String logAbstract;
    /**
     * 发布时间
     */
    @ApiModelProperty(value = "发布时间", notes = "发布时间")
    private String uploadDateTime;
    /**
     * 文章描述ID
     */
    @ApiModelProperty(value = "文章描述ID", notes = "文章描述ID")
    private Integer linkid;
    /**
     * 称号
     */
    @ApiModelProperty(value = "称号", notes = "称号")
    private Integer bigName;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogAbstract() {
        return logAbstract;
    }

    public void setLogAbstract(String logAbstract) {
        this.logAbstract = logAbstract;
    }

    public String getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(String uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public Integer getBigName() {
        return bigName;
    }

    public void setBigName(Integer bigName) {
        this.bigName = bigName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
