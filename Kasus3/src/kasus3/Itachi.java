package kasus3;

/**
 *
 * @author Amelia Nathasa
 * @since 2022-03-12
 * @version 1.0
 */
//Kelas itachi merupakan turunan dari kelas Rikudo 
public class Itachi extends Rikudo{
    
    public String KekkeiGenkai = "Susanoo";
    public String Dojutsu = super.Dojutsu;  //Mengambil dojutsu dari superclass
    
    void printKekkeiGenkai(){
        System.out.println(this.KekkeiGenkai);  
    }
    
     public void setDojutsu(){
        this.Dojutsu = "Mangekyou Sharingan";
    }
     
    //Mencetak isi dari vaariabel Dojutsu
    void printDojutsu(){
        System.out.println(this.Dojutsu);
        setDojutsu();   //Set dojutju yang baru 
        System.out.println(this.Dojutsu);  //Print yang ada pada setDojutsu 
    }
    
   
}












