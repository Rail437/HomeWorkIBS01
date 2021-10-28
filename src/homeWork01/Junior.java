package homeWork01;

public class Junior extends Employee{
    private int number;
    private String position;


    public Junior(String name, int age) {
        super(name, age);
    }

    public Junior(String name, int age, int number, String position) {
        super(name, age);
        this.number = number;
        this.position = position;
    }

    public void read(String text){
        System.out.println(text);
    }

    @Override
    public void toWork() {
        System.out.println("Junior "+ super.getName() + " learn to: " + position + " position.");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
