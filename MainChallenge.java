import challenge.DataDiri;
import challenge.VolumeBalok;
import challenge.VolumeKubus; 

public class MainChallenge {
    public static void main(String[] args) {
       
        DataDiri diri = new DataDiri("Alfarizki Nugroho", "X-RPB", 6, "PPLG");
        diri.tampilkan();

        
        VolumeBalok balok = new VolumeBalok(10, 5, 4);
        balok.tampilkan();

        
        VolumeKubus kubus = new VolumeKubus(5);
        kubus.tampilkan();
    }
}