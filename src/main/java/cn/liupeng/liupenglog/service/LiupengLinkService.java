package cn.liupeng.liupenglog.service;

import cn.liupeng.liupenglog.entity.LiupengLink;

import java.util.List;

/**
 * 文档表(LiupengLink)表服务接口
 *
 * @author liupeng
 * @since 2021-04-14 13:10:50
 */
public interface LiupengLinkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengLink queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengLink> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<LiupengLink> queryAll();

    /**
     * 新增数据
     *
     * @param liupengLink 实例对象
     * @return 实例对象
     */
    LiupengLink insert(LiupengLink liupengLink);

    /**
     * 修改数据
     *
     * @param liupengLink 实例对象
     * @return 实例对象
     */
    LiupengLink update(LiupengLink liupengLink);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
