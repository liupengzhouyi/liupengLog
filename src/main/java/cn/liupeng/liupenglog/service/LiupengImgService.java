package cn.liupeng.liupenglog.service;

import cn.liupeng.liupenglog.entity.LiupengImg;

import java.util.List;

/**
 * 图片表(LiupengImg)表服务接口
 *
 * @author liupeng
 * @since 2021-04-14 13:09:35
 */
public interface LiupengImgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengImg queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengImg> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<LiupengImg> queryAll();

    /**
     * 新增数据
     *
     * @param liupengImg 实例对象
     * @return 实例对象
     */
    LiupengImg insert(LiupengImg liupengImg);

    /**
     * 修改数据
     *
     * @param liupengImg 实例对象
     * @return 实例对象
     */
    LiupengImg update(LiupengImg liupengImg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
