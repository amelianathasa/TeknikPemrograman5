package kasus2;

/**
 * @author Amelia Nathasa
 * @since 2022-03-12
 * @version 1.0
 */
public class Restaurant {
    //Kelas Restaurant untuk membuat fungsi fungsi 
    //Deklarasi variabel 
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    //Constructor
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

     //Method untuk menambah menu makanan pada daftar menu
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    //Method untuk menampilkan daftar menu makanan
    public void tampilMenuMakanan(){
        System.out.println("\n Menu Restaurant");
        System.out.println("-----------------------");
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    //Counter id 
    public static void nextId(){
        id++;
    }
    
    //Menngecek stok makanan
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    //Method untuk menghitung jumlah biaya yang perlu dibayar setelah order 
     public double jumlahBayar(int jumlahMakanan, double harga){ 
        double jumlahBayar = 0;
        jumlahBayar = jumlahMakanan * harga; 
        return jumlahBayar; 
    }
    
     //Menampilkan makanan yang telah di order
    public void tampilOrder(String namaMakanan, double jumlahBayar, int jumlahMakanan){
        System.out.println("\nPesanan");
        System.out.println("-----------------");
        System.out.println("Nama Makanan   : " + namaMakanan);
        System.out.println("Jumlah Makanan : " + jumlahMakanan);
        System.out.println("Total          : Rp. " + jumlahBayar);
        
    }
    
    //Method yang digunakan untuk menambahkan order makanan
    public void orderMakanan(String namaMakanan, int jumlahMakanan){
 
        for(int i=0; i<=id;i++){
            if(!isOutOfStock(i)){
                if(nama_makanan[i].equals(namaMakanan)){
                    double jumlahBayar;
                    jumlahBayar = jumlahBayar(jumlahMakanan, harga_makanan[i]);
                    //Pengecekkan stok makanan
                    if(stok[i] < jumlahMakanan){
                        System.out.println("Stok " + namaMakanan + " Kurang");
                    }else if(stok[i] > jumlahMakanan){
                        stok[i] = stok[i] - jumlahMakanan; 
                        tampilOrder(namaMakanan, jumlahBayar, jumlahMakanan);
                        tampilMenuMakanan();
                    }else{  
                        System.out.println("Stok " + namaMakanan + " Kosong");
            
                    }     
                }
            }
        }     
    }  
}
