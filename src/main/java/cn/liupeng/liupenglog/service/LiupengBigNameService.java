package cn.liupeng.liupenglog.service;

import cn.liupeng.liupenglog.entity.LiupengBigName;

import java.util.List;

/**
 * 称号表(LiupengBigName)表服务接口
 *
 * @author liupeng
 * @since 2021-04-14 13:23:04
 */
public interface LiupengBigNameService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengBigName queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengBigName> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<LiupengBigName> queryAll();

    /**
     * 新增数据
     *
     * @param liupengBigName 实例对象
     * @return 实例对象
     */
    LiupengBigName insert(LiupengBigName liupengBigName);

    /**
     * 修改数据
     *
     * @param liupengBigName 实例对象
     * @return 实例对象
     */
    LiupengBigName update(LiupengBigName liupengBigName);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
