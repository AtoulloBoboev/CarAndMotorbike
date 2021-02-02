package com.codewithatoullo;

/**
 * Создать класс Автомобиль (англ. Car) и Мотоцикл (Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля.
 * Создать экземпляр класса Автомобиль. Задать значение для каждого поля,
 * используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 * В классах Автомобиль и Мотоцикл реализуйте два метода: void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
 */

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setYear(2020);
        car.setModel("Tesla");

        Motorbike motorbike = new Motorbike(2010, "black", "kawasaki");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(1900));
        System.out.println(motorbike.yearDifference(2020));
    }
}
