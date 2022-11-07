package ua.com.hrv.task_2.interface_2;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(5,2);
        System.out.println(myCalculator.add());
        System.out.println(myCalculator.minus());
        System.out.println(myCalculator.multiply());
        System.out.println(myCalculator.devide());
    }
}
