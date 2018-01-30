package homeWorks1;


public class Main {


    public static void main(String[] args) {


        Cat cat1 = new Cat("Alisa", 2, 3, 2);
        Cat cat2 = new Cat("Leva", 1, 2, 3);
        Cat cat3 = new Cat("Mysa", 4, 5, 7);
        System.out.println(cat3.fight(cat2));
        System.out.println(cat3.fight(cat1));
        System.out.println(cat2.fight(cat1));
    }

}
