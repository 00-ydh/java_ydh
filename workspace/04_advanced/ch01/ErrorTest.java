package ch01;

public class ErrorTest {
    public static void main(String[] args) {
        int num = 0;
        try {
            int result = 10 / num;
            System.out.println("result" + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try{
            makeError();

        }catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println("에러발생: "+ t.getClass().getSimpleName());
        }


    }

    static void makeError(){
        makeError();//재귀호출
    }
}