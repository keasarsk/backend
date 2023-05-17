package com.uav.backend.utils.Scenes;

import com.uav.backend.utils.BaseModel;
import com.uav.backend.utils.CoreMixed;
import com.uav.backend.utils.Preprocess;

import java.util.ArrayList;
import java.util.List;

public class gym {
    Preprocess pc;
    CoreMixed cm;
    public gym(){
        pc = new Preprocess();
        cm = new CoreMixed();
    }
    //得到每个任务点的val 列表
    public List<Double> gymTraining(int[] weight){
        BaseModel bm = new BaseModel(weight);//传入权重参数构造模型
        List<Double> list = new ArrayList<>();
        // 循环的给 bm 的节点赋值,每个循环是一个任务
        // for()
            // 给各个节点赋值
            // bm = pc.preprocess(bm, list);
            // bm 做参数 调用 coreMixed 方法 生成该任务优先值val.放入列表
            // list.add(cm.mix(bm));
        return list;
    }

}
