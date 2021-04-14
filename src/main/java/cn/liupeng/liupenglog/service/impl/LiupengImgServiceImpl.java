package cn.liupeng.liupenglog.service.impl;

import cn.liupeng.liupenglog.entity.LiupengImg;
import cn.liupeng.liupenglog.dao.LiupengImgDao;
import cn.liupeng.liupenglog.service.LiupengImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片表(LiupengImg)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-14 13:09:35
 */
@Service("liupengImgService")
public class LiupengImgServiceImpl implements LiupengImgService {
    @Resource
    private LiupengImgDao liupengImgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LiupengImg queryById(Integer id) {
        return this.liupengImgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LiupengImg> queryAllByLimit(int offset, int limit) {
        return this.liupengImgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<LiupengImg> queryAll() {
        return this.liupengImgDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param liupengImg 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengImg insert(LiupengImg liupengImg) {
        this.liupengImgDao.insert(liupengImg);
        return liupengImg;
    }

    /**
     * 修改数据
     *
     * @param liupengImg 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengImg update(LiupengImg liupengImg) {
        this.liupengImgDao.update(liupengImg);
        return this.queryById(liupengImg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.liupengImgDao.deleteById(id) > 0;
    }
}
