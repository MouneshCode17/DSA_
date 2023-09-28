package StackImp;

public class Stack {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
   private Node top;
    private int height;
   Stack(int value){
       Node newNode=new Node(value);
       top=newNode;
       System.out.println(newNode.next);
       height=1;
   }
   public boolean push(int value){

      Node newNode=new Node(value);
      if(height==0){
          top=newNode;
          height++;
          return true;
      }
      newNode.next=top;
      top=newNode;
      height++;

return true;

   }
   public Node pop(){
       if(height==0)return null;
       Node temp=top;
       top=temp.next;
       temp.next=null;
       height--;
       return temp;
   }
   public void getTop(){
       System.out.println("TOP==>"+top.value);
   }
   public void printStack(){
       Node temp=top;
       while(temp!=null){
           System.out.println(temp.value);
           temp=temp.next;
       }
   }

}

