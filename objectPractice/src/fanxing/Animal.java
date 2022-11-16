package fanxing;

public abstract class Animal {
    private String Name;
    private int Age;

    public abstract void eat();

    public Animal() {

    }

    public Animal(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;

    }
}
