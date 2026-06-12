package ch10;

public class MethodTest {
     void main() {
        add();
        add100(20);
        printSum(20,30);
        int result = getSum(30, 40);
         System.out.println(result);
    }

    //10과 100의 합계를 출력하는 메서드
     void add(){
        int n1 = 10;
        int n2 = 100;
        int sum = n1 + n2;
         System.out.println(n1 +" + "+n2+ " = "+sum);
    }

    //전달되는 인자와 100의 합계를 출력하는 메서드
    void add100(int n1){

        int n2 = 100;
        int sum = n1 + n2;
        System.out.println(n1 +" + "+n2+ " = "+sum);
    }

    //인자 두개의 합계를 출력하는 메서드
    void printSum(int n1, int n2){
        int sum = n1 + n2;
        System.out.println(n1 +" + "+n2+ " = "+sum);
    }

    //전달되는 인자 두개의 합계를 반환하는 메서드
    int  getSum(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }

}
