package cn.liupeng.liupenglog.controller;

import cn.liupeng.liupenglog.entity.LiupengImg;
import cn.liupeng.liupenglog.service.LiupengImgService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 图片表(LiupengImg)表控制层
 *
 * @author liupeng
 * @since 2021-04-13 23:43:56
 */
@Api(tags = {"管理图片"})
@RestController
@RequestMapping("liupengImg")
public class LiupengImgController {
    /**
     * 服务对象
     */
    @Resource
    private LiupengImgService liupengImgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个图片")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengImg selectOne(Integer id) {
        return this.liupengImgService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有图片")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<LiupengImg> selectAll() {
        return this.liupengImgService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个图片")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengImg addOne(LiupengImg liupengImg) {
        return this.liupengImgService.insert(liupengImg);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个图片")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(LiupengImg liupengImg) {
        return this.liupengImgService.deleteById(liupengImg.getId());
    }

    /**
     * 删除一条数据
     *
     * @return LiupengImg
     */
    @ApiOperation("更新数据图片")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LiupengImg update(LiupengImg liupengImg) {
        return this.liupengImgService.update(liupengImg);
    }


}
