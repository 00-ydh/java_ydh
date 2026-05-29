package ch10;

public class MethodSolve {


    // int[] 점수를 전달받아서 총점을 계산해서 반환하는 메서드
    // int 총점을 전달받아서 평균을 계산해서 반환하는 메서드
    //평균은 소수도 표현해야함

    //총점과 평균을 전달받아서 출력하는 메서드
    //총점: 268, 평균 89.4
    int sum(int [] arr){
        int sum = 0;
        for (int i = 0; i<arr.length;i++){

            sum+=arr[i];

        }

        return sum;

    }

    double avg(int[] arr){
        int total = sum(arr);
        return (double)total/arr.length;

    }

    void printScore (int[] arr){
        int sum = sum(arr);
        double avg = avg(arr);

        System.out.println("총점 : "+sum );
        System.out.println("평균 : "+ avg);
    }




    void main(){
        //haru는 국어 영어 수학 점수가 각각 80 79 56이다.
        //namu는 국어 영어 수학 점수가 각각 90 77 80이다.
        //brong은 국어 영어 수학 점수가 각각 100 99 88 이다.

        //이셋의 총점과 평균을 구해서 출력하세요.


        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};


        sum(haruScore);

    }

}
