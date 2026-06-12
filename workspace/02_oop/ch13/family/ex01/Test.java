package ch13.family.ex01;

public class Test {
    public static void main(String[] args) {
        Parent p = new Son("아둘");

        dailySchedule(p);


    }

    private static void dailySchedule(Parent p) {
        p.eat();
        p.play();
        if (p instanceof Son){
            Son s = (Son) p;
            s.study();
        }
        p.sleep();

    }
}