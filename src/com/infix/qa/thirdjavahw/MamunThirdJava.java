package com.infix.qa.thirdjavahw;

public class MamunThirdJava {

    public static void main (String []args){

        System.out.println("Datatype Homework");
        dataTypes();
    }

    //This is a method for datatypes
    public static void dataTypes() {

        //string
        //int
        int intNum = 10 * 20 + 30 * 5 / 2;
        byte byteNum = 20 + 20 * 20 / 12;
        short shortNum = 30 + 30 + 22 + 1 - 4 / 11;
        long longNum = 40 + 33 + 725 - 818 / 524;
        float floatNum = 555 + 33 - 0;
        double doubleNum = 10.10 + 10;

        char charVariable = '0';
        boolean myBoolean = true;

        System.out.println(intNum);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);

        System.out.println(charVariable);
        System.out.println(myBoolean);
    }


    public static void operators() {

        int intNumOne = 222;
        int intNumTwo = 143;

        System.out.println("Reminder;" + " " + intNumOne % intNumTwo);

        double doubleNumOne = 222.0;
        double doubleNumTwo = 143.0;
        System.out.println(doubleNumOne/doubleNumTwo);

    }













}
