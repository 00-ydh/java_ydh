package ch08;

public class ForSolve {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;

        //1~100까지의 합계
        for (int num = 1;  num <=100; num++ ){
            sum+=num;

        }System.out.println(sum);


        //1~100까지의 홀수 합계
        for (int num = 1;  num <=100; num+=2 ){
            sum2+=num;
        }System.out.println(sum2);


        //1~100까지의 짝수 합계
        for (int num = 2;  num <=100; num+=2 ){
            if(num % 2 == 0){
                sum3+=num;

            }
        }System.out.println(sum3);
    }
}
