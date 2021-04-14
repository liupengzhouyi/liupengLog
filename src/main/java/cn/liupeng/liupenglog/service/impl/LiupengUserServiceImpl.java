package cn.liupeng.liupenglog.service.impl;

import cn.liupeng.liupenglog.entity.LiupengUser;
import cn.liupeng.liupenglog.dao.LiupengUserDao;
import cn.liupeng.liupenglog.service.LiupengUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(LiupengUser)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-14 13:17:43
 */
@Service("liupengUserService")
public class LiupengUserServiceImpl implements LiupengUserService {
    @Resource
    private LiupengUserDao liupengUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LiupengUser queryById(Integer id) {
        return this.liupengUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LiupengUser> queryAllByLimit(int offset, int limit) {
        return this.liupengUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<LiupengUser> queryAll() {
        return this.liupengUserDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param liupengUser 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengUser insert(LiupengUser liupengUser) {
        this.liupengUserDao.insert(liupengUser);
        return liupengUser;
    }

    /**
     * 修改数据
     *
     * @param liupengUser 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengUser update(LiupengUser liupengUser) {
        this.liupengUserDao.update(liupengUser);
        return this.queryById(liupengUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.liupengUserDao.deleteById(id) > 0;
    }
}
