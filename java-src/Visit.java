package src;

import java.util.ArrayList;
import java.util.Date;

public class Visit {

  /**
   * This class represents a single visit with a patient, containing their recorded temperature,
   * weight, lab reports, and the date of the visit.
   */

  private int temp;
  private int weight;
  private Date date;
  private ArrayList<ILabReport> labReports;

  public Visit(int temp, int weight, Date date) {
    this.temp = temp;
    this.weight = weight;
    this.date = date;
    this.labReports = new ArrayList<ILabReport>();
  }

  /**
   *
   * @return the patient's temperature
   */
  public int getTemp() {
    return this.temp;
  }

  /**
   * Adds a Lab Report (BloodPressureReading or WhiteCellCount) to the visit
   * @param report report to add
   */
  public void addLabReport(ILabReport report) {
    this.labReports.add(report);
  }
}
