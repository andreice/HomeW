package com.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int devideIntNoExeptionHandling(int a, int b) {
        return a / b;
    }
    public static int devideIntWinthExeptionHandling (int a, int b) {
        try {
            int result = a/b;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("An exception has occurred" + e);
            return 0;
        }
    }
}
