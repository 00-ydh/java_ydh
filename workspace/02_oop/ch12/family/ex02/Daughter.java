package ch12.family.ex02;

public class Daughter extends Parent {
    String name;

    //생성자: 클래스명과 동일한 이름, 리턴타입은 없음
    Daughter(String name){
        super(name);
    }


    void play(){
        System.out.println(name + "코노에 간다.");
        doFaceMask();

    }
    private void doFaceMask(){
        System.out.println(name + "마스크팩을 한다.");
    }

}
