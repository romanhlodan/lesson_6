package ua.com.hrv.task_1;

public class Main {

    public static void main(String[] args) {

    PersonFixPay personFixPay = new PersonFixPay("Petro", 27);
        System.out.print("Працівник з фіксованою ставкою " + personFixPay.getName() + ". Йому " + personFixPay.getAge() + " років. ");
        personFixPay.SalaryPay(426.7);

        PersonTimePay personTimePay = new PersonTimePay("Roman", "Hlodan");
        System.out.print("Працівник з погодинною оплатою " + personTimePay.getFname() + " " + personTimePay.getLname() + ". ");
        personTimePay.SalaryPay(98.4);
    }
}
