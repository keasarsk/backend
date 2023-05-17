package com.uav.backend.mapper;

import com.uav.backend.pojo.UavInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UavMapper {
    List<UavInfo> getAll();
}
