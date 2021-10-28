package homeWork02;

import homeWork01.Employee;

public abstract class EmployeeTwo extends Employee {
    private String telephoneNumber;
    private int age;

    public EmployeeTwo(String name, int age) {
        super(name, age);
    }

    public EmployeeTwo(String name, int age, String telephoneNumber, int age1) {
        super(name, age);
        this.telephoneNumber = telephoneNumber;
        this.age = age1;
    }

    public String callMe(){
        return telephoneNumber;
    }

    public void tellAge(){
        System.out.println(this.getName() + " speaks " + age + " years.");
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
