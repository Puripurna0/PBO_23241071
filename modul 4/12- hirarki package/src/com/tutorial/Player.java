package src.com.tutorial;

// import package eksternal
import com.terminal.Console;

// visibilitas default hanya bisa diakses oleh
// package yang sama
class Player {
    //variabel objek
    private String nama;

    // konstruktor
    Player(String nama){
        this.nama1 = nama;
        this.nama2 = nama;
    }

    // method cetak
    void cetak(){
        System.out.println("Nama : " + this.nama);
       Console.log(pesan:"Menggunakan Console");
       Console.log("Nama : " = this.nama);

    }
    
    // method getter
    String getName(){
        return this.nama;
    }
}
