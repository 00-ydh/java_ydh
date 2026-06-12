package ch13.family.ex01;

public class Son extends Parent{
    Son(String name){
        super(name);
    }

    void play(){
        System.out.println(name+"게임을 한다.");
    }

    private void work(){
        System.out.println(name+"일한다.");

    }
    public void study(){
        System.out.println(name+"도서관에서 공부한다.");
    }




}
