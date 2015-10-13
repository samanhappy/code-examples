package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqSoftwareInfo;
import com.c_platform.yq.bean.YqSoftwareInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqSoftwareInfoMapper {
    int countByExample(YqSoftwareInfoExample example);

    int deleteByExample(YqSoftwareInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqSoftwareInfo record);

    int insertSelective(YqSoftwareInfo record);

    List<YqSoftwareInfo> selectByExample(YqSoftwareInfoExample example);

    YqSoftwareInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqSoftwareInfo record, @Param("example") YqSoftwareInfoExample example);

    int updateByExample(@Param("record") YqSoftwareInfo record, @Param("example") YqSoftwareInfoExample example);

    int updateByPrimaryKeySelective(YqSoftwareInfo record);

    int updateByPrimaryKey(YqSoftwareInfo record);
}