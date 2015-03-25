package com.aspose.tasks.model;

import org.joda.time.*;
public class WorkingTime {
  private String FromTime = null;
  private String ToTime = null;
  /**
	 * getFromTime
	 * Gets DateTime
	 * @return FromTime
	 */
  public String getFromTime() {
    return FromTime;
  }

	/**
	 * setFromTime
	 * Sets DateTime
	 * @param FromTime DateTime
	 */
  public void setFromTime(String FromTime) {
    this.FromTime = FromTime;
  }

  /**
	 * getToTime
	 * Gets DateTime
	 * @return ToTime
	 */
  public String getToTime() {
    return ToTime;
  }

	/**
	 * setToTime
	 * Sets DateTime
	 * @param ToTime DateTime
	 */
  public void setToTime(String ToTime) {
    this.ToTime = ToTime;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingTime {\n");
    sb.append("  FromTime: ").append(FromTime).append("\n");
    sb.append("  ToTime: ").append(ToTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

