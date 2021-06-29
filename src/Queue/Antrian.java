package Queue;
public class Antrian {
     public static void main(String args []){
        Antrian antrian = new Antrian(5);
        antrian.enqueue(9);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = "+antrian.dequeue());
        System.out.println("Nama saya adalah Widya");
        antrian.display();
        System.out.println();
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = "+antrian.peek());
    }

    Antrian(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void enqueue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
