package homework01;

public class Developer extends Employee{
    private int number;
    private int salary;

    public Developer(String name, int age) {
        super(name, age);
    }

    public Developer(String name,int age, int number, int salary) {
        super(name, age);
        this.number = number;
        this.salary = salary;
    }

    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void toWork() {
        System.out.println(super.getName() + " to work");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
