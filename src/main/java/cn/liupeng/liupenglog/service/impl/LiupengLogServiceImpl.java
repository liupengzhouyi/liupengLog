package cn.liupeng.liupenglog.service.impl;

import cn.liupeng.liupenglog.entity.LiupengLog;
import cn.liupeng.liupenglog.dao.LiupengLogDao;
import cn.liupeng.liupenglog.service.LiupengLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 日志表(LiupengLog)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-14 13:11:51
 */
@Service("liupengLogService")
public class LiupengLogServiceImpl implements LiupengLogService {
    @Resource
    private LiupengLogDao liupengLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LiupengLog queryById(Integer id) {
        return this.liupengLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LiupengLog> queryAllByLimit(int offset, int limit) {
        return this.liupengLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<LiupengLog> queryAll() {
        return this.liupengLogDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param liupengLog 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengLog insert(LiupengLog liupengLog) {
        this.liupengLogDao.insert(liupengLog);
        return liupengLog;
    }

    /**
     * 修改数据
     *
     * @param liupengLog 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengLog update(LiupengLog liupengLog) {
        this.liupengLogDao.update(liupengLog);
        return this.queryById(liupengLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.liupengLogDao.deleteById(id) > 0;
    }
}
