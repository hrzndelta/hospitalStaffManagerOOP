public class Dokter extends StaffMember {
    private String spesialis;
    private int jumlahOperasi;
    
    public Dokter(String id, String nama, double gaji, String spesialis) {
        super(id, nama, gaji);
        this.spesialis = spesialis;
        this.jumlahOperasi = 0;
    }
    
    @Override
    public double hitungGaji() {
        // Dokter mendapat bonus per operasi
        return getGaji() + (jumlahOperasi * 500000); // Rp500.000 per operasi
    }
    
    @Override
    public String getPeran() {
        return "Dokter - " + spesialis;
    }
    
    @Override
    public void bekerja() {
        System.out.println(getNama() + " sedang mendiagnosis dan merawat pasien");
    }
    
    // Method khusus dokter
    public void lakukanOperasi() {
        jumlahOperasi++;
        System.out.println(getNama() + " melakukan operasi ke-#" + jumlahOperasi);
    }
}