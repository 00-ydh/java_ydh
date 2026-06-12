package ch10;

public class VarargsTest {
    //int 2개의 합계를 출력하는 메서드
    void sum(int n1, int n2){
        System.out.println("sum 메서드 시작");
        int result =  n1 + n2;
        System.out.println(n1+" + "+n2+" = "+result);
        System.out.println("sum메서드 종료");

    }
    //int 3개의 합계를 출력하는 메서드
    void sum(int n1, int n2, int n3){
        System.out.println("sum 메서드 시작");
        int result =  n1 + n2 + n3;
        System.out.println(n1+" + "+n2+"+"+n3+ " = "+result);
        System.out.println("sum메서드 종료");

    }


    //int 4개의 합계를 출력하는 메서드
    void sum(int n1, int n2, int n3, int n4){
        System.out.println("sum 메서드 시작");
        int result =  n1 + n2 + n3;
        System.out.println(n1+" + "+n2+"+"+n3+"+"+n4+ " = "+result);
        System.out.println("sum메서드 종료");

    }
    //int n개의 합계를 출력하는 메서드
    void sum(int ...nums){
        int result = 0;
        for (int num : nums){
            result+= num;

        }
        System.out.println("합계: "+result);
    }

    void main() {
        System.out.println("main 메서드 시작");
        sum(10, 20);
        System.out.println("main 메서드 종료");
        sum(10, 20, 50);
        sum(10,20,30,50);

    }
}
