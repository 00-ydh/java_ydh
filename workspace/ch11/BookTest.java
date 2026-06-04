package ch11;

//하나의 소스코드(.java) 내에 여러개의 클래스를 정의할 수 있음

//단 public class는 하나에만 지정 가능하고 파일명과 동일한 클래스에만 지정 가능함
class Book{
    String title;     //클래스 변수(맴버 변수)
    String author;    //클래스 변수(맴버 변수) //힙 영역에 진짜로 만들어진 객체?


    //생성자 작성
Book(){
    this("제목미상", "작가미상");
//    this.title = "제목미상";
//    this.author = "작가미상";
}

Book(String title, String author){
    this.title = title;
    this.author = author;
}

    //생성자 작성

}
public class BookTest {

    public static void main(){
        Book book1 = new Book();  // book클래스타입의 지역변수 book1 생성 스택에 지역변수 book1생성
        book1.title = "자바기초";  //맴버 변수 참조?
        book1.author = "자바의신";
        Book book2 = new Book("자바를 자바라!", "용쌤");//지역변수 선언과 동시에 인스턴스안에 string 문자열 설정?
        System.out.println("제목: "+book1.title+" 작가: "+book1.author);
        System.out.println("제목: "+book2.title+" 작가: "+book2.author);

    }
}
