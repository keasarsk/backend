package com.uav.backend.utils;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String name;
    double value;
    List<Node> childen;
    Node parent;
    double path_weight;

    public Node(){};
    public Node(String name, double value) {
        this.name = name;
        this.value = value;
        this.childen = new ArrayList<>();
    }
    public void add_child(Node chid, double weight){
        childen.add(chid);
        chid.parent = this;
        chid.path_weight = weight;
    }
}
