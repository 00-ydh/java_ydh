package ch02.list;

public interface MyList {
    /**
     * 지정한 데이터를 마지막 요소로 추가한다.
     * @param obj
     */
    void add(Object obj);

    /**
     * 지정한 데이터를 index 위치에 삽입한다.
     * @param index 삽일할 위치
     * @param obj 삽일할 데이터
     */
    void add(int index, Object obj );

    /**
     * 지정한 index의 데이터를 삭제한다.
     * @param index
     */
    void remove(int index);

    /**
     * 지정한 index의 데이터를 조회한다.
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * 데이터의 수를 반환한다.
     * @return
     */
    int size();
}
