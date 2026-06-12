package ch07;
//나이에 따른 입장료 할인 계산하는 프로그램을 작성하시오
//7세이하 : 영유아 할인 100% 할인
//8세~13세: 어린이 50% 할인
//14세~19세: 청소년 30% 할인
//65세 이상: 70% 할인
public class IfSwitchTest3 {
    public static void main(String[] args) {
        int age = 15;
        int price = 20000;
        double discountRate = 0.0;//할인율
        int lastPrice = price;

//        switch(age){
//            case 7 :
//        }
//
        if(age<=7){
            discountRate = 1;

        } else if (age>=8 && age<=13) {
            discountRate = 0.5;
        } else if (age>=14 && age<=19) {
            discountRate=0.3;
        }else if(age>=65){
            discountRate=0.7;
        }else{
            discountRate = 0;
        }

        lastPrice =  (int)(price * (1- discountRate) );

        System.out.println("나이가 "+age+"세 이므로 할인율 "+discountRate*100+"%가 적용되어 요금은 "+lastPrice+"원 입니다.");


    }
}
