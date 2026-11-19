package challenge;

public class DataDiri {
    public String nama;
    public String kelas;
    public int absen;
    public String jurusan;

    public DataDiri(String nama, String kelas, int absen, String jurusan) {
        this.nama = nama;
        this.kelas = kelas;
        this.absen = absen;
        this.jurusan = jurusan;
    }

    public void tampilkan() {
        System.out.println("   DATA DIRI SISWA   ");
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("Absen   : " + absen);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("---------------------------");
    }
}