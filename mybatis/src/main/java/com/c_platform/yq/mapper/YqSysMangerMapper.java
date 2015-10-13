package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqSysManger;
import com.c_platform.yq.bean.YqSysMangerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqSysMangerMapper {
    int countByExample(YqSysMangerExample example);

    int deleteByExample(YqSysMangerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqSysManger record);

    int insertSelective(YqSysManger record);

    List<YqSysManger> selectByExample(YqSysMangerExample example);

    YqSysManger selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqSysManger record, @Param("example") YqSysMangerExample example);

    int updateByExample(@Param("record") YqSysManger record, @Param("example") YqSysMangerExample example);

    int updateByPrimaryKeySelective(YqSysManger record);

    int updateByPrimaryKey(YqSysManger record);
}