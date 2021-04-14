package cn.liupeng.liupenglog.service.impl;

import cn.liupeng.liupenglog.entity.LiupengBigName;
import cn.liupeng.liupenglog.dao.LiupengBigNameDao;
import cn.liupeng.liupenglog.service.LiupengBigNameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 称号表(LiupengBigName)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-14 13:23:05
 */
@Service("liupengBigNameService")
public class LiupengBigNameServiceImpl implements LiupengBigNameService {
    @Resource
    private LiupengBigNameDao liupengBigNameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LiupengBigName queryById(Integer id) {
        return this.liupengBigNameDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LiupengBigName> queryAllByLimit(int offset, int limit) {
        return this.liupengBigNameDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<LiupengBigName> queryAll() {
        return this.liupengBigNameDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param liupengBigName 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengBigName insert(LiupengBigName liupengBigName) {
        this.liupengBigNameDao.insert(liupengBigName);
        return liupengBigName;
    }

    /**
     * 修改数据
     *
     * @param liupengBigName 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengBigName update(LiupengBigName liupengBigName) {
        this.liupengBigNameDao.update(liupengBigName);
        return this.queryById(liupengBigName.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.liupengBigNameDao.deleteById(id) > 0;
    }
}
