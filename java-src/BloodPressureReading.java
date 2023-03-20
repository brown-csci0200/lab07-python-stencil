package src;

public class BloodPressureReading implements ILabReport{

  /**
   * Class that models a blood type reading, with systolic and diastolic values
   */

  private int systolic;
  private int diastolic;

  public BloodPressureReading(int systolic, int diastolic) {
    this.systolic = systolic;
    this.diastolic = diastolic;
  }
}
