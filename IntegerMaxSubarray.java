/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package alg.dac;
package com.gradescope.intlist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ITSC6114
 */
public class IntegerMaxSubarray extends MaxSubarrayGenericType<Integer>{
    protected Integer add(Integer o1, Integer o2){
        return new Integer(o1.intValue() + o2.intValue());
    }
    protected int compareTo(Integer o1, Integer o2){
        if (o1.intValue() < o2.intValue())
            return -1;
        else
            if (o1.intValue() > o2.intValue())
                return 1;
            else
                return 0;
    }
    
    public static void main(String [] argv){
        Scanner keyboard = new Scanner(System.in);
        String intSequence = keyboard.nextLine();
        
        String[] tokens = intSequence.split(",");
        Integer [] array = new Integer[tokens.length];
        for (int i = 0; i < tokens.length; i++)
            array[i] = new Integer(tokens[i]);
        
        //Integer [] array = {0, 1, -4, 3, 4, -2, 6};
        List<Integer> list = Arrays.asList(array);
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        IntegerMaxSubarray mss = new IntegerMaxSubarray();
        SubArrayInfoGenericType<Integer> max = mss.findMSS(arrayList, 0, arrayList.size()-1);
        System.out.println(max.toString());
    }
}
