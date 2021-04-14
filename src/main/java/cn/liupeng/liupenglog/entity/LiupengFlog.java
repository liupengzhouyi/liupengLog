package cn.liupeng.liupenglog.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Flag表(LiupengFlog)实体类
 *
 * @author liupeng
 * @since 2021-04-14 13:07:58
 */
@ApiModel(value = "LiupengFlog")
public class LiupengFlog implements Serializable {
    private static final long serialVersionUID = 907365766546833102L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * Flag名称
     */
    @ApiModelProperty(value = "Flag名称", notes = "Flag名称")
    private String name;
    /**
     * Flag概要
     */
    @ApiModelProperty(value = "Flag概要", notes = "Flag概要")
    private String flogAbstruct;
    /**
     * 开始日期
     */
    @ApiModelProperty(value = "开始日期", notes = "开始日期")
    private String stratDate;
    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间", notes = "结束时间")
    private String endDate;
    /**
     * 是否开始
     */
    @ApiModelProperty(value = "是否开始", notes = "是否开始")
    private Integer isStart;
    /**
     * 是否结束
     */
    @ApiModelProperty(value = "是否结束", notes = "是否结束")
    private Integer isEnd;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", notes = "用户ID")
    private Integer userId;
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

    public String getFlogAbstruct() {
        return flogAbstruct;
    }

    public void setFlogAbstruct(String flogAbstruct) {
        this.flogAbstruct = flogAbstruct;
    }

    public String getStratDate() {
        return stratDate;
    }

    public void setStratDate(String stratDate) {
        this.stratDate = stratDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getIsStart() {
        return isStart;
    }

    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }

    public Integer getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
