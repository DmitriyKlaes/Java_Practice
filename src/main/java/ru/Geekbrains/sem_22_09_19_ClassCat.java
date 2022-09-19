package ru.Geekbrains;

/*
1. Продумайте структуру класса Кот.
Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class sem_22_09_19_ClassCat implements Comparable<sem_22_09_19_ClassCat> {
    private int id;
    private int age;
    private double weight;
    private String name;
    private String breed;
    private String color;
    private String medicalCard;

    public sem_22_09_19_ClassCat(int id,
                                 int age,
                                 double weight,
                                 String name,
                                 String breed,
                                 String color,
                                 String medicalCard) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.medicalCard = medicalCard;
    }

    public sem_22_09_19_ClassCat(String name) {
        this(0, 0, 0, name, null, null, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(String medicalCard) {
        this.medicalCard = medicalCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        sem_22_09_19_ClassCat sem_22_09_19_ClassCat = (sem_22_09_19_ClassCat) o;
        return id == sem_22_09_19_ClassCat.id && Objects.equals(name, sem_22_09_19_ClassCat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "a002{" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", medicalCard='" + medicalCard + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<sem_22_09_19_ClassCat> cats = new HashSet<>();
        cats.add(new sem_22_09_19_ClassCat("Яромур"));
        cats.add(new sem_22_09_19_ClassCat(1,2,3.0,"Яромур2", "Дворовой","Рыжий", "Здоров"));
        System.out.println(cats);
    }

    @Override
    public int compareTo(sem_22_09_19_ClassCat o) {
        return Integer.compare(this.age, o.age);
    }
}
