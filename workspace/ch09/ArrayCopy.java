package ch09;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] shallow = original;
        //original, shallow 의 모든 요소를 출력
        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+"shallow: "+shallow[i]);
        }

        shallow[0] = 99;
        original[0] = 88;


        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+"shallow: "+shallow[i]);
        }

        // 2. 깊은 복사
        System.out.println("깊은 복사 수동복사 (for문 사용)");
        //이미 선언된 변수에 새로운 배열을 할당하려면 new int[original.length]형태로 작성해야 함
        original = new int[]{10, 20 , 30, 40 ,50};//배열 선언과 함꼐 써야함
        shallow = new int[original.length];
//        shallow[0] = original[0];
//        shallow[1] = original[1];
//        shallow[2] = original[2];
//        shallow[3] = original[3];
//        shallow[4] = original[4];

        for (int i = 0; i<original.length; i++){
            shallow[i] = original[i];
        }

        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+"shallow: "+shallow[i]);
        }

        shallow[0] = 99;
        original[0] = 88;


        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+"shallow: "+shallow[i]);
        }

        //3. 깊은복사 (system.arraycopy() 이용)
        System.out.println("--------------system.arraycopy() 이용");

        original = new int[]{10, 20 , 30, 40 ,50};//배열 선언과 함꼐 써야함
        shallow = new int[original.length];


        System.arraycopy(original, 0,shallow,0, original.length);

        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+"shallow: "+shallow[i]);
        }

        shallow[0] = 99;
        original[0] = 88;


        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+"shallow: "+shallow[i]);
        }



        //4. 깊은복사 (arrays.copyof()이용)
        System.out.println("----------------------");
        original = new int[]{10, 20 , 30, 40 ,50};//배열 선언과 함꼐 써야함
        shallow = Arrays.copyOf(original,original.length);


        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+" shallow: "+shallow[i]);
        }

        shallow[0] = 99;
        original[0] = 88;


        for(int i = 0; i<original.length;i++){
            System.out.println("original: "+original[i]+" shallow: "+shallow[i]);
        }
    }
}
