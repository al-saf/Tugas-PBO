package challenge;

public class VolumeKubus {
    public double sisi;
    
    public VolumeKubus(double sisi) {
        this.sisi = sisi;
    }
   
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public void tampilkan() {
        System.out.println("   HITUNG VOLUME KUBUS   ");
        System.out.println("Panjang Sisi : " + sisi);
        System.out.println("Volume Kubus : " + hitungVolume());

    }
}