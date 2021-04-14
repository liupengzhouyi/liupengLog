package cn.liupeng.liupenglog.dao;

import cn.liupeng.liupenglog.entity.LiupengLink;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 文档表(LiupengLink)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-14 13:10:50
 */
@Mapper
public interface LiupengLinkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengLink queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengLink> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<LiupengLink> queryAll();

    /**
     * 新增数据
     *
     * @param liupengLink 实例对象
     * @return 影响行数
     */
    int insert(LiupengLink liupengLink);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiupengLink> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LiupengLink> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiupengLink> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<LiupengLink> entities);

    /**
     * 修改数据
     *
     * @param liupengLink 实例对象
     * @return 影响行数
     */
    int update(LiupengLink liupengLink);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

