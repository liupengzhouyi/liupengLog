package cn.liupeng.liupenglog.controller;

import cn.liupeng.liupenglog.entity.LiupengUser;
import cn.liupeng.liupenglog.service.LiupengUserService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 用户表(LiupengUser)表控制层
 *
 * @author liupeng
 * @since 2021-04-14 13:17:44
 */
@Api(tags = {"用户管理"})
@RestController
@RequestMapping("liupengUser")
public class LiupengUserController {
    /**
     * 服务对象
     */
    @Resource
    private LiupengUserService liupengUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个用户")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengUser selectOne(Integer id) {
        return this.liupengUserService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有用户")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengUser> selectAll() {
        return this.liupengUserService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个用户")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengUser addOne(LiupengUser liupengUser) {
        return this.liupengUserService.insert(liupengUser);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个用户")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(LiupengUser liupengUser) {
        return this.liupengUserService.deleteById(liupengUser.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengUser
     */
    @ApiOperation("用户更新数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengUser update(LiupengUser liupengUser) {
        return this.liupengUserService.update(liupengUser);
    }


}
