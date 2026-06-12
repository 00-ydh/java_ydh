package ch12.mycar;

public class BusTest {
    void main(){
        Bus mycar = new Bus("람보르기니", "10-2", "마을버스", new String[]{"우리집","김포고", "김포시청"},1300, 15);


        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.speedUp();
        mycar.stop();


        System.out.println(mycar.getBusInfo());
    }
}