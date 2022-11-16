public class test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Dog d = new Dog(8, "白");
        Cat c = new Cat(9, "粉");
        p.keepPet(d, "粑粑");
        p.keepPet(c, "小鱼儿");
    }
}
