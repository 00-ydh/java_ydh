package ch02.list;

public class MyLinkedList implements MyList {
    //inner 클래스 생성
    private class Node{
        /**
         * 저장할 객체
         */
        private Object data;

        /**
         * 연결된 다음 노드를 참조하는 변수
         */
        private Node nextNode;
        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }

        }


    private Node header;
    private int size;

    public MyLinkedList(){
        header = new Node(null);
    }

    public void appendFirst(Object data){
        Node node = new Node(data);
        //헤더가 가리켜고 있는 첫번째 노드의 주소를 삽입한 노드의 nextNode로 지정
        node.nextNode = header.nextNode;
        //헫저의 첫번쨰 노드를 새로 생성한 노드로 지정
        header.nextNode = node;
        size++;
    }

    public void add(int index, Object data){
        if(index ==0 ){
            appendFirst(data);

        }else{
            Node newNode = new Node(data);
            Node pNode = getNode(index);
            Node nNode = pNode.nextNode;
            newNode.nextNode = nNode;
            pNode.nextNode= newNode;

        }
    }
    private Node getNode(int index){
        Node node = header.nextNode;
        for(int i = 0; i<index; i++){
            node = node.nextNode;
        }
        return node;
    }
}
