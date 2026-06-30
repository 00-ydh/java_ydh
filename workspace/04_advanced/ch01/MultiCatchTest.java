package ch01;

public class MultiCatchTest {
    void main(){
        divide(100, new String[]{"hello"});
        divide(100, new String[]{"      "});
        divide(100, new String[]{});
        divide(100, null);

        System.out.println("프로그램 종료");
    }

    //num1을 arr 배열의 index 0 값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나눈 결과를 출력
    void divide(int num1, String[] arr){
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException |NullPointerException e){
            System.out.println(e.getMessage());
       } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr 사이즈가 0입니다.");
        }


    }
    void divide2(int num1, String[] arr){
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr 사이즈가 0입니다.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void divide3(int num1, String[] arr){
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    void divide4(int num1, String[] arr){
            if(arr != null && arr.length>0 && arr[0]!= null && arr[0].trim().length()>0){
                int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
                int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
                System.out.println(num1 + " / " + num2 + " = " + result);
            }



    }
}
