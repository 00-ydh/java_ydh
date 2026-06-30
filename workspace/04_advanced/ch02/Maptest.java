package ch02;

import java.util.*;

public class Maptest {
    void main(){


       Map fruits = new HashMap();

        fruits.put("월", "바나나");
        fruits.put("화", "사과");
        fruits.put("수", "오렌지");
        fruits.put("목", "사과");
        fruits.put("수", "수박");
        fruits.put("금", "사과");

        String fridayFruits = (String) fruits.get("금");

        printFruit(fruits);
    }
    //전달받은 과일목록을 출력한다.
    void printFruit(Map fruits){
        System.out.println(fruits.get("월"));
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

