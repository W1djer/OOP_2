package home_1;

import static home_1.inter.OW;

public class home_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 3, "Валера");
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Вася", 7, "Леха");

        cat2.setName("Кузя");
        cat2.setAge(4);
        cat2.setOwner(OW);
        cat1.greet();
        cat1.setOwner();

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        cat1.greet();
        cat2.greet();
        cat3.greet();

    }

}
