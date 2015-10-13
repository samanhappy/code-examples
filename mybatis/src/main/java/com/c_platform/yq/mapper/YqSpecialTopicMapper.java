package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqSpecialTopic;
import com.c_platform.yq.bean.YqSpecialTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqSpecialTopicMapper {
    int countByExample(YqSpecialTopicExample example);

    int deleteByExample(YqSpecialTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqSpecialTopic record);

    int insertSelective(YqSpecialTopic record);

    List<YqSpecialTopic> selectByExample(YqSpecialTopicExample example);

    YqSpecialTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqSpecialTopic record, @Param("example") YqSpecialTopicExample example);

    int updateByExample(@Param("record") YqSpecialTopic record, @Param("example") YqSpecialTopicExample example);

    int updateByPrimaryKeySelective(YqSpecialTopic record);

    int updateByPrimaryKey(YqSpecialTopic record);
}