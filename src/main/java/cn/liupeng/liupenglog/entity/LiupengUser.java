package cn.liupeng.liupenglog.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户表(LiupengUser)实体类
 *
 * @author liupeng
 * @since 2021-04-14 12:59:51
 */
@ApiModel(value = "LiupengUser")
public class LiupengUser implements Serializable {
    private static final long serialVersionUID = 691970215584309428L;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", notes = "用户ID")
    private Integer id;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名", notes = "姓名")
    private String name;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", notes = "密码")
    private String password;
    /**
     * 是否注销用户
     */
    @ApiModelProperty(value = "是否注销用户", notes = "是否注销用户")
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
