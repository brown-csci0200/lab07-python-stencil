package src;

import java.util.ArrayList;

public class HealthRecord {

  /**
   * A class that contains a patient's entire health record, made up of a list of all of their
   * vists as well as their name, blood type, and age.
   */

  private String name;
  private BloodType bloodType;
  private ArrayList<Visit> visitList;
  private int age;

  public HealthRecord(String name, BloodType bloodType, ArrayList<Visit> visitList, int age) {
    this.name = name;
    this.bloodType = bloodType;
    this.visitList = visitList;
    this.age = age;
  }

  /**
   * Returns a copy of the patient's visit list only containing visits where the recorded
   * temperature is above a certain value
   * @param temp to check for visits above
   * @return list of visits above temp
   */
  public ArrayList<Visit> visitsAboveTemp(int temp) {
    ArrayList<Visit> returnList = new ArrayList<Visit>();
    for (Visit visit : visitList) {
      if (visit.getTemp() > temp) {
        returnList.add(visit);
      }
    }
    return returnList;

  }


  /**
   * Checks if a given blood type matches this patient's type
   * @param compareBloodType blood type to check against
   * @return true if matches, false if not
   */
  public boolean bloodTypeEquals(BloodType compareBloodType) {
    return compareBloodType.equals(this.bloodType);
  }

  /**
   *
   * @return the patient's age
   */
  public int getAge() {
    return this.age;
  }
}
