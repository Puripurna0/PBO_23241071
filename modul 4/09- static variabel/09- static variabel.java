class Display{
    // variabel objek /Data Member
    private String nama;
    // variable static milik class
    static String tipe = "Display";

    // konstruktor
    Display(String nama){
        this.nama = nama;

    }

    // method cetak
    void cetak(){
        System.out.println("Display name : " + this.nama);
    }
    
    // method setter
    void setTipe(String tipeInput){
        tipe = tipeInput; // cara 1
        this.tipe = tipeInput; // cara 2
        Display.tipe = tipeInput; // cara 3
    }
}

public class App {
    public static void main (String [] args )throws Exception {
        // instansiasi objek
        Display display1 = new Display("Monitor");
        Display1.cetak();
        Display display2 = new Display("Smartphone");
        Display2.cetak();

        // menampilkan isi dari static variabel 
        System.out.println("menampilkan Statistic Variabel");
        System.out.println("objek1: " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("class : " + Display.tipe);

        // menulis ulang isi variabel static
        // display1.tipe = "tampilan";
        // display2.tipe = "tampilan";
        Display.tipe = "Tampilan";

        // menggunakan setter
        display1.setTipe("Spanduk");
        
        // memanggil isi variabel static
        System.out.println("menampilkan Statistic Variabel");
        System.out.println("objek1: " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("class : " + Display.tipe);

    
    }
}




 


 