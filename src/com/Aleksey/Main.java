package com.Aleksey;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.math.*;




public class Main {

    public static void main(String[] args) {
        //System.out.println("Введите длину N");
        //Scanner len = new Scanner(System.in);
        //int leng = len.nextInt();
        int indexOfMax = 0;
        int indexOfMin = 0;
        //double[] array = new double[leng];
        //for (int i = 10; i < leng; i++)
        //array[i] = 10 + Math.random() * 91;
        //int max = Integer.MIN_VALUE;
        //int min = Integer.MAX_VALUE;
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size : ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (10 + Math.random() * 91);
        for (int i : arr)
            System.out.print(i + " ");
        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays.stream(arr).min();


        // поиск максимального и минимального числа
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            } else if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }

        }
        System.out.println();
        System.out.println("MOST BIG NUMBER IS : " + max);
        System.out.println("most little number is :" + min);
        /*int R = (int) (Math.random()*(200+1)) - 100;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(Math.max(array) +" " + Math.min(array));*/
       /* double[] randi = new double[N];
        for (int i = 10; i < N; i++)
            randi[i] = 10 + Math.random() * 91;
        System.out.println(randi + " ");*/
    }
}



