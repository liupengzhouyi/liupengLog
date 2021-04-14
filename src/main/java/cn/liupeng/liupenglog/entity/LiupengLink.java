package cn.liupeng.liupenglog.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 文档表(LiupengLink)实体类
 *
 * @author liupeng
 * @since 2021-04-14 13:10:50
 */
@ApiModel(value = "LiupengLink")
public class LiupengLink implements Serializable {
    private static final long serialVersionUID = -83872302182997329L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 题目
     */
    @ApiModelProperty(value = "题目", notes = "题目")
    private String title;
    /**
     * 文档
     */
    @ApiModelProperty(value = "文档", notes = "文档")
    private String text;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "LiupengLink{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
