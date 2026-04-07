import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM MANAJEMEN STAF RUMAH SAKIT ===\n");
        
        // Membuat staf (POLIMORFISME - disimpan sebagai tipe StaffMember)
        List<StaffMember> daftarStaf = new ArrayList<>();
        daftarStaf.add(new Dokter("D001", "Dr. Arya", 150000000, "Jantung"));
        daftarStaf.add(new Dokter("D002", "Dr. Ricardo", 160000000, "Saraf"));
        daftarStaf.add(new Perawat("N001", "Suster Ubay", 80000000, "ICU"));
        daftarStaf.add(new Perawat("N002", "Suster Bima", 82000000, "IGD"));
        daftarStaf.add(new Administrator("A001", "Bapak Lanang", 100000000, "Keuangan"));
        
        // Demonstrasi POLIMORFISME - method yang sama, perilaku berbeda
        System.out.println("--- INFORMASI STAF ---");
        for (StaffMember staf : daftarStaf) {
            staf.tampilkanInfo();  // Perilaku polimorfik
            staf.bekerja();         // Perilaku polimorfik
            System.out.println();
        }
        
        // Demonstrasi INHERITANCE - mengakses method khusus
        System.out.println("--- TINDAKAN KHUSUS PERAN ---");
        
        Dokter drBudi = (Dokter) daftarStaf.get(0);
        drBudi.lakukanOperasi();
        drBudi.lakukanOperasi();
        
        Perawat susterUbay = (Perawat) daftarStaf.get(2);
        susterUbay.berikanObat("Bapak Widi");
        
        Administrator pakLanang = (Administrator) daftarStaf.get(4);
        pakLanang.setujuiAnggaran(75000000);
        
        // Demonstrasi ENCAPSULATION - bekerja dengan pasien
        System.out.println("\n--- PERAWATAN PASIEN ---");
        Pasien pasien1 = new Pasien("Bapak Widi", "Demam");
        Pasien pasien2 = new Pasien("Bapak Agung", "Patah Tulang");
        
        pasien1.tampilkanRekamMedis();
        pasien2.tampilkanRekamMedis();
        
        // Menugaskan pasien ke staf
        drBudi.bekerja();
        susterUbay.berikanObat(pasien1.getNama());
        
        // Demonstrasi Penjadwal Shift
        System.out.println("\n--- MANAJEMEN SHIFT ---");
        PenjadwalShift penjadwal = new PenjadwalShift();
        penjadwal.tugaskanShift(drBudi, "Pagi");
        penjadwal.tugaskanShift(susterUbay, "Malam");
        penjadwal.tugaskanShift(pakLanang, "Siang");
        penjadwal.cetakJadwal();
        
        // Demonstrasi polimorfisme dengan perhitungan gaji
        System.out.println("\n--- RINGKASAN GAJI ---");
        double totalGaji = 0;
        for (StaffMember staf : daftarStaf) {
            System.out.printf("%s: Rp%,.0f%n", staf.getNama(), staf.hitungGaji());
            totalGaji += staf.hitungGaji();
        }
        System.out.printf("Total gaji seluruh staf: Rp%,.0f%n", totalGaji);
    }
}
