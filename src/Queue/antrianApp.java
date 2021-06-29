package Queue;
public class antrianApp {
    public static void main(String[] args) {
       var antri = new Antrian(10);
        antri.enQueue(07);
        antri.print();
        antri.enQueue(60);
        antri.print();
        System.out.println("nilai yang paling depan = "+antri.peekDepan());
        System.out.println("Nama saya adalah Marifatul Ikhsan");
        System.out.println(" ");
        antri.enQueue(70);
        antri.print();
        System.out.println("yang diambil dari antrian = "+antri.deQueue());
        antri.print();
        System.out.println("nilai yang paling depan = "+antri.peekDepan());
       
    }  
}
