package com.uav.backend.utils;


import javax.swing.plaf.IconUIResource;

//核心融合算法方法
public class CoreMixed {
    public double mix(BaseModel bm){
        // 后序遍历 bm ,从下到上先计算出每个节点的 val,
        dfs(bm.root);
        return bm.root.value;
    }
    private void dfs(Node root){
        if(root == null)return;
        for(Node nd : root.childen){
            dfs(nd);
        }
        root.value = compute(root);

    }
    private double compute(Node root){
        Node prend = null;
        double val = 0.0;
        for(Node nd : root.childen){
            if(prend == null){
                prend = nd;
            }
            else{
                val += compute_mix(prend, nd);
                prend = nd;
            }
        }
        return val;
    }
    private double compute_mix(Node prend, Node nd){
        double valp = prend.value;
        double valn = nd.value;
        if(valp >= 0 && valn >= 0){
            return valp + valn - valp*valn;
        }
        else if(valp <= 0 && valn <= 0){
            return valp + valn + valn*valp;
        }
        else if(valp * valn == -1.0){
            return 0.0;
        }
        else return (valp + valn) / (1-Math.min(Math.abs(valp),Math.abs(valn)));
    }
}
