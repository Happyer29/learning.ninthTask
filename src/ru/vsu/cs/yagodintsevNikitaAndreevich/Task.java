package ru.vsu.cs.yagodintsevNikitaAndreevich;


public class Task {
    public static int[] Process(int[] arr1, int[] arr2) {
        int length = arr2.length > arr1.length ? arr2.length : arr1.length;
        System.out.println(length);
        int[] arrRes = new int[length];

        int el1 = 0;
        int el2 = 0;
        for(int i = 0; i < length; i++){
            el1 = arr1.length > i ? arr1[i] : arr2[i];
            el2 = arr2.length > i ? arr2[i] : arr1[i];
            arrRes[i] = i % 2 == 0 ? el1 : el2;
        }
        return arrRes;
    }
}
