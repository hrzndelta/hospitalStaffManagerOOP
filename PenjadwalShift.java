import java.util.*;

public class PenjadwalShift {
    private Map<String, String> jadwal = new HashMap<>();
    
    public void tugaskanShift(StaffMember staf, String shift) {
        jadwal.put(staf.getNama(), shift);
        System.out.println(staf.getNama() + " ditugaskan untuk shift " + shift);
    }
    
    public void cetakJadwal() {
        System.out.println("\n--- JADWAL SHIFT ---");
        for (Map.Entry<String, String> entry : jadwal.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}