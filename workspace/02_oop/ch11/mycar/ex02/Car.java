package ch11.mycar.ex02;


//필드와 메서드 정의한 클래스
public class Car {
    //필드
    String model;
    int speed; //필드를 초기화 하지 않으면 기본값으로 초기화 됨
    int gear;


    //생성자 : 인스턴스가 생성할 때 자동으로 홀출되는 메서드
    //기본 생성자 : 매개변수가 없는 생성자
    Car(){
        System.out.println("car()생성자 호출됨");
    }

    Car(String model){
        System.out.println("Car (String name)생성자 호출됨");
        this.model = model;
    }

    void speedUp(){
        speed += 10;
        System.out.println("가속합니다. 현재 속도는" + speed + "km/h입니다.");


    }


    void speedDown(){
        speed -= 10;
        System.out.println("감속합니다. 현재 속도는" + speed + "km/h입니다.");

    }

    void gearUp(){
        gear++;
        System.out.println("기어를 1단 올려서 "+gear+"단이 되었습니다.");
    }

    void gearDown(){
        gear--;
        System.out.println("기어를 1단 내려서 "+gear+"단이 되었습니다.");
    }

    void start(){
        System.out.println(model + "출발합니다.");
        gearUp();
        speedUp();

    }
    void stop(){
        System.out.println("멈춥니다.");
        gear = 0;
        while(speed>0) {
            speedDown();
        }

    }
}
