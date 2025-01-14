package src.com.tutorial;

public class Main {
    
}
class PetugasKeamanan {
    private String nama;
    private double gajiPokok;
    private double tunjangan;
    private int jamLembur;
    private double gajiBersih;

    public PetugasKeamanan(String nama, double gajiPokok, double tunjangan, int jamLembur, String tipePegawai) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.jamLembur = jamLembur;
        hitungGajiBersih(tipePegawai);
    }

    // Getter
    public String getNama() { return nama; }
    public double getGajiPokok() { return gajiPokok; }
    public double getTunjangan() { return tunjangan; }
    public int getJamLembur() { return jamLembur; }
    public double getGajiBersih() { return gajiBersih; }


    // Setter (hanya untuk tunjangan dan jam lembur)
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
        hitungGajiBersih("tetap"); // Hitung ulang jika tunjangan berubah
    }

    public void setJamLembur(int jamLembur) {
        if (jamLembur >= 0) { // Penanganan kesalahan: mencegah jam lembur negatif.
            this.jamLembur = jamLembur;
            hitungGajiBersih("tetap"); // Hitung ulang jika jam lembur berubah
        } else {
            System.out.println("Kesalahan: Jam lembur tidak boleh negatif.");
        }
    }

    private void hitungGajiBersih(String tipePegawai) {
        double upahLembur;

        if (tipePegawai.equals("tetap")) {
            upahLembur = jamLembur * (0.10 * gajiPokok + gajiPokok); // 10% dari gaji pokok + gaji pokok
            gajiBersih = gajiPokok + tunjangan + upahLembur;
        } else { // tidak tetap
            upahLembur = jamLembur * (0.05 * gajiPokok + gajiPokok); // 5% dari gaji pokok + gaji pokok
            gajiBersih = gajiPokok + upahLembur;
        }
    }

    public void tampilkanDetailKaryawan() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("--------------------");
    }
}


public class main {
    public static void main(String[] args) {
        // Contoh penggunaan:
        PetugasKeamanan petugas1 = new PetugasKeamanan("John Doe", 5000000, 3500000, 10, "tetap");
        PetugasKeamanan petugas2 = new PetugasKeamanan("Jane Smith", 4000000, 0, 5, "tidak tetap");


        petugas1.setJamLembur(12); // Mengubah jam lembur
        petugas1.setTunjangan(4000000); // Mengubah tunjangan

        petugas1.tampilkanDetailKaryawan();
        petugas2.tampilkanDetailKaryawan();
    }
}