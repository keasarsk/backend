package com.uav.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissionInfo {
    private int id;
    private double mis_lat;
    private double mis_lon;
    private int size;
    private int nums;
}
