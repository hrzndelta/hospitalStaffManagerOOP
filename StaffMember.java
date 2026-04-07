public abstract class StaffMember {
    private String id;
    private String nama;
    private double gaji;
    
    public StaffMember(String id, String nama, double gaji) {
        this.id = id;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    // Method abstrak - setiap tipe staf harus mengimplementasikan ini
    public abstract double hitungGaji();
    public abstract String getPeran();
    public abstract void bekerja();
    
    // Method konkret - sama untuk semua staf
    public String getNama() {
        return nama;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void tampilkanInfo() {
        System.out.printf("%s (%s) - Gaji: Rp%,.0f%n", nama, getPeran(), hitungGaji());
    }
}