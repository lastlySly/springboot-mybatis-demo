package cn.lastlysly.mapper;

import cn.lastlysly.pojo.TbArea;
import cn.lastlysly.pojo.TbAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreaMapper {
    long countByExample(TbAreaExample example);

    int deleteByExample(TbAreaExample example);

    int insert(TbArea record);

    int insertSelective(TbArea record);

    List<TbArea> selectByExample(TbAreaExample example);

    int updateByExampleSelective(@Param("record") TbArea record, @Param("example") TbAreaExample example);

    int updateByExample(@Param("record") TbArea record, @Param("example") TbAreaExample example);
}