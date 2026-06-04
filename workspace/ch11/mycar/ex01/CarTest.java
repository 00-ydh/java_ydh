package ch11.mycar.ex01;

public class CarTest {
    void main(){
        //car 인스턴스 생성
        //생성한 인스턴스의 타입은 클래스가 된다.
        Car mycar = new Car();

        //인스텅스의 필드나 메서드를 접근할때 . 연산자를 사용한다.
        mycar.model = "부가티";
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();


    }
}
