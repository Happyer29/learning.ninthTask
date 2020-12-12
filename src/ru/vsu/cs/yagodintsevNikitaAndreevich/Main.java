//package ru.vsu.cs.yagodintsevNikitaAndreevich;
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.ROOT);
//        Scanner scanner = new Scanner(System.in);
//
//        logic();
//    }
//
//    public static void logic(){
//        Integer[] arr1 = {1, 2, -2, 1, 10, 3, 105, 4, -5, 4, 10, 1, 1, 3, 4, 7, 12, 10 };
//
//        Integer[] arr2 = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0};
//
//        int length = arr2.length > arr1.length ? arr2.length : arr1.length;
//        System.out.println(length);
//        int[] arrRes = new int[length];
//
//        int el1 = 0;
//        int el2 = 0;
//        for(int i = 0; i < length; i++){
//            el1 = arr1.length > i && arr1[i] != null ? arr1[i] : arr2[i];
//            el2 = arr2.length > i && arr2[i] != null ? arr2[i] : arr1[i];
//            arrRes[i] = i % 2 == 0 ? el1 : el2;
//            System.out.println(arrRes[i]);
//        }
//
//    }
//}
