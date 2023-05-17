package com.uav.backend.utils;

import com.uav.backend.pojo.MissionInfo;
import com.uav.backend.pojo.UavInfo;

import java.util.List;

public class Preprocess {
    public BaseModel preprocess(BaseModel bm, List<UavInfo> list1, List<MissionInfo> list2){

        bm.battery.value = list1.get(1).getBattery();
        double lat = list1.get(1).getLat();
        double lon = list1.get(1).getLon();
        // bm.distance.value =
        bm.alititude.value = list1.get(1).getAlt();
        bm.runningTime.value = list1.get(1).getRun_time();
        // bm.communicationQuality.value = list.get(1).getBattery();

        // bm.missionHistory.value = list2.get(1).getBattery();
        double mis_lat = list2.get(1).getMis_lat();
        double mis_lon = list2.get(1).getMis_lon();
        // bm.missionDistance.value =
        bm.missionDataSize.value = list2.get(1).getSize();
        bm.missionNums.value = list2.get(1).getNums();


        return bm;
    }
}
