/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author GC
 */
public class singleArray {
    public static int singleListWithQuadratinNSquareTimeComplexity (){
        int[] arr = {1, 2, 4, 1, 2};
        int val=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j] && i!=j){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                return arr[i];
            }
        }
        return -1;
    }
    public static int withXorToFindAloneValueInArray(){
        int[] arr = {1, 2, 4, 1, 2};
        int val = 0;
        for (int num:arr){
            val = num ^ val;
            System.out.println(val);
        }
        return val;
    }
    public static void main(String[] args) {
        int val = singleListWithQuadratinNSquareTimeComplexity();
//        System.out.println(val);
        int val1 = withXorToFindAloneValueInArray();
//        System.out.println(val1);
    }
}
