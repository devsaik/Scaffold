package com.lyft;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class VersionMap {
  // Todo: Optimize for BigInteger
  static int versionNumber;
  Map<String, TreeMap<Integer,Integer>> vMap;
  public VersionMap() {
    versionNumber = 0;
    vMap= new HashMap<>();
  }

  public void  PUT(String key, int value){
    if(!vMap.containsKey(key)){
      vMap.put(key, new TreeMap<>());
    }
    int currentVersion = ++versionNumber;
    vMap.get(key).put(currentVersion,value);
    System.out.println("Version ::"+versionNumber);
  }

  public int GET(String key){
    if(!vMap.containsKey(key)){
      System.out.println("Key ::"+key+" Value :: null");
      return 0;
    }
    int value = vMap.get(key).lastEntry().getValue();
    System.out.println("Key ::"+key+" Value ::"+value);
    return value;
  }

  public int GET(String key, int version){
    if(!vMap.containsKey(key)){
      System.out.println("Key ::"+key+" Value :: null");
      return 0;
    }
    int value = vMap.get(key).get(version);
    System.out.println("Key ::"+key+" Value ::"+value);
    return value;
  }


}
