public class Perawat extends StaffMember {
    private String unit;
    
    public Perawat(String id, String nama, double gaji, String unit) {
        super(id, nama, gaji);
        this.unit = unit;
    }
    
    @Override
    public double hitungGaji() {
        // Perawat mendapat tunjangan shift malam
        return getGaji() + 2000000; // Rp2.000.000 tunjangan
    }
    
    @Override
    public String getPeran() {
        return "Perawat - Unit " + unit;
    }
    
    @Override
    public void bekerja() {
        System.out.println(getNama() + " sedang merawat pasien dan memeriksa tanda-tanda vital");
    }
    
    // Method khusus perawat
    public void berikanObat(String namaPasien) {
        System.out.println(getNama() + " memberikan obat kepada " + namaPasien);
    }
}