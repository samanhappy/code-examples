package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqHotNews;
import com.c_platform.yq.bean.YqHotNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqHotNewsMapper {
    int countByExample(YqHotNewsExample example);

    int deleteByExample(YqHotNewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqHotNews record);

    int insertSelective(YqHotNews record);

    List<YqHotNews> selectByExample(YqHotNewsExample example);

    YqHotNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqHotNews record, @Param("example") YqHotNewsExample example);

    int updateByExample(@Param("record") YqHotNews record, @Param("example") YqHotNewsExample example);

    int updateByPrimaryKeySelective(YqHotNews record);

    int updateByPrimaryKey(YqHotNews record);
}