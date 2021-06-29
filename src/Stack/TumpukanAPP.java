
package Stack;
public class TumpukanAPP {
    public static void main(String args[]){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(6);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println("Nilai teratas = " + tumpukan.peek());
        System.out.println("Nama Saya Adalah Widya");
        System.out.println("Nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
    }
}
    

