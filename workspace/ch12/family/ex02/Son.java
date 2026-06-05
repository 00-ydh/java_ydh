package ch12.family.ex02;
//Son이 Parent의 필드와 메서드를 상속 받는다.
//
public class Son extends Parent {


    //생성자: 클래스명과 동일한 이름, 리턴타입은 없음
    Son(String name) {

        super(name);//부모의 생성자를 호출할때
    }
    //오버라이딩(오버로드 아님): 상속받은 메서드를 재정의
    void play() {
        work();
        System.out.println(name + "게임한다.");
    }

    private void work(){
        System.out.println("일해야한다.");
    }
}