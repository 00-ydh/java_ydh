package ch07;

//회원 등급에 따른 할인 혜택을 적용하는 예제
//골드 등급: 50% 할인
//실버 등급: 30% 할인
//브론즈 등급 10% 할인
//일반 등급: 0% 할인
public class SwitchTest2 {
    public static void main(String[] args) {
        int price = 10000;
        int lastPrice = price;
        char grade = 'C';
        int discoutRate = 0;

        //if문 사용
        if(grade == 'A'){
            discoutRate = 50;

        } else if (grade == 'B') {
            discoutRate = 30;

        } else if (grade == 'C') {
            discoutRate = 10;

        } else if (grade == 'D') {
            discoutRate = 0;

        }

        //switch
        switch (grade){
            case 'A':
                discoutRate = 50;
                break;
            case 'B':
                discoutRate = 30;
                break;
            case 'C':
                discoutRate = 10;
                break;
            case 'D':
                discoutRate = 0;
                break;




        }




        lastPrice =  (int) (price * (1 - discoutRate / 100.0));
        System.out.println("회원님은 "+grade+"등급 이므로 정상가 "+price+"원에서 "+discoutRate+" 할인된 가격 "+lastPrice+" 입니다.");

    }
}
