package com.Aleksey;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        int indexOfMax = 0;
        int indexOfMin = 0;
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of  : ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (10 + Math.random() * 91);
        for (int i : arr)
            System.out.print(i + " ");
        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays.stream(arr).min();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            } else if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println();
        System.out.println("most big number is : " + max);
        System.out.println("most little number is :" + min);
    }
}