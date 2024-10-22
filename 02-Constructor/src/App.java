// class polos atau tanpa constructor
class Polos {
    // atribut objek 
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    // atribut
    String nama;
    String NIM;
    String prodi;

    // constructor
    // namanya sama dengan nama class
    // tidak memiliki return value/ nilai balik
    // method yang pertama kali dipanggil saat objek pertama kali di panggil saat class tersebut di buat
    Mahasiswa 
    (String inputNama, String inputNIM, String inputProdi){
        nama = inputNama;
        NIM = inputNIM;
        prodi = inputProdi;

        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + prodi);
    }
}





public class App {
    public static void main(String[] args) throws Exception {
        // pembuatan objek atau instansiasi objek
        Polos polos_1 = new Polos();

        // isi atribut
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        // cetak objek
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // pembuatan objek mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("putri", "23241879", "PTI");

        //  pembuatan objek mahasiswa
        Mahasiswa mhs_2 = new Mahasiswa("tia", "2324256", "PTI");
        
    }
}
