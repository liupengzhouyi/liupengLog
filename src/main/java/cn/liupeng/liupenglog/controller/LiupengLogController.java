package cn.liupeng.liupenglog.controller;

import cn.liupeng.liupenglog.entity.LiupengLog;
import cn.liupeng.liupenglog.service.LiupengLogService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 日志表(LiupengLog)表控制层
 *
 * @author liupeng
 * @since 2021-04-14 13:11:51
 */
@Api(tags = {"Log管理"})
@RestController
@RequestMapping("liupengLog")
public class LiupengLogController {
    /**
     * 服务对象
     */
    @Resource
    private LiupengLogService liupengLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个Log")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengLog selectOne(Integer id) {
        return this.liupengLogService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有Log")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengLog> selectAll() {
        return this.liupengLogService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个Log")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengLog addOne(LiupengLog liupengLog) {
        return this.liupengLogService.insert(liupengLog);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个Log")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(LiupengLog liupengLog) {
        return this.liupengLogService.deleteById(liupengLog.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengLog
     */
    @ApiOperation("Log更新数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengLog update(LiupengLog liupengLog) {
        return this.liupengLogService.update(liupengLog);
    }


}
