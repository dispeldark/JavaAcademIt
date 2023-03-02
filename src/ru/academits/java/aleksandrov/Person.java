package ru.academits.java.aleksandrov;

import java.time.YearMonth;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    public static final int minAge = 15;
    public static final int maxAge = 115;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Zа-яА-Я]+")) {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName.matches("[a-zA-Zа-яА-Я]+")) {
            this.middleName = middleName;
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (familyName.matches("[a-zA-Zа-яА-Я]+")) {
            this.familyName = familyName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= minAge && age <= maxAge) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + "}";
    }

    public int getBirthYear() {
        int currentYear = YearMonth.now().getYear();
        return currentYear - getAge();
    }
}