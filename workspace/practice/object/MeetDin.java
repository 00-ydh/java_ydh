package object;

import java.util.Scanner;

public class MeetDin {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        meetYujin();
        scanner.close();
    }


    public static void meetYujin() {
        // 1. 일단 유진이 몸상태를 확인한다.
        boolean isHealthy = checkYujinHealth();
        if (!isHealthy) {
            System.out.println("아프니까 쉬어야겠네... ㅠㅠ 간호하러 가고 싶다.");
            return;
        }

        // 2. 만나도 괜찮은지 여부를 확인한다.
        boolean isAvailable = checkYujinAvailability();
        if (isAvailable) {
            System.out.println("만나러 가도 된당 ㅎㅎ!");
        } else {
            System.out.println("바쁜건가...ㅠ");
        }
    }


    public static boolean checkYujinHealth() {
        while (true) {
            System.out.print("유진이 몸 상태 좋아?? (응, 아니로만 대답 하시오.): ");
            String answer = scanner.next();

            if (answer.equals("응")) {
                return true;
            } else if (answer.equals("아니")) {
                return false;
            } else {

                System.out.println("응 아니로만 대답해줭...");
            }
        }
    }

    public static boolean checkYujinAvailability() {
        while (true) { // 올바른 대답을 할 때까지 무한 반복
            System.out.print("그럼 내가 오늘 가도 괜찮을까? (응, 아니로만 대답하시오.): ");
            String answer = scanner.next();

            if (answer.equals("응")) {
                return true;
            } else if (answer.equals("아니")) {
                return false;
            } else {
                System.out.println("응 아니로만 대답해줭..");
            }
        }
    }
}