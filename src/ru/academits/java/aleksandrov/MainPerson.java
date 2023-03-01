package ru.academits.java.aleksandrov;

public class MainPerson {
    public static void main(String[] args) {
        Person man1 = new Person("Egor", "Aleksandrovich", "Aleksandrov", 39);
        Person man2 = new Person("Ivan", "Ivanovich", "Ivanov", 27);

        System.out.println(man1 + " " + man1.getBirthYear() + " г.р.");
        System.out.println(man2 + " " + man2.getBirthYear() + " г.р.");
    }
}