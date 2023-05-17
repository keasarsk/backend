package com.uav.backend.utils;

import java.util.List;

public class BaseModel {
    Node root = new Node();
    Node mission = new Node();
    Node uavInfo = new Node();
    Node missionNums = new Node();
    Node missionComplexity = new Node();
    Node missionHistory = new Node();
    Node hardWare = new Node();
    Node alititude = new Node();
    Node distance = new Node();
    Node battery = new Node();
    Node missionDataSize = new Node();
    Node missionDistance = new Node();
    Node communicationQuality = new Node();
    Node runningTime = new Node();
    public BaseModel() {
        root.add_child(mission, 0.5);
        root.add_child(uavInfo, 0.5);
        mission.add_child(missionNums, 0.5);
        mission.add_child(missionComplexity, 0.5);
        mission.add_child(missionHistory, 0.5);
        uavInfo.add_child(hardWare, 0.5);
        uavInfo.add_child(alititude, 0.5);
        uavInfo.add_child(distance, 0.5);
        uavInfo.add_child(battery, 0.5);
        missionComplexity.add_child(missionDataSize, 0.5);
        missionComplexity.add_child(missionDistance, 0.5);
        hardWare.add_child(communicationQuality, 0.5);
        hardWare.add_child(runningTime, 0.5);
    }

    public BaseModel(int[] weight) {
        root.add_child(mission, weight[0]);
        root.add_child(uavInfo, weight[1]);
        mission.add_child(missionNums, weight[2]);
        mission.add_child(missionComplexity, weight[3]);
        mission.add_child(missionHistory, weight[4]);
        uavInfo.add_child(hardWare, weight[5]);
        uavInfo.add_child(alititude, weight[6]);
        uavInfo.add_child(distance, weight[7]);
        uavInfo.add_child(battery, weight[8]);
        missionComplexity.add_child(missionDataSize, weight[9]);
        missionComplexity.add_child(missionDistance, weight[10]);
        hardWare.add_child(communicationQuality, weight[11]);
        hardWare.add_child(runningTime, weight[12]);
    }
}
