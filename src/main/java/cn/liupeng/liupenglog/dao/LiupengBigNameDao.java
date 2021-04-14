package cn.liupeng.liupenglog.dao;

import cn.liupeng.liupenglog.entity.LiupengBigName;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 称号表(LiupengBigName)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-14 13:23:04
 */
@Mapper
public interface LiupengBigNameDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengBigName queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengBigName> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<LiupengBigName> queryAll();

    /**
     * 新增数据
     *
     * @param liupengBigName 实例对象
     * @return 影响行数
     */
    int insert(LiupengBigName liupengBigName);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiupengBigName> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LiupengBigName> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiupengBigName> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<LiupengBigName> entities);

    /**
     * 修改数据
     *
     * @param liupengBigName 实例对象
     * @return 影响行数
     */
    int update(LiupengBigName liupengBigName);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

