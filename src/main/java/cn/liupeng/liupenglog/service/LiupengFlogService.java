package cn.liupeng.liupenglog.service;

import cn.liupeng.liupenglog.entity.LiupengFlog;

import java.util.List;

/**
 * Flag表(LiupengFlog)表服务接口
 *
 * @author liupeng
 * @since 2021-04-14 13:07:58
 */
public interface LiupengFlogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengFlog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengFlog> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<LiupengFlog> queryAll();

    /**
     * 新增数据
     *
     * @param liupengFlog 实例对象
     * @return 实例对象
     */
    LiupengFlog insert(LiupengFlog liupengFlog);

    /**
     * 修改数据
     *
     * @param liupengFlog 实例对象
     * @return 实例对象
     */
    LiupengFlog update(LiupengFlog liupengFlog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
