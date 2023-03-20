package src;

import java.util.HashMap;

public class PatientRecords {

  /**
   * Class keeping track of all patient data through a HashMap of patient IDs to their health
   * records.
   */

  private HashMap<Integer, HealthRecord> idToRecord = new HashMap<Integer, HealthRecord>();

  /**
   * Adds a patient to the records
   * @param id given patient id
   * @param record patient's health record
   */
  public void addPatient(int id, HealthRecord record) {
    this.idToRecord.put(id, record);
  }

  /**
   * Returns the count of patients with a given blood type
   * @param bloodType type to count
   * @return integer representing the number of patients that match
   */
  public int patientsWithBloodType(BloodType bloodType) {
    int patientsCount = 0;
    for (Integer id : this.idToRecord.keySet()) {
      if (this.idToRecord.get(id).bloodTypeEquals(bloodType)) {
        patientsCount ++;
      }
    }
    return patientsCount;
  }

  /**
   * Returns the count of patients with a given blood type above a certain age
   * @param bloodType type to count
   * @param age minimum age
   * @return integer representing the number of patients that match
   */
  public int patientsWithBloodTypeAboveAge(BloodType bloodType, int age) {
    int patientsCount = 0;
    for (Integer id : this.idToRecord.keySet()) {
      if (this.idToRecord.get(id).getAge() >= age && this.idToRecord.get(id).bloodTypeEquals(bloodType)) {
        patientsCount ++;
      }
    }
    return patientsCount;
  }
}

