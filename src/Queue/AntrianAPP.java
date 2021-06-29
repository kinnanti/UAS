
package Queue;
public class AntrianAPP {
     public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(6);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama saya adalah Widya ");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
    

