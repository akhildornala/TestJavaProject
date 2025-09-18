package com.test;

public class StringConcatWithNull {

    public static void main(String args[]) {
        String s1 = null;
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        String s2 = s1 + "," + "DORNALA";
        try {
            String res = s1.concat(s2);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
