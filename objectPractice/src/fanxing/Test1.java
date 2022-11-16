package fanxing;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<LiHuaCat> list1 = new ArrayList<>();
        ArrayList<PersianCat> list2 = new ArrayList<>();
        ArrayList<HuskyDog> list3 = new ArrayList<>();
        ArrayList<TeddyDog> list4 = new ArrayList<>();

        keepPet1(list1);
        keepPet1(list2);
        keepPet1(list3);
        keepPet1(list4);

        keepPet2(list1);
        keepPet2(list2);
        //keepPet2(list3);
        //keepPet2(list4);

        //keepPet3(list1);
        //keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);
    }


    public static void keepPet1(ArrayList<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }

    public static void keepPet2(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            cat.eat();
        }

    }

    public static void keepPet3(ArrayList<? extends Dog> list) {
        for (Dog dog : list) {
            dog.eat();
        }
    }
}
