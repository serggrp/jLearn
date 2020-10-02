package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //idea1
//        StringBuilder sb = new StringBuilder();
//        for (String s1 : s.split("\\s")) {
//            sb.append(String.valueOf(s1.charAt(0)).toUpperCase());
//            sb.append(s1.substring(1));
//            sb.append(" ");
//        }
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);
        //idea2
        char[] ch = s.toCharArray();
        ch[0] = String.valueOf(ch[0]).toUpperCase().toCharArray()[0];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' '){
                int n = i + 1;
                ch[n] = String.valueOf(ch[n]).toUpperCase().toCharArray()[0];
            }
        }
        System.out.println(new String(ch));
    }
}
