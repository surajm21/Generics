package com.bridglabz;

public class MaximumTest<T extends Comparable<T>> {
    T x,y,z;

    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return  MaximumTest.maximum(x ,y ,z );
    }
    //determines the largest of three compilation object
    public static <T extends Comparable<T>> T maximum (T x,T y,T z){
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static String testMaximum(String x,String y,String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        Integer xInt=2, yInt=3,zInt=4;
        Float xF1=6.6f, yF1=8.8f,zF1=7.7f;
        String xStr="pear", yStr="apple",zStr="orange";

        MaximumTest.testMaximum(xStr,yStr ,zStr);
        new MaximumTest(xInt , yInt ,zInt).maximum();
        new MaximumTest(xF1 , yF1 ,zF1).maximum();
        new MaximumTest(xStr , yStr ,zStr).maximum();
    }
}
