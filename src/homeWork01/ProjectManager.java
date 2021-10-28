package homeWork01;

import java.util.Random;

public class ProjectManager extends Employee implements Manager{

    private String activProject;
    private int Salary;

    public ProjectManager(String name, int age) {
        super(name, age);
    }

    public ProjectManager(String name, int age, String activProject, int salary) {
        super(name, age);
        this.activProject = activProject;
        Salary = salary;
    }

    public int getInt(){
        return new Random().nextInt(100);
    }

    @Override
    public void toWork() {
        System.out.println(super.getName() + " leads the project : " + activProject);
    }

    @Override
    public void toManage() {
        System.out.println(activProject + " to Manage.");
    }

    public String getActivProject() {
        return activProject;
    }

    public void setActivProject(String activProject) {
        this.activProject = activProject;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
