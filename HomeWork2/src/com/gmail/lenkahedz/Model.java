package com.gmail.lenkahedz;

import java.util.ArrayList;

public class Model {
    public static final int NUMBER = rund(0, 100);
    private ArrayList<Integer> tarray = new ArrayList();
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        tarray.add(value);
    }

    public int getMinBarrier(){
        int minValue = 0;
        for (int i: tarray) {
            if(i > minValue && i < NUMBER) {
                minValue = i;
            }
        }
        return minValue;
    }

    public int getMaxBarrier(){
        int maxValue = 100;
        for (int i: tarray) {
            if(i < maxValue && i > NUMBER) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static int rund(int a, int b){
        return a + (int) (Math.random() * b);
    }

    public boolean isOurNumber(){
        boolean res = false;
        if(value == NUMBER){
            res = true;
        }
        return  res;
    }

    public String printArray(){
        return tarray.toString();
    }
}
