package challenge;

public class VolumeBalok {
    public double panjang;
    public double lebar;
    public double tinggi;

    public VolumeBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void tampilkan() {
        System.out.println("   HITUNG VOLUME BALOK   ");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Tinggi  : " + tinggi);
        System.out.println("Volume  : " + hitungVolume());
        System.out.println("---------------------------");
    }
}