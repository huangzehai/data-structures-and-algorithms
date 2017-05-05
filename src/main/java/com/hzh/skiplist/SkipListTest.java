package com.hzh.skiplist;

/**
 * Created by huangzeahi on /5/5.
 */
public class SkipListTest {

    public static void main(String[] args) {
        SkipList S = new SkipList();
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        // System.out.println("======");


        S.put("ABC", 3);
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        //System.out.println("======");


        S.put("DEF", 3);
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        // System.out.println("======");


        S.put("KLM", 3);
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        // System.out.println("======");


        S.put("HIJ", 3);
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        // System.out.println("======");


        S.put("GHJ", 3);
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        // System.out.println("======");


        S.put("AAA", 3);
        S.printHorizontal();
        System.out.println("------");
        // S.printVertical();
        // System.out.println("======");
    }

}
