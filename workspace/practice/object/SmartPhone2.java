package practice.object;

import java.util.Objects;

public class SmartPhone2 {
    String model;
    String os;

    public SmartPhone2(String model, String os){
        this.model = model;
        this.os = os;
    }

    // toString() 재정의 : 객체 자체를 출력하거나 문자열과 더할 때 자동으로 호출되는 메서드
    @Override
    public String toString() {
        //기존의 클래스명@해시코드 대신, 실제 들고 있는 데이터를 문자열로 이쁘게 조립해서 반환한다.
        return "SmartPhone2{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

// 두 개의 객체가 논리적으로 같은지 비교하는 메서드 generate 사용.
    @Override
    public boolean equals(Object o) {
        // 안전장치 1 : 비교하러 들어온 (o)이 비어있다면 비교도 할 필요없이 false
        // 안전장치 2 : 내 클래스 종류 getclass와 들어온 애의 클래스종류 o.getclass가 다르면
        //스마트폰과 컴퓨터를 비교하는 꼴이 되므로 역시 바로 false를 반환
        if (o == null || getClass() != o.getClass()) return false;

        //위에서 무사히 통과했다면 'o'는 확실히 null이 아니고 SmartPhone2 타입이 맞다는 뜻입니다.
        // 이제 부모 옷(Object)을 벗고 자식 옷(SmartPhone2)으로 안전하게 다운캐스팅(형변환)을 합니다.
        SmartPhone2 that = (SmartPhone2) o;

        // 내 모델명(model)과 상대방 모델명(that.model)이 같고,
        // 내 OS(os)와 상대방 OS(that.os)가 둘 다 일치하는지 비교한 결과를 반환합니다.
        // Objects.equals()를 쓰면 변수가 null일 때 발생할 수 있는 에러(NullPointerException)를 알아서 막아줍니다.
        return Objects.equals(model, that.model) && Objects.equals(os, that.os);
    }
    // equals()가 true가 나온 객체들은 반드시 '똑같은 숫자(해시코드)'를 반환해야 한다는 자바의 규칙을 지키기 위한 메서드입니다
    @Override
    public int hashCode() {
        return Objects.hash(model, os);
    }
}
    class Main1 {
        public static void main(String[] args) {
            // 힙(Heap) 메모리에 "Galaxy", "Android" 데이터를 가진 첫 번째 스마트폰 객체를 생성합니다.
            SmartPhone2 p1 = new SmartPhone2("Galaxy", "Android");
            // 힙(Heap) 메모리의 또 다른 위치에 똑같은 데이터를 가진 두 번째 스마트폰 객체를 생성합니다.
            SmartPhone2 p2 = new SmartPhone2("Galaxy", "Android");
            // 1. toString() 출력 단락
            // System.out.println에 객체를 그대로 집어넣으면 자바가 내부적으로 p1.toString()을 호출합니다.
            // 우리가 위에서 재정의했기 때문에 이상한 주소값 대신 필드 값이 예쁘게 출력됩니다.
            System.out.println(p1); // 출력: SmartPhone [model=Galaxy, os=Android]

            // 2. equals() 출력 단락
            // 재정의된 equals()가 실행되면서 주소가 달라도 내부 데이터가 같으므로 true를 반환합니다.
            System.out.println(p1.equals(p2)); // 출력: true

            // 3. hashCode() 출력 단락
            // 데이터가 같으면 동일한 정수 값을 반환하도록 해시코드를 재정의했기 때문에 두 객체의 해시값이 똑같이 나옵니다.
            // 이 덕분에 HashSet이나 HashMap 같은 자료구조에서 p1과 p2를 같은 객체로 올바르게 인식하게 됩니다.
            System.out.println(p1.hashCode()); // 출력: 2134567 (예시 정수값)
            System.out.println(p2.hashCode()); // 출력: 2134567 (p1과 완전히 일치함)



        }
    }
