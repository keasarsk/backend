package com.uav.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UavInfo {
    private int id;
    private double battery;
    private double lat;
    private double lon;
    private int alt;
    private int comun_quli;
    private int run_time;


}
