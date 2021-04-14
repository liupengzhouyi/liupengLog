package cn.liupeng.liupenglog.controller.atom;

import cn.liupeng.liupenglog.entity.LiupengLink;
import cn.liupeng.liupenglog.service.LiupengLinkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文档表(LiupengLink)表控制层
 *
 * @author liupeng
 * @since 2021-04-14 13:10:51
 */
@Api(tags = {"Link文章管理"})
@RestController
@RequestMapping("liupengLink")
public class LiupengLinkController {
    /**
     * 服务对象
     */
    @Resource
    private LiupengLinkService liupengLinkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询一个Link文章", notes = "080001")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengLink selectOne(@RequestBody Integer id) {
        return this.liupengLinkService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation(value = "查询所有Link文章", notes = "080002")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengLink> selectAll() {
        return this.liupengLinkService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation(value = "添加一个Link文章", notes = "080003")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengLink addOne(@RequestBody LiupengLink liupengLink) {
        System.out.println(liupengLink.toString());
        return this.liupengLinkService.insert(liupengLink);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation(value = "删除一个Link文章", notes = "080004")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody LiupengLink liupengLink) {
        return this.liupengLinkService.deleteById(liupengLink.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengLink
     */
    @ApiOperation(value = "Link文章更新数据", notes = "080005")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengLink update(@RequestBody LiupengLink liupengLink) {
        return this.liupengLinkService.update(liupengLink);
    }


}
