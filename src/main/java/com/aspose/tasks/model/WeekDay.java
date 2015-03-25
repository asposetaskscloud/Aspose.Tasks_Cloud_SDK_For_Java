package com.aspose.tasks.model;

import java.util.*;
import org.joda.time.*;
import com.aspose.tasks.model.DayType;
public class WeekDay {
  private String DayType = null;
  private Boolean DayWorking = null;
  private String FromDate = null;
  private String ToDate = null;
  private List<WorkingTime> WorkingTimes = new ArrayList<WorkingTime>();
  /**
	 * getDayType
	 * Gets DayType
	 * @return DayType
	 */
  public String getDayType() {
    return DayType;
  }

	/**
	 * setDayType
	 * Sets DayType
	 * @param DayType DayType
	 */
  public void setDayType(String DayType) {
    this.DayType = DayType;
  }

  /**
	 * getDayWorking
	 * Gets Boolean
	 * @return DayWorking
	 */
  public Boolean getDayWorking() {
    return DayWorking;
  }

	/**
	 * setDayWorking
	 * Sets Boolean
	 * @param DayWorking Boolean
	 */
  public void setDayWorking(Boolean DayWorking) {
    this.DayWorking = DayWorking;
  }

  /**
	 * getFromDate
	 * Gets DateTime
	 * @return FromDate
	 */
  public String getFromDate() {
    return FromDate;
  }

	/**
	 * setFromDate
	 * Sets DateTime
	 * @param FromDate DateTime
	 */
  public void setFromDate(String FromDate) {
    this.FromDate = FromDate;
  }

  /**
	 * getToDate
	 * Gets DateTime
	 * @return ToDate
	 */
  public String getToDate() {
    return ToDate;
  }

	/**
	 * setToDate
	 * Sets DateTime
	 * @param ToDate DateTime
	 */
  public void setToDate(String ToDate) {
    this.ToDate = ToDate;
  }

  /**
	 * getWorkingTimes
	 * Gets List<WorkingTime>
	 * @return WorkingTimes
	 */
  public List<WorkingTime> getWorkingTimes() {
    return WorkingTimes;
  }

	/**
	 * setWorkingTimes
	 * Sets List<WorkingTime>
	 * @param WorkingTimes List<WorkingTime>
	 */
  public void setWorkingTimes(List<WorkingTime> WorkingTimes) {
    this.WorkingTimes = WorkingTimes;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekDay {\n");
    sb.append("  DayType: ").append(DayType).append("\n");
    sb.append("  DayWorking: ").append(DayWorking).append("\n");
    sb.append("  FromDate: ").append(FromDate).append("\n");
    sb.append("  ToDate: ").append(ToDate).append("\n");
    sb.append("  WorkingTimes: ").append(WorkingTimes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

