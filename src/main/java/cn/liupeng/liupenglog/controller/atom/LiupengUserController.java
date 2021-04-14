package cn.liupeng.liupenglog.controller.atom;

import cn.liupeng.liupenglog.entity.LiupengUser;
import cn.liupeng.liupenglog.service.LiupengUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @ApiOperation(value = "查询一个用户", notes = "100001")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengUser selectOne(@RequestBody Integer id) {
        return this.liupengUserService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation(value = "查询所有用户", notes = "100002")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengUser> selectAll() {
        return this.liupengUserService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation(value = "添加一个用户", notes = "100003")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengUser addOne(@RequestBody LiupengUser liupengUser) {
        return this.liupengUserService.insert(liupengUser);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation(value = "删除一个用户", notes = "100004")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody LiupengUser liupengUser) {
        return this.liupengUserService.deleteById(liupengUser.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengUser
     */
    @ApiOperation(value = "用户更新数据", notes = "100005")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengUser update(@RequestBody LiupengUser liupengUser) {
        return this.liupengUserService.update(liupengUser);
    }


}
