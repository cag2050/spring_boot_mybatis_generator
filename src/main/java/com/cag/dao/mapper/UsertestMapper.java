package com.cag.dao.mapper;

import com.cag.entity.Usertest;
import com.cag.entity.UsertestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertestMapper {
    long countByExample(UsertestExample example);

    int deleteByExample(UsertestExample example);

    int insert(Usertest record);

    int insertSelective(Usertest record);

    List<Usertest> selectByExample(UsertestExample example);

    int updateByExampleSelective(@Param("record") Usertest record, @Param("example") UsertestExample example);

    int updateByExample(@Param("record") Usertest record, @Param("example") UsertestExample example);
}