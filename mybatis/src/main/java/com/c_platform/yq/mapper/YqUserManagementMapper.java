package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqUserManagement;
import com.c_platform.yq.bean.YqUserManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqUserManagementMapper {
    int countByExample(YqUserManagementExample example);

    int deleteByExample(YqUserManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqUserManagement record);

    int insertSelective(YqUserManagement record);

    List<YqUserManagement> selectByExample(YqUserManagementExample example);

    YqUserManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqUserManagement record, @Param("example") YqUserManagementExample example);

    int updateByExample(@Param("record") YqUserManagement record, @Param("example") YqUserManagementExample example);

    int updateByPrimaryKeySelective(YqUserManagement record);

    int updateByPrimaryKey(YqUserManagement record);
}