package TugasSDA4;

import java.util.LinkedList;
import java.util.Queue;

public class Tugas4_Queue {
    public static void main(String[] args) {
        //mendeklarasikan queue
        Queue<String> queue = new LinkedList<String>();

        //elemen awal
        queue.add("Bunga");
        queue.add("Nurul");
        queue.add("Aina");
        queue.add("Mutiara");
        queue.add("Gebby");

        //awal program
        System.out.println("Selamat Datang di Puskesmas Pauh");
        System.out.println("Antrian : "+queue);
        System.out.println(" ");

        //enqueue = menambah elemen
        System.out.println("1. Perintah Enqueue");
        System.out.println("------------------------");
        System.out.println("Menambah Zikra dan Mila");
        queue.add("Zikra");
        queue.add("Mila");
        System.out.println("Antrian saat ini : "+queue);
        System.out.println(" ");

        //dequeue 
        System.out.println("2. Perintah Dequeue");
        System.out.println("------------------------");
        System.out.println("Antrian yang keluar : "+queue.poll());
        System.out.println(" ");

        //mengecek elemen paling atas
        System.out.println("3. Elemen Paling Atas Terbaru");
        System.out.println("------------------------");
        System.out.println("Antrian paling atas : "+queue.peek());
        System.out.println(" ");

        //mengecek elemen kosong 
        System.out.println("4. Pengecekan Elemen Kosong Atau Tidak");
        System.out.println("------------------------");
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong");
        }
        else {
            System.out.println("Antrian tidak kosong");
        }
        System.out.println(" ");

        //menampilkan size antrian
        System.out.println("5. Size Antrian");
        System.out.println("------------------------");
        System.out.println("Size antrian sekarang : " + queue.size());
        System.out.println(" ");

        //menampilkan banyak antrian
        System.out.println("6. Pengecekan Antrian");
        System.out.println("------------------------");
        System.out.println("Antrian yang masih ada : "+queue);
        System.out.println(" ");
    }
}
