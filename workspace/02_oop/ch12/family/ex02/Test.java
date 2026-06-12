package ch12.family.ex02;

public class Test {
    public static void main(String[] args) {
//        Parent p = new Parent("부모");// 지역변수이기 떄문에 데일리스케줄에서 p를 못가져옴.
        Son p = new Son("아들");
//        Daughter p = new Daughter("딸");
        dailySchedule(p);




    }


    //하루일과
    //parent 타입의 매개변수 정의
//    private static void dailySchedule(Parent p){
//        p.eat();
//        p.play();
//        p.sleep();
//    }
    private static void dailySchedule(Parent p){

        p.eat();
        p.play();
//        Son s = (Son)p;//부모를 자식으로 형변환 시키는것 (downcasting 다운캐스팅 )
        if(p instanceof Son){
            Son s = (Son)p;
            s.study();
        }

        p.sleep();
    }
//    private static void dailySchedule(Daughter p){
//        p.eat();
//        p.play();
//        p.sleep();
//    }

}
