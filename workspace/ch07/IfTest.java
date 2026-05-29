package ch07;


//입력한 숫자가 3의 배수일 경우 3의 배수입니다 출력
//그렇지 않을 경우 아무것도 하지 않는다.
public class IfTest {
    public static void main(String[] args) {
        int num = 15;


//        if (num % 3 == 0){
//            System.out.println("3의 배수입니다.");
//
//        }
//
//        if (num % 3 != 0){
//            System.out.println("3의 배수가 아닙니다.");
//
//        }
        if (num % 3 == 0) {
            System.out.println("3의 배수 입니다.");

        }else if (num % 2 ==0){
            System.out.println("짝수입니다.");

        } else{
            System.out.println("홀수입니다.");
        }





    }
}
