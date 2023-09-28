package QueueImp;

public class Queue {
    private Node first;
    private Node last;
    private int line;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public Queue(int value){
        Node newNode =new Node(value);
        first=newNode;
        last=newNode;
        line++;
    }
    public boolean enqueue(int value){
        Node newNode=new Node(value);
        if(line==0){
            first=newNode;
            last=newNode;
            line++;
            return true;
        }
        last.next=newNode;
        last=newNode;
        line++;
        return true;
    }
    public Node deQueue(){
        if(line==0)return null;
        Node temp=first;
        first=temp.next;
        temp.next=null;
        return temp;
    }

    public void printQueue(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void getFirst(){
        System.out.println("FIRST==>"+first.value);
    }
    public void getLast(){
        System.out.println("LAST==>"+last.value);
    }


}
