package cn.liupeng.liupenglog.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 称号表(LiupengBigName)实体类
 *
 * @author liupeng
 * @since 2021-04-14 13:23:04
 */
@ApiModel(value = "LiupengBigName")
public class LiupengBigName implements Serializable {
    private static final long serialVersionUID = -35239965541466347L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 称号
     */
    @ApiModelProperty(value = "称号", notes = "称号")
    private String name;


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

}
