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

    public static class Cat {
        String name;
        int age;
        int weight;
        int strength;


        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }


            

        public Cat() {
        }

        public boolean fight(Cat anotherCat){
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
            int score = agePlus + weightPlus + strengthPlus;
            return score > 2;
        }




    }
}
