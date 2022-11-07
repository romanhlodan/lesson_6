package ua.com.hrv.task_1;

public class PersonFixPay implements Salary {
    private String name;
    private int age;

    public PersonFixPay(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonFixPay{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void SalaryPay(double b) {
        double payFix = b * 20;
        System.out.println("Його зарплата : " + payFix);
    }
}
