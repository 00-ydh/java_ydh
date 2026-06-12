package ch12.car;

public class BusTest {
    void main(){
        Bus mycar = new Bus("람보르기니", "10-2", "마을버스", new String[]{"우리집","김포고", "김포시청"},1300, 15);


        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.speedUp();
        mycar.stop();

//        Bus mycar2 = new Bus("wksr", "10-2", "마을버스", new String[]{"우리집","김포고", "김포시청"},1300, 15);
        Bus mycar2 = new Bus("람보르기니", "10-2", "마을버스", new String[]{"우리집","김포고", "김포시청"},1300, 15);



        mycar2.start();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();

        mycar2.speedUp();
        mycar2.stop();


        System.out.println(mycar2.toString());
        System.out.println(mycar);


    }
}