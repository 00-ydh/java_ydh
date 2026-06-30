package ch02.list;

//배열의 불편한 점
//생성시 길이를 지정해야 함
//생성된 배열의 길이는 수정 못함
//요소 추가, 삭제 삽입이 어려움
//이러한 불편한 점을 개선하여 배열을 쓰기 쉽게 만드는 클래스
public class MyArray implements MyList{
    private Object[] data;
    private int count;
    /**
     * 기본 생성자
     * 초기 배열의 크기를 10개로 지정한다.
     */
    public  MyArray(){
        this(10);// public MyArray(int size)
    }

    /**
     * 지정한 size 크기의 배열을 생성한다.
     *
     * @param size 배열의 초기 크기
     */

    public MyArray(int size){
    data = new Object[size];
    }

    /**
     * 배열의 마지막 위치에 지정한 elem을 추가한다.
     * @param elem
     */
    public void add(Object elem){
        add(count, elem);
    }

    /**
     * 지정한 index에 지정한 elem을 추가한다.
     * @param index 삽일할 위치
     * @param elem  삽일할 요소
     */
    public void add(int index, Object elem){
        if(count>= data.length){

            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }else if(index<0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0 " );

        }else if(index > count){
            throw new ArrayIndexOutOfBoundsException(index + " > 0 "+count );

        }

        if(count >= data.length){
            Object[] temp = new Object[data.length+data.length/2];
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            System.out.println(data.length + "->"+temp.length);
            data = temp;
        }

        // index 부터 끝까지 하나씩 뒤로 미는 작업
        System.arraycopy(data, index, data, index+1, count -index);
        data[index] = elem;
        count++;
    }

    /**
     * 지정한 index의 요소를 삭제한다.
     * @param index
     */
    public void remove(int index){
        if(index >= count){
            //데이터가 리턴 된다. 원래 리턴되면 안되잖아.
            //System.out.println("인덱스를 벗어났습니다.");
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }else if(index<0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0 " );

        }
        System.arraycopy(data, index+1, data, index, count -index-1);
        count--;
        data[count] = null;
    }

    public Object getElem(int index){
        if(index >= count){
            //데이터가 리턴 된다. 원래 리턴되면 안되잖아.
            //System.out.println("인덱스를 벗어났습니다.");
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }else if(index<0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0 " );

        }
        return data[index];
    }

    public int size() {
        return this.count;

    }


//    @Override
//    public String toString(){
//       String str = "[";
//
//       if(count > 0){
//       str += data[0];
//}
//       for(int i = 1; i<count; i++){
//           str += "," + data[i] ;
//       }
//       str += "]";
//
//       return str;
//    }


@Override
public String toString(){
//        StringBuffer str = new StringBuffer("["); // 멀티 스레드 환경에서 사용
    StringBuilder str = new StringBuilder("["); // 싱글 스레드 환경에서 사용

    if(count > 0) {
        str.append(data[0]);
    }

    for(int i=1; i<count; i++){
        str.append(", ").append(data[i]);
    }

    str.append("]");

    return str.toString();
}


}
