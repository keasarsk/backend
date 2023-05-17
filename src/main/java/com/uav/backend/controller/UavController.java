package com.uav.backend.controller;

import com.uav.backend.pojo.UavInfo;
import com.uav.backend.service.UavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UavController {
    @Autowired
    private UavService uavService;
    @RequestMapping("/getall")
    public List<UavInfo> getall(){
        return uavService.getAllService();
    }
}
