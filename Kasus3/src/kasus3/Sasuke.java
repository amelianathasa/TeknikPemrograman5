package kasus3;

/**
 * @author Amelia Nathasa
 * @since 2022-03-12
 * @version 1.0
 */

//Kelas Sasuke merupakan turunan dari kelas Itachi 
public class Sasuke extends Itachi{
    //Inisialisasi nilai pada variabel Dojutsu 
    String Dojutsu = "Sharingan";
    
    
    void printDojutsu(){
        super.printDojutsu();       //Memanggil printDojutsu dari superclass
        System.out.println(this.Dojutsu);
    }
}




























