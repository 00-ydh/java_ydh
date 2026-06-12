package ch13.family.ex02;

import ch13.family.ex01.Daughter;
import ch13.family.ex01.Parent;

public class Test {
    public static void main(String[] args) {
        Daughter p = new Daughter("딸");

        dailySchedule(p);


    }

    private static void dailySchedule(Parent p) {
        p.eat();
        p.play();

        p.sleep();

    }
}