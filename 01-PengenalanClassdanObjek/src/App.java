Class Mahasiswa {
    //Data Member atau ciri
    String nama;
    String NIM;

    // constructor
    Mahasiswa (String inputNama, String inputNIM){
        this.nama = nama;
        this.NIM = NIM;

    }
    // method tanpa return dan tanpa parameter
    void cetak(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
    }
    // method dengan parameter dan tanpa return
    void setNama(String nama){
        this.nama = nama;

    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;

    }

    String getNIM(){
        return this.NIM;

    }
    // method dengan parameter dan return
    String sayHi(String pesan){
        return "Hi.." + this.nama + pesan;
    }


}




public class App {
    public static void main(String[] args) throws Exception {
        // membuat Objek 
        Mahasiswa mhs_1 = new Mahasiswa ("ana","23256748");

        // memanggil method tanpa parameter dan return mhs_1.cetak();

        // memanggil method dengan parameter tanpa return
        mhs_1. setNama("Syarma");
        mhs_1.cetak(); 

        // memanggil method dengan return tanpa parameter
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        // memanggil method dengan parameter dan return
        String pesan = mhs_1.sayHi("sukses belajar OOP");
        System.out.println(pesan);

        }
    

}