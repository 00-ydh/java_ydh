package ch02.list;

public class PerformanceTest {
    void main(){
        int times = 100;
        MyArray list = new MyArray();
        long start = System.currentTimeMillis();
        addFirst(list, times);
        long end = System.currentTimeMillis();
        System.out.println("MyArray addFirst 소요시간: "+(end-start)+"ms");
    }

    void addFirst(MyArray list, int times){
        for(int i = 0; i<times;i++){
            list.append(0,"데이터-"+i);
        }
    }
}
