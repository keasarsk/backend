package com.uav.backend.service;

import com.uav.backend.mapper.UavMapper;
import com.uav.backend.pojo.UavInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UavService {
    @Autowired
    private UavMapper uavMapper;
    public List<UavInfo> getAllService(){
        List<UavInfo> list = uavMapper.getAll();

        return uavMapper.getAll();

    }
}
