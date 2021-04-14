package cn.liupeng.liupenglog.service;

import cn.liupeng.liupenglog.entity.LiupengUser;

import java.util.List;

/**
 * 用户表(LiupengUser)表服务接口
 *
 * @author liupeng
 * @since 2021-04-14 12:59:54
 */
public interface LiupengUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengUser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengUser> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<LiupengUser> queryAll();

    /**
     * 新增数据
     *
     * @param liupengUser 实例对象
     * @return 实例对象
     */
    LiupengUser insert(LiupengUser liupengUser);

    /**
     * 修改数据
     *
     * @param liupengUser 实例对象
     * @return 实例对象
     */
    LiupengUser update(LiupengUser liupengUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
