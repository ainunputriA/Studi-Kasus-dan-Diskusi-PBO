public class Mobil extends Kendaraan {

    public Mobil(String nama) {
        super(nama);
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + nama);
    }
}