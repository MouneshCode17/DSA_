public class LinkedList {
   private Node head;
   private Node tail;
   private int length;
   class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
   public LinkedList(int value){
       Node newNode=new Node(value);
       head=newNode;
       tail=newNode;
       length=1;
   }
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public Node removeLast(){
       if(length==0){
           return null;
       }
       Node temp=head;
       Node pre=head;
       while(temp.next!=null){
           pre=temp;
           temp=temp.next;

       }
       tail=pre;
    pre.next=null;
       temp.next=null;
       length--;
       if(length==0){
           tail=null;
           head=null;
       }
       return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            tail=newNode;
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
        length++;

    }
   public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
   }
   public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp=head;
        head=temp.next;
        temp.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
   }
   public Node get(int index){
        if(index< 0||index>=length){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
         return temp;
   }
   public boolean set(int index,int value){
        if(index<0||index>=length)return false;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.value=value;
         return true;
   }
   public boolean insert(int index,int value){
        Node newNode=new Node(value);
        Node temp=head;
        Node pre=head;
        if(index<0||index>=length) return false;
            for(int i=0;i<index-1;i++){
               temp=temp.next;
        }

            newNode.next=temp.next;
       temp.next=newNode;
       length++;
            return true;
   }

   public Node remove(int index){
        if(index<0||index>=length)return null;
        if(index==0) return removeFirst();
        if(index==length-1) return removeLast();
        Node pre=get(index-1);
        Node temp=get(index);
        pre.next=temp.next;
        temp.next=null;
        length--;
        return temp;
   }
   public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
       for (int i = 0; i < length; i++) {
           after=temp.next;
           temp.next=before;
           before=temp;
           temp=after;
       }
   }
   public void getHead(){
       System.out.println("Head:"+head.value);
   }
   public void getTail(){
       System.out.println("Tail:"+tail.value);
   }
   public void getLength(){
       System.out.println("Length is:"+length);
   }
}
