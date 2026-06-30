package ch02;

import java.util.*;

public class CollectionTest {
    void main(){
//        String[] fruits = {"바나나", "사과", "오렌지", "파인애플", "수박"};
//        printFruit(fruits);


//        ArrayList<String> fruits = new ArrayList<>();

//
//        LinkedList<String> fruits = new LinkedList<>();
//        바나나
//                사과
//        오렌지
//                사과
//        파인애플

        //set
        //데이터 중복 X
        //저장한 순서 X
//        HashSet<String> fruits = new LinkedList<>();

        //정렬 O
        TreeSet<String> fruits = new TreeSet<>();
        //저장한 순서 O
//        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("바나나");
        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("사과");
        fruits.add("파인애플");


        printFruit(fruits);
    }
    //전달받은 과일목록을 출력한다.
    void printFruit(String[] fruits){
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }

    void printFruit(ArrayList<String> fruits){
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }


    void printFruit(LinkedList<String> fruits){
        for(String fruit: fruits){
            System.out.println(fruit);
        }
}
    void printFruit(HashSet<String> fruits){
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
    void printFruit(TreeSet<String> fruits){
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }


    }

