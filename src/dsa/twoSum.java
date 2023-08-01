/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GC
 */
public class twoSum {
    public static int[] Optimized(int target) {
        int[] num = {2, 4, 1, 2, 3, 5};
        Map<Integer,Integer> ma= new HashMap<>();
                
        for (int i = 0; i < num.length - 1; i++) {
            int targetVal = target - num[i];
            if(ma.containsKey(targetVal)){
                return new int[]{ma.get(targetVal) ,i};
            }else{
                ma.put(num[i], i);
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] nonOptimized(int target) {
        int[] num = {2, 4, 1, 2, 3, 5};
        for (int i = 0; i < num.length - 1; i++) {
            int targetVal = target - num[i];
            for (int j = 0; j < num.length; j++) {
                if (num[j] == targetVal) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = nonOptimized(5);
        int[] arr1 = Optimized(5);
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
