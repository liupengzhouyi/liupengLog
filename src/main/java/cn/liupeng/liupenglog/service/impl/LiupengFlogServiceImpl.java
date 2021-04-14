package cn.liupeng.liupenglog.service.impl;

import cn.liupeng.liupenglog.entity.LiupengFlog;
import cn.liupeng.liupenglog.dao.LiupengFlogDao;
import cn.liupeng.liupenglog.service.LiupengFlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Flag表(LiupengFlog)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-14 13:07:58
 */
@Service("liupengFlogService")
public class LiupengFlogServiceImpl implements LiupengFlogService {
    @Resource
    private LiupengFlogDao liupengFlogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LiupengFlog queryById(Integer id) {
        return this.liupengFlogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LiupengFlog> queryAllByLimit(int offset, int limit) {
        return this.liupengFlogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<LiupengFlog> queryAll() {
        return this.liupengFlogDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param liupengFlog 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengFlog insert(LiupengFlog liupengFlog) {
        this.liupengFlogDao.insert(liupengFlog);
        return liupengFlog;
    }

    /**
     * 修改数据
     *
     * @param liupengFlog 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengFlog update(LiupengFlog liupengFlog) {
        this.liupengFlogDao.update(liupengFlog);
        return this.queryById(liupengFlog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.liupengFlogDao.deleteById(id) > 0;
    }
}
