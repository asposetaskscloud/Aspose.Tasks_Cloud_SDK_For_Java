package com.aspose.tasks.model;

import java.util.*;
import org.joda.time.*;

import com.aspose.tasks.model.Month;

public class CalendarException {
  private Boolean EnteredByOccurrences = null;
  private String FromDate = null;
  private String ToDate = null;
  private Integer Occurrences = null;
  private String Name = null;
  private String Type = null;
  private Integer Period = null;
  private List<DayType> DaysOfWeek = new ArrayList<DayType>();
  private String MonthItem = null;
  private String String = null;
  private String Month = null;
  private Integer MonthDay = null;
  private Boolean DayWorking = null;
  private List<WorkingTime> WorkingTimes = new ArrayList<WorkingTime>();
  /**
	 * getEnteredByOccurrences
	 * Gets Boolean
	 * @return EnteredByOccurrences
	 */
  public Boolean getEnteredByOccurrences() {
    return EnteredByOccurrences;
  }

	/**
	 * setEnteredByOccurrences
	 * Sets Boolean
	 * @param EnteredByOccurrences Boolean
	 */
  public void setEnteredByOccurrences(Boolean EnteredByOccurrences) {
    this.EnteredByOccurrences = EnteredByOccurrences;
  }

  /**
	 * getFromDate
	 * Gets String
	 * @return FromDate
	 */
  public String getFromDate() {
    return FromDate;
  }

	/**
	 * setFromDate
	 * Sets String
	 * @param FromDate String
	 */
  public void setFromDate(String FromDate) {
    this.FromDate = FromDate;
  }

  /**
	 * getToDate
	 * Gets String
	 * @return ToDate
	 */
  public String getToDate() {
    return ToDate;
  }

	/**
	 * setToDate
	 * Sets String
	 * @param ToDate String
	 */
  public void setToDate(String ToDate) {
    this.ToDate = ToDate;
  }

  /**
	 * getOccurrences
	 * Gets Integer
	 * @return Occurrences
	 */
  public Integer getOccurrences() {
    return Occurrences;
  }

	/**
	 * setOccurrences
	 * Sets Integer
	 * @param Occurrences Integer
	 */
  public void setOccurrences(Integer Occurrences) {
    this.Occurrences = Occurrences;
  }

  /**
	 * getName
	 * Gets String
	 * @return Name
	 */
  public String getName() {
    return Name;
  }

	/**
	 * setName
	 * Sets String
	 * @param Name String
	 */
  public void setName(String Name) {
    this.Name = Name;
  }

  /**
	 * getType
	 * Gets String
	 * @return Type
	 */
  public String getType() {
    return Type;
  }

	/**
	 * setType
	 * Sets String
	 * @param Type String
	 */
  public void setType(String Type) {
    this.Type = Type;
  }

  /**
	 * getPeriod
	 * Gets Integer
	 * @return Period
	 */
  public Integer getPeriod() {
    return Period;
  }

	/**
	 * setPeriod
	 * Sets Integer
	 * @param Period Integer
	 */
  public void setPeriod(Integer Period) {
    this.Period = Period;
  }

  /**
	 * getDaysOfWeek
	 * Gets List<DayType>
	 * @return DaysOfWeek
	 */
  public List<DayType> getDaysOfWeek() {
    return DaysOfWeek;
  }

	/**
	 * setDaysOfWeek
	 * Sets List<DayType>
	 * @param DaysOfWeek List<DayType>
	 */
  public void setDaysOfWeek(List<DayType> DaysOfWeek) {
    this.DaysOfWeek = DaysOfWeek;
  }

  /**
	 * getMonthItem
	 * Gets String
	 * @return MonthItem
	 */
  public String getMonthItem() {
    return MonthItem;
  }

	/**
	 * setMonthItem
	 * Sets String
	 * @param MonthItem String
	 */
  public void setMonthItem(String MonthItem) {
    this.MonthItem = MonthItem;
  }

  /**
	 * getString
	 * Gets String
	 * @return String
	 */
  public String getString() {
    return String;
  }

	/**
	 * setString
	 * Sets String
	 * @param String String
	 */
  public void setString(String String) {
    this.String = String;
  }

  /**
	 * getMonth
	 * Gets String
	 * @return Month
	 */
  public String getMonth() {
    return Month;
  }

	/**
	 * setMonth
	 * Sets Month
	 * @param String Month
	 */
  public void setMonth(String Month) {
    this.Month = Month;
  }

  /**
	 * getMonthDay
	 * Gets Integer
	 * @return MonthDay
	 */
  public Integer getMonthDay() {
    return MonthDay;
  }

	/**
	 * setMonthDay
	 * Sets Integer
	 * @param MonthDay Integer
	 */
  public void setMonthDay(Integer MonthDay) {
    this.MonthDay = MonthDay;
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
    sb.append("class CalendarException {\n");
    sb.append("  EnteredByOccurrences: ").append(EnteredByOccurrences).append("\n");
    sb.append("  FromDate: ").append(FromDate).append("\n");
    sb.append("  ToDate: ").append(ToDate).append("\n");
    sb.append("  Occurrences: ").append(Occurrences).append("\n");
    sb.append("  Name: ").append(Name).append("\n");
    sb.append("  Type: ").append(Type).append("\n");
    sb.append("  Period: ").append(Period).append("\n");
    sb.append("  DaysOfWeek: ").append(DaysOfWeek).append("\n");
    sb.append("  MonthItem: ").append(MonthItem).append("\n");
    sb.append("  String: ").append(String).append("\n");
    sb.append("  Month: ").append(Month).append("\n");
    sb.append("  MonthDay: ").append(MonthDay).append("\n");
    sb.append("  DayWorking: ").append(DayWorking).append("\n");
    sb.append("  WorkingTimes: ").append(WorkingTimes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

