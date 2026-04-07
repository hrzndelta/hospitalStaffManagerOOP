public class Pasien {
    private String nama;
    private String kondisi;
    
    public Pasien(String nama, String kondisi) {
        this.nama = nama;
        this.kondisi = kondisi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void tampilkanRekamMedis() {
        System.out.println("Pasien: " + nama + " | Kondisi: " + kondisi);
    }
}