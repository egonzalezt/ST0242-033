package com.company;

public class Inventario_1 {

    public boolean SumaGrupo(int start, int[] nums, int target) {
        if(start>=nums.length)
        {
            return target==0;
        }
        else return SumaGrupo(start+1,nums,target-nums[start]);
    }
}
