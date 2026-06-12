package ch08;

//주사위를 던져서 6이나올때 까지
public class WhileTest3 {
    public static void main(String[] args) {


        int testCount = 0;
        while (testCount < 100){
            int num = 0;
            int count = 0;
            // math.random(): 0 이상 1미만의 무작위 double 타입의 숫자를 반환
            while(num!=6){
                //주사위를 던지기
                num = (int)(Math.random()*6) + 1;
//            System.out.println(num);
                count++;
            }
            System.out.println("c"+count);

            testCount++;
        }
        System.out.println("t"+testCount);









    }
}
