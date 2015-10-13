package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqUser;
import com.c_platform.yq.bean.YqUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqUserMapper {
    int countByExample(YqUserExample example);

    int deleteByExample(YqUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqUser record);

    int insertSelective(YqUser record);

    List<YqUser> selectByExample(YqUserExample example);

    YqUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqUser record, @Param("example") YqUserExample example);

    int updateByExample(@Param("record") YqUser record, @Param("example") YqUserExample example);

    int updateByPrimaryKeySelective(YqUser record);

    int updateByPrimaryKey(YqUser record);
}