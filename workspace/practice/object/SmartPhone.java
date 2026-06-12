//package practice.object; // p를 채워서 package로 수정
//
//// 스마트폰 클래스 정의
//class SmartPhone {
//    String model; // 스마트폰의 모델명을 저장할 문자열 변수
//    String os;    // 스마트폰의 운영체제를 저장할 문자열 변수
//
//    public SmartPhone(String model, String os) { // 생성자
//        this.model = model;
//        this.os = os;
//    }
//} // SmartPhone 클래스 끝!
//
//// 대문자 M으로 수정하고, 파일 안에 서브 클래스로 쓰기 위해 public을 지웠습니다.
//class Main {
//    public static void main(String[] args) {
//        // 메모리(Heap)의 서로 다른 위치에 두 개의 갤럭시 객체를 새로 만듭니다.
//        SmartPhone p1 = new SmartPhone("galaxy", "android");
//        SmartPhone p2 = new SmartPhone("galaxy", "android");
//
//        // 1. toString() 테스트
//        // Object의 기본 toString()이 작동하여 [클래스명@해시코드] 형태의 외계어가 출력됩니다.
//        System.out.println(p1.toString());
//
//        // 2. equals() 테스트
//        // Object의 기본 equals()는 '==' 연산자와 똑같이 메모리 주소값을 비교합니다.
//        // p1과 p2는 들고 있는 데이터가 완벽히 같지만, new로 각자 만들어 주소가 다르므로 false가 나옵니다.
//        System.out.println(p1.equals(p2)); // 출력: false
//    }
//} // Main 클래스 끝