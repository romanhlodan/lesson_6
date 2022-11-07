package ua.com.hrv.task_1;

public class PersonTimePay implements Salary {

    private String Fname;
    private String Lname;

    public PersonTimePay(String fname, String lname) {
        Fname = fname;
        Lname = lname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    @Override
    public String toString() {
        return "PersonTimePay{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                '}';
    }

    @Override
    public void SalaryPay(double b) {
        double payTime = (b * 8)*20;
        System.out.println("Його зарплата: " + payTime);
    }
}
