package StackImp;

public class StackMain {
    public static void main(String[] args) {
        Stack a=new Stack(6);
        a.getTop();
        a.push(7);
        a.push(88);
        a.pop();
        a.printStack();


    }
}
