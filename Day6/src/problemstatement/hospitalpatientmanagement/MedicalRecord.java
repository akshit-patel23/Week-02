package problemstatement.hospitalpatientmanagement;
import java.util.ArrayList;
public interface MedicalRecord {
    void addRecord(String record);
    ArrayList<String> viewRecords();
}