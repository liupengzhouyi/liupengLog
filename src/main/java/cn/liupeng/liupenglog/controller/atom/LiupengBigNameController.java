package cn.liupeng.liupenglog.controller.atom;

import cn.liupeng.liupenglog.entity.LiupengBigName;
import cn.liupeng.liupenglog.service.LiupengBigNameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 称号表(LiupengBigName)表控制层
 *
 * @author liupeng
 * @since 2021-04-14 13:23:05
 */
@Api(tags = {"称号管理"})
@RestController
@RequestMapping("liupengBigName")
public class LiupengBigNameController {
    /**
     * 服务对象
     */
    @Resource
    private LiupengBigNameService liupengBigNameService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询一个称号", notes = "050001")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengBigName selectOne(@RequestBody Integer id) {
        return this.liupengBigNameService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation(value = "查询所有称号", notes = "050002")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengBigName> selectAll() {
        return this.liupengBigNameService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation(value = "添加一个称号", notes = "050003")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengBigName addOne(@RequestBody LiupengBigName liupengBigName) {
        return this.liupengBigNameService.insert(liupengBigName);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation(value = "删除一个称号", notes = "050004")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody LiupengBigName liupengBigName) {
        return this.liupengBigNameService.deleteById(liupengBigName.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengBigName
     */
    @ApiOperation(value = "称号更新数据", notes = "050005")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengBigName update(@RequestBody LiupengBigName liupengBigName) {
        return this.liupengBigNameService.update(liupengBigName);
    }


}
