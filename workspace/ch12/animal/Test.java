package ch12.animal;

public class Test {
    public static void main(String[] args) {
        Dog haru = new Dog();
//        Animal haru = new Dog();//자식인스턴스를 부모의 타입으로 선언 가능함.
//        haru.eat();// 부모에게 물려 받은 메서드
//        haru.bark();//추가한 메서드
        animalCare(haru);


        Notebook book = new Notebook();

//        animalCare(book);
        Cat c = new Cat();
        animalCare(c);

    }
    //동물관리 서비스
    static void animalCare(Dog a){
        a.eat();
        a.bark();
        a.sleep();
        a.move();
    }

    static void animalCare(Cat a){
        a.eat();
        a.liguefy();
        a.sleep();
        a.move();
    }
}
