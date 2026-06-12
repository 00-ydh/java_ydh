package ch13.family.ex02;
//상속, 다형성, instanceof사용
//추상클래스
//1. 추상메서드가 하나라도 있으면 반드시 추상 클래스로 선언
//2. 직접 객체 생성이 불가
public abstract  class Parent {
    String name;

    void eat(){
        System.out.println(name+ ": 음식을 맛있게 먹는다.");
    }
    void play(){
        System.out.println(name+ ": 등산한다.");
    }
    void sleep(){
        System.out.println(name+ ": 잠을 잔다.");
    }


    //부모 관점에서는 구현할 내용이 없음
    //자식이 오버라이드 해서 구현하기를 원함(강제로 오버라이드 하도록 지정)
    //추상메서드
    abstract void study();




}
