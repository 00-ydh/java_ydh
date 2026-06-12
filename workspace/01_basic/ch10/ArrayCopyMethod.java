package ch10;

import java.util.Arrays;

public class ArrayCopyMethod {
    //전달받은 배열의 모든 요소를 출력하는 메서드
    static void printArray(int[] arr, String name){
        System.out.print(name+": ");
//        for(int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        for (int elem : arr){
            System.out.println(elem+" ");
        }
        System.out.println();
    }
    // 원본 배열과 복사 배열을 출력한 후 값을 수정하고 다시 출력한다.
    static void testArr(int[] original, int[]shallow){
        printArray(original, "원본배열");
        printArray(shallow, "복사배열");


        shallow[0] = 99;
        original[0] = 88;


        printArray(original, "원본배열");
        printArray(shallow, "복사배열");
    }


    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] shallow = original;
        //original, shallow 의 모든 요소를 출력
        testArr(original, shallow);


        // 2. 깊은 복사
        System.out.println("깊은 복사 수동복사 (for문 사용)");
        //이미 선언된 변수에 새로운 배열을 할당하려면 new int[original.length]형태로 작성해야 함
        original = new int[]{10, 20 , 30, 40 ,50};//배열 선언과 함꼐 써야함
        shallow = new int[original.length];


        for (int i = 0; i<original.length; i++){
            shallow[i] = original[i];
        }

        testArr(original, shallow);

        //3. 깊은복사 (system.arraycopy() 이용)
        System.out.println("--------------system.arraycopy() 이용");

        original = new int[]{10, 20 , 30, 40 ,50};//배열 선언과 함꼐 써야함
        shallow = new int[original.length];


        System.arraycopy(original, 0,shallow,0, original.length);

        testArr(original, shallow);



        //4. 깊은복사 (arrays.copyof()이용)
        System.out.println("----------------------");
        original = new int[]{10, 20 , 30, 40 ,50};//배열 선언과 함꼐 써야함
        shallow = Arrays.copyOf(original,original.length);


        testArr(original, shallow);
    }
}
