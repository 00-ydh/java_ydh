package ch08;

public class ForTest6 {
    public static void main(String[] args) {
        for (int i = 1; i<=9; i++){//행
            for(int k = 2; k<=9; k++){//열
                System.out.print(k+" x "+i+" = " + (i*k)+"\t ");
            }
            System.out.println();
        }
    }
}
