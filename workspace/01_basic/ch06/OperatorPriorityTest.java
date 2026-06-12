package ch06;

public class OperatorPriorityTest {
    static void main(String[] args) {
        int result = 5 + 3 * 2;
        System.out.println("result (15 + 3 * 2) = " + result);


        int result20 = (5 + 3) *2 ;
        System.out.println("result (15 + 3 * 2) = " + result20);


        // 1) 곱셈과 덧셈의 우선순위 비교
        int result1 = 5 + 3 * 2; // 곱셈(*)이 덧셈(+)보다 우선하므로 3 * 2가 먼저 수행되어 11이 됨
        System.out.println(result1); // 11

// 2) 비교 연산과 논리 연산의 우선순위 비교
        boolean result2 = 10 > 5 && 3 < 1; // 비교(>, <)가 논리(&&)보다 우선하여 (true && false)가 되므로 false가 됨
        System.out.println(result2); // false

// 3) 괄호()를 통한 강제 우선순위 지정 (가장 안전하고 강력한 실무 권장 기법)
        int result3 = (5 + 3) * 2; // 괄호 안의 덧셈이 먼저 실행되어 8 * 2 = 16이 됨
        System.out.println(result3); // 16

    }











}
