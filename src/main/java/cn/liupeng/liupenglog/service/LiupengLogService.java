package cn.liupeng.liupenglog.service;

import cn.liupeng.liupenglog.entity.LiupengLog;

import java.util.List;

/**
 * 日志表(LiupengLog)表服务接口
 *
 * @author liupeng
 * @since 2021-04-14 13:11:51
 */
public interface LiupengLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengLog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengLog> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<LiupengLog> queryAll();

    /**
     * 新增数据
     *
     * @param liupengLog 实例对象
     * @return 实例对象
     */
    LiupengLog insert(LiupengLog liupengLog);

    /**
     * 修改数据
     *
     * @param liupengLog 实例对象
     * @return 实例对象
     */
    LiupengLog update(LiupengLog liupengLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
