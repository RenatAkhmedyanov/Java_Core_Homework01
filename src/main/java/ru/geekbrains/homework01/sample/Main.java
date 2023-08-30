package ru.geekbrains.homework01.sample;

import ru.geekbrains.homework01.regular.Decorator;
import ru.geekbrains.homework01.regular.OtherClass;

public class Main {

    public static void main(String[] args) {
        int result = OtherClass.add(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(5, 5);
        System.out.println(Decorator.decorate(result));
    }

}
