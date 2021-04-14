package cn.liupeng.liupenglog.controller.atom;

import cn.liupeng.liupenglog.entity.LiupengFlog;
import cn.liupeng.liupenglog.service.LiupengFlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Flag表(LiupengFlog)表控制层
 *
 * @author liupeng
 * @since 2021-04-14 13:07:59
 */
@Api(tags = {"Flag管理"})
@RestController
@RequestMapping("liupengFlog")
public class LiupengFlogController {
    /**
     * 服务对象
     */
    @Resource
    private LiupengFlogService liupengFlogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询一个Flag", notes = "060001")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengFlog selectOne(Integer id) {
        return this.liupengFlogService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation(value = "查询所有Flag", notes = "060002")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengFlog> selectAll() {
        return this.liupengFlogService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation(value = "添加一个Flag", notes = "060003")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengFlog addOne(LiupengFlog liupengFlog) {
        return this.liupengFlogService.insert(liupengFlog);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation(value = "删除一个Flag", notes = "060004")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(LiupengFlog liupengFlog) {
        return this.liupengFlogService.deleteById(liupengFlog.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengFlog
     */
    @ApiOperation(value = "Flag更新数据", notes = "060005")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengFlog update(LiupengFlog liupengFlog) {
        return this.liupengFlogService.update(liupengFlog);
    }


}
