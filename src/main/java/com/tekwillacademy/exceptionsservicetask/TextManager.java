package com.tekwillacademy.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLenghtWintTryCatchAndFinaly(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException e) {
            System.out.println("Execution is: " + e);
            return 0;
        } finally {
            System.out.println("This block is exception");
        }
    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("input string is a null value, please check again");
            return 0;
        } else {
            return inputString.length();
        }
    }
}
