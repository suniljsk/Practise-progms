package com.coderulagam.spring_security_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

    public static void main(String[] args) {
        int[] inp = {1, 2, 3, 4, 5};
        List<Integer> inp1= Arrays.asList(1, 2, 3, 4, 5);
//        int[] op = new int[inp.length];
//
//        for (int i = 0; i < inp.length; i++) {
//            op[i] = (inp[i] + 3) * (inp[i] + 3);
//        }
//        System.out.println("op");
//
//
//        for (int i = 0; i < op.length; i++) {
//            System.out.print(op[i] + " ");
//
//        }
//    }
        List<Integer> ff= inp1.stream().map(x->(x+1)*(x+1)).collect(Collectors.toList());
        System.out.println(ff);



    }
}
