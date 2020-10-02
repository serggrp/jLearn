package ru.sergie.fintech;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int k =  sc.nextInt();
            int c = sc.nextInt();
            map.put(k, c);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i, j;
        boolean isPrime;

        for(i=2; i<100000; i++) {
            isPrime = true;

            for (j=2; j<(i/j); j++) {
                if((i%j) == 0) isPrime = false;
            }

            if(isPrime) {
                list.add(i);
            }
        }
        //тк по условию до 500 итераций, то тоже int
//        int sum = 0;
//        //если второе число меньше первого (что противоречит условию) цикл просто не выполнится и вернем в ответе 0
//        for (int i = a, curr = 0; i <= b; i++) {
//            curr = i;
//            while (curr != 1){
//                sum++;
//                if (curr % 2 == 0){
//                    curr = curr / 2;
//                }
//                else{
//                    curr = 3 * curr + 1;
//                }
//            }
//        }
//        System.out.println(sum);
    }
}
