package QueueImp;

public class QueueMain {
    public static void main(String[] args) {
        Queue q=new Queue(9);
        q.enqueue(99);
        q.enqueue(88);
        q.enqueue(77);
        q.deQueue();
        q.printQueue();
        q.getFirst();
        q.getLast();
    }
}
