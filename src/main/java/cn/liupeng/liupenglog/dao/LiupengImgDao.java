package cn.liupeng.liupenglog.dao;

import cn.liupeng.liupenglog.entity.LiupengImg;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 图片表(LiupengImg)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-13 23:43:53
 */
@Mapper
public interface LiupengImgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LiupengImg queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LiupengImg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<LiupengImg> queryAll();

    /**
     * 新增数据
     *
     * @param liupengImg 实例对象
     * @return 影响行数
     */
    int insert(LiupengImg liupengImg);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiupengImg> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LiupengImg> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiupengImg> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<LiupengImg> entities);

    /**
     * 修改数据
     *
     * @param liupengImg 实例对象
     * @return 影响行数
     */
    int update(LiupengImg liupengImg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

