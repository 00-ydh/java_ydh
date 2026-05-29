package ch09;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = {3,6,7,8,5,3,5,6,8,2,3};
        //1. arr의 모든 요소를 출력하세여
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        //2. arr의최소값과 최대값을 구하세요
        //
        int min = arr[0];
        int max = arr[0];
//        for (int i =1; i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("최소값" + min);
//        System.out.println("최대값" + max);
        Arrays.sort(arr);
        System.out.println("최소값: "+arr[0]);
        System.out.println("최대값: "+arr[arr.length-1]);

        //3. arr의 모든 요소를 오른차순으로 정렬하세요
        for (int i = 0; i<arr.length; i++){
            for (int k = i; k<arr.length-1;k++){
                if (arr[i]>arr[k+1]){
                    //arr[i] arr[k+1]
                    int temp = arr[i];
                    arr[i] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }




        //4. arr2와 arr3의 모든 요소가 같은 값을 가지고 있는지 출력하세요.(순서와 값이 모두 일치)
        // arr2 arr3 다름
        // arr2, arr4 같음
        int [] arr2 = {1,2,3};
        int [] arr3 = {2,1,3};
        int [] arr4 = {1,2,3};

//        System.out.println(arr2 == arr3);
//        System.out.println(arr2 == arr4);
//        boolean isEqual = true;//두 배열의 요소가 같으면 true, 아니면 false
//
//        for (int i = 0; i<arr2.length; i++){
//            if(arr2[i]!=arr3[i]){
//                isEqual = false;
//                break;
//            }
//        }
//        System.out.println("arr2, arr3 같다."+isEqual);
//
//        isEqual = true;//두 배열의 요소가 같으면 true, 아니면 false
//
//        for (int i = 0; i<arr2.length; i++){
//            if(arr2[i]!=arr4[i]){
//                isEqual = false;
//                break;
//            }
//        }
//        System.out.println("arr2, arr4 같다."+isEqual);
        System.out.println("arr2 arr3"+Arrays.equals(arr2,arr3));
        System.out.println("arr2 arr4"+Arrays.equals(arr2,arr4));


    }
}
