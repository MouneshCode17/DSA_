package HashImp;
public class HashMain {
    public static void main(String[] args) {
        HashTable hash=new HashTable();
        hash.set("Tony",560);
        hash.set("Stark",543);
        hash.printHash();
        System.out.println("contains:"+hash.get("Tony"));
        System.out.println(hash.keys());
    }
}
