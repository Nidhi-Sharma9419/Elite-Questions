package Subsequence;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
public class allsubsequence {
    // Declare a global list
    //Y


    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 1, 3, 4, 9};
        //int ans[] = nextGreater(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i< arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}