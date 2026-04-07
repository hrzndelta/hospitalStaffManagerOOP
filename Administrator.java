public class Administrator extends StaffMember {
    private String departemen;
    
    public Administrator(String id, String nama, double gaji, String departemen) {
        super(id, nama, gaji);
        this.departemen = departemen;
    }
    
    @Override
    public double hitungGaji() {
        // Administrator mendapat bonus manajemen
        return getGaji() + 5000000; // Rp5.000.000 bonus
    }
    
    @Override
    public String getPeran() {
        return "Administrator - " + departemen;
    }
    
    @Override
    public void bekerja() {
        System.out.println(getNama() + " sedang mengatur jadwal dan anggaran");
    }
    
    // Method khusus administrator
    public void setujuiAnggaran(double jumlah) {
        System.out.printf("%s menyetujui anggaran: Rp%,.0f%n", getNama(), jumlah);
    }
}