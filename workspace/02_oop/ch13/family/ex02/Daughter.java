package ch13.family.ex02;

import ch13.family.ex01.Parent;

public class Daughter extends Parent {
    Daughter(String name){
        super(name);
    }

    void play(){
        System.out.println(name+ ": 코노에 간다.");
        doFaceMask();
    }


    private void doFaceMask(){
        System.out.println(name+": 마스크 팩을 한다.");
    }

}
