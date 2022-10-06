package com.leetcode;

import com.leetcode.Utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyValueStore {
}


class PairClass {
    int key;
    String value;
    public PairClass(String value, int key) {
        this.key = key;
        this.value = value;
    }
}
class TimeMap {
    HashMap <String,List<PairClass>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new PairClass(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        else{
            return binarySearch(map.get(key), timestamp);
        }
    }
    public String binarySearch(List<PairClass> arr, int timestamp){
        int low = 0, high = arr.size()-1;
        String result = "";
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr.get(mid).key <= timestamp){
                result=arr.get(mid).value;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
}
