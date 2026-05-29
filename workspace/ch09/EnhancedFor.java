package ch09;

public class EnhancedFor {
    public static void main(String[] args) {
        //int[] scores = {90, 80, 75};
        int[] scores = {100, 80, 70, 88};//4과목

        int sum = 0;// 총점
        double avg = 0; // 평균

        //과목 수와 상관ㅇ벗이 총점과 평균을 계산하시오. (과목수가 달라져도 이 코드는 수정하지 않습니다.)
        for(int i = 0; i <scores.length; i++){
            sum += scores[i];
        }

        //Enhanced for loop(향상된 for 구문)
        for(int score : scores){
            sum+=score;
        }


        avg = (double) sum / scores.length;

        System.out.println(" 총점: " + sum);
        System.out.println(" 총점: " + avg);


    }
}
