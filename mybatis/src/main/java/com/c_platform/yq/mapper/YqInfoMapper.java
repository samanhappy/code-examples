package com.c_platform.yq.mapper;

import com.c_platform.yq.bean.YqInfo;
import com.c_platform.yq.bean.YqInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YqInfoMapper {
    int countByExample(YqInfoExample example);

    int deleteByExample(YqInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YqInfo record);

    int insertSelective(YqInfo record);

    List<YqInfo> selectByExampleWithBLOBs(YqInfoExample example);

    List<YqInfo> selectByExample(YqInfoExample example);

    YqInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YqInfo record, @Param("example") YqInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") YqInfo record, @Param("example") YqInfoExample example);

    int updateByExample(@Param("record") YqInfo record, @Param("example") YqInfoExample example);

    int updateByPrimaryKeySelective(YqInfo record);

    int updateByPrimaryKeyWithBLOBs(YqInfo record);

    int updateByPrimaryKey(YqInfo record);
}