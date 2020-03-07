package com.company;

public class Main {

    public static void main(String[] args) {

        toEquals();

//        mySelf(0);
    }

    // write your code here
    public static void toEquals() {
        String  str = "hello";
        String  str2 = new String ("hello");

        System.out.println(str == str2+","+str.equals(str2));
    }

    public static void toWhile() {
        int  i = 0;

        while(i++<100)   ;
        System.out.println(i);
    }

    public static void toLength() {
        String myname = "测试员";

        System.out.println(myname.length());

        StringBuffer sbb = new StringBuffer();

        for (int i = myname.length() - 1; i >= 0; i--) {

            sbb.append(myname.charAt(i));
        }

        System.out.println(sbb.toString());

    }

    public static void mySelf(int index) {
        String retStr = "i'm No." + String.valueOf(index);
        index++;
        if (index < 100)
            mySelf(index);
        System.out.println(retStr);
    }

    public static void toTrans() {
        int valInt = 100;
        double valDouble = 100.01;
        float valFloat = (float) 100.02;
        valDouble = valInt;
        valDouble = valFloat;
        System.out.print(valInt + "\n");
        System.out.print(valDouble + "\n");
        System.out.print(valFloat + "\n");
    }
}

