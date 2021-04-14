package cn.liupeng.liupenglog.service.impl;

import cn.liupeng.liupenglog.entity.LiupengLink;
import cn.liupeng.liupenglog.dao.LiupengLinkDao;
import cn.liupeng.liupenglog.service.LiupengLinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文档表(LiupengLink)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-14 13:10:51
 */
@Service("liupengLinkService")
public class LiupengLinkServiceImpl implements LiupengLinkService {
    @Resource
    private LiupengLinkDao liupengLinkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LiupengLink queryById(Integer id) {
        return this.liupengLinkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LiupengLink> queryAllByLimit(int offset, int limit) {
        return this.liupengLinkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<LiupengLink> queryAll() {
        return this.liupengLinkDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param liupengLink 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengLink insert(LiupengLink liupengLink) {
        this.liupengLinkDao.insert(liupengLink);
        return liupengLink;
    }

    /**
     * 修改数据
     *
     * @param liupengLink 实例对象
     * @return 实例对象
     */
    @Override
    public LiupengLink update(LiupengLink liupengLink) {
        this.liupengLinkDao.update(liupengLink);
        return this.queryById(liupengLink.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.liupengLinkDao.deleteById(id) > 0;
    }
}
