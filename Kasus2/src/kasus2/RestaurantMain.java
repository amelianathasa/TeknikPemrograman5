package kasus2;
import java.util.Scanner;
/**
 * @author Amelia Nathasa
 * @since 2022-03-10
 * @version 1.0
 */
public class RestaurantMain {
    
    public static void main(String[] args) {
        //Kelas RestaurantaMain untuk memanggil fungsi-fungsi lain dari kelas Restaurant 
        //Kamus Data 
        String namaMakanan;
        int jumlahMakanan;
       
        Restaurant menu = new Restaurant();     //Membuat objek menu 
        
        menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();       //Menampilkan menu makanan
        
        //Form untuk melakukan order makanan
        Scanner order = new Scanner(System.in);
        System.out.println("\n Order Makanan");
        System.out.println("-----------------------");
        System.out.println("Nama Makanan   : ");
        namaMakanan = order.nextLine();
        System.out.println("Jumlah Makanan : ");
        jumlahMakanan = order.nextInt();
        
        //Fungsi untuk membuat order makanan
        menu.orderMakanan(namaMakanan, jumlahMakanan);
        
        
    }
}
        
        
    
    
    
