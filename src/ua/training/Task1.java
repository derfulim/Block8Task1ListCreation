package ua.training;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        processList();
    }

    public static void processList() {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        Stream.of(4,5,-6,4,5,3,4,2,4,5,7).forEach(integer -> treeMap.put(integer, treeMap.getOrDefault(integer,0) + 1));
        treeMap.forEach((k,v)->System.out.println(k + " - " + v));
    }
}
