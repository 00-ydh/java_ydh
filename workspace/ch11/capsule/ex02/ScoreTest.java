package ch11.capsule.ex02;

public class ScoreTest {
    public static void main(String[] args) {
        Score haru = new Score(100, 90, 80);
//        haru.kor = 100;
//        haru.eng = 90;
//        haru.math = 85;
//        int haruSum = haru.sum();
        double haruAvg = haru.avg();
//        System.out.println("하루의 총점: "+haruSum);
        System.out.println("하루의 평균: "+haruAvg);

        int haruBeforeMathScore = haru.getMath();
        int haruAfterMathScore = haruBeforeMathScore+5;
        haru.setMath(haruAfterMathScore);

        haruAvg= haruAvg;
        System.out.println("하루의 수정된 평균"+ haruAvg);

    }
}
