package ch08;

// 첫달에 1원을 받고 매달 두배씩 받을때 3년째 되는 날에는 얼마를 받는가?
// 몇달이 지나야 급여가 1억을 넘기는가?
public class ForTest2 {
    public static void main(String[] args) {
        
        int sal = 1;


        for (int month =1; month<=36; month++){
            
            sal = sal * 2;
        }

        System.out.println("3년의 급여 :" + sal);
    }
}
