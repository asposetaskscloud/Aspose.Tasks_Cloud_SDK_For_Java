package com.aspose.tasks.model;

import java.util.*;
import org.joda.time.*;
import com.aspose.tasks.model.BookingType;
import com.aspose.tasks.model.WorkContourType;
import com.aspose.tasks.model.TimeUnitType;
import com.aspose.tasks.model.RateType;
public class ResourceAssignment {
//  private Integer TaskUid = null;
//  private Integer ResourceUid = null;
//  private Integer Uid = null;
//  private Integer PercentWorkComplete = null;
//  private Double ActualCost = null;
//  private String ActualFinish = null;
//  private Double ActualOvertimeCost = null;
//  private String ActualOvertimeWork = null;
//  private String ActualOvertimeWorkString = null;
//  private String ActualStart = null;
//  private String ActualWork = null;
//  private String ActualWorkString = null;
//  private Double Acwp = null;
//  private Boolean Confirmed = null;
//  private Double Cost = null;
//  private RateType CostRateTableType = null;
//  private Double CostVariance = null;
//  private Double Cv = null;
//  private Integer Delay = null;
//  private DateTime Finish = null;
//  private Integer FinishVariance = null;
//  private String Hyperlink = null;
//  private String HyperlinkAddress = null;
//  private String HyperlinkSubAddress = null;
//  private Double WorkVariance = null;
//  private Boolean HasFixedRateUnits = null;
//  private Boolean FixedMaterial = null;
//  private Integer LevelingDelay = null;
//  private TimeUnitType LevelingDelayFormat = null;
//  private Boolean LinkedFields = null;
//  private Boolean Milestone = null;
//  private String Notes = null;
//  private Boolean Overallocated = null;
//  private Double OvertimeCost = null;
//  private String OvertimeWork = null;
//  private String OvertimeWorkString = null;
//  private Double PeakUnits = null;
//  private String RegularWork = null;
//  private String RegularWorkString = null;
//  private Double RemainingCost = null;
//  private Double RemainingOvertimeCost = null;
//  private String RemainingOvertimeWork = null;
//  private String RemainingOvertimeWorkString = null;
//  private String RemainingWork = null;
//  private String RemainingWorkString = null;
//  private Boolean ResponsePending = null;
//  private DateTime Start = null;
//  private DateTime Stop = null;
//  private DateTime Resume = null;
//  private Integer StartVariance = null;
//  private Boolean Summary = null;
//  private Double Sv = null;
//  private Double Units = null;
//  private Boolean UpdateNeeded = null;
//  private Double Vac = null;
//  private String Work = null;
//  private String WorkString = null;
//  private WorkContourType WorkContour = null;
//  private Double Bcws = null;
//  private Double Bcwp = null;
//  private BookingType BookingType = null;
//  private String ActualWorkProtected = null;
//  private String ActualWorkProtectedString = null;
//  private String ActualOvertimeWorkProtected = null;
//  private String ActualOvertimeWorkProtectedString = null;
//  private DateTime CreationDate = null;
//  private String AssnOwner = null;
//  private String AssnOwnerGuid = null;
//  private Double BudgetCost = null;
//  private String BudgetWork = null;
//  private String BudgetWorkString = null;
//  private Integer RateScale = null;
//  private DateTime BaselineStart = null;
//  private DateTime BaselineFinish = null;
//  private String BaselineWork = null;
//  private String BaselineWorkString = null;
//  private Double BaselineCost = null;
//  private Double BaselineBcws = null;
//  private Double BaselineBcwp = null;
//  private DateTime Baseline1Start = null;
//  private DateTime Baseline1Finish = null;
//  private String Baseline1Work = null;
//  private String Baseline1WorkString = null;
//  private Double Baseline1Cost = null;
//  private Double Baseline1Bcws = null;
//  private Double Baseline1Bcwp = null;
//  private DateTime Baseline2Start = null;
//  private DateTime Baseline2Finish = null;
//  private String Baseline2Work = null;
//  private String Baseline2WorkString = null;
//  private Double Baseline2Cost = null;
//  private Double Baseline2Bcws = null;
//  private Double Baseline2Bcwp = null;
//  private DateTime Baseline3Start = null;
//  private DateTime Baseline3Finish = null;
//  private String Baseline3Work = null;
//  private String Baseline3WorkString = null;
//  private Double Baseline3Cost = null;
//  private Double Baseline3Bcws = null;
//  private Double Baseline3Bcwp = null;
//  private DateTime Baseline4Start = null;
//  private DateTime Baseline4Finish = null;
//  private String Baseline4Work = null;
//  private String Baseline4WorkString = null;
//  private Double Baseline4Cost = null;
//  private Double Baseline4Bcws = null;
//  private Double Baseline4Bcwp = null;
//  private DateTime Baseline5Start = null;
//  private DateTime Baseline5Finish = null;
//  private String Baseline5Work = null;
//  private String Baseline5WorkString = null;
//  private Double Baseline5Cost = null;
//  private Double Baseline5Bcws = null;
//  private Double Baseline5Bcwp = null;
//  private DateTime Baseline6Start = null;
//  private DateTime Baseline6Finish = null;
//  private String Baseline6Work = null;
//  private String Baseline6WorkString = null;
//  private Double Baseline6Cost = null;
//  private Double Baseline6Bcws = null;
//  private Double Baseline6Bcwp = null;
//  private DateTime Baseline7Start = null;
//  private DateTime Baseline7Finish = null;
//  private String Baseline7Work = null;
//  private String Baseline7WorkString = null;
//  private Double Baseline7Cost = null;
//  private Double Baseline7Bcws = null;
//  private Double Baseline7Bcwp = null;
//  private DateTime Baseline8Start = null;
//  private DateTime Baseline8Finish = null;
//  private String Baseline8Work = null;
//  private String Baseline8WorkString = null;
//  private Double Baseline8Cost = null;
//  private Double Baseline8Bcws = null;
//  private Double Baseline8Bcwp = null;
//  private DateTime Baseline9Start = null;
//  private DateTime Baseline9Finish = null;
//  private String Baseline9Work = null;
//  private String Baseline9WorkString = null;
//  private Double Baseline9Cost = null;
//  private Double Baseline9Bcws = null;
//  private Double Baseline9Bcwp = null;
//  private DateTime Baseline10Start = null;
//  private DateTime Baseline10Finish = null;
//  private String Baseline10Work = null;
//  private String Baseline10WorkString = null;
//  private Double Baseline10Cost = null;
//  private Double Baseline10Bcws = null;
//  private Double Baseline10Bcwp = null;
//  private List<ExtendedAttribute> ExtendedAttributes = new ArrayList<ExtendedAttribute>();
//  /**
//	 * getTaskUid
//	 * Gets Integer
//	 * @return TaskUid
//	 */
//  public Integer getTaskUid() {
//    return TaskUid;
//  }
//
//	/**
//	 * setTaskUid
//	 * Sets Integer
//	 * @param TaskUid Integer
//	 */
//  public void setTaskUid(Integer TaskUid) {
//    this.TaskUid = TaskUid;
//  }
//
//  /**
//	 * getResourceUid
//	 * Gets Integer
//	 * @return ResourceUid
//	 */
//  public Integer getResourceUid() {
//    return ResourceUid;
//  }
//
//	/**
//	 * setResourceUid
//	 * Sets Integer
//	 * @param ResourceUid Integer
//	 */
//  public void setResourceUid(Integer ResourceUid) {
//    this.ResourceUid = ResourceUid;
//  }
//
//  /**
//	 * getUid
//	 * Gets Integer
//	 * @return Uid
//	 */
//  public Integer getUid() {
//    return Uid;
//  }
//
//	/**
//	 * setUid
//	 * Sets Integer
//	 * @param Uid Integer
//	 */
//  public void setUid(Integer Uid) {
//    this.Uid = Uid;
//  }
//
//  /**
//	 * getPercentWorkComplete
//	 * Gets Integer
//	 * @return PercentWorkComplete
//	 */
//  public Integer getPercentWorkComplete() {
//    return PercentWorkComplete;
//  }
//
//	/**
//	 * setPercentWorkComplete
//	 * Sets Integer
//	 * @param PercentWorkComplete Integer
//	 */
//  public void setPercentWorkComplete(Integer PercentWorkComplete) {
//    this.PercentWorkComplete = PercentWorkComplete;
//  }
//
//  /**
//	 * getActualCost
//	 * Gets Double
//	 * @return ActualCost
//	 */
//  public Double getActualCost() {
//    return ActualCost;
//  }
//
//	/**
//	 * setActualCost
//	 * Sets Double
//	 * @param ActualCost Double
//	 */
//  public void setActualCost(Double ActualCost) {
//    this.ActualCost = ActualCost;
//  }
//
//  /**
//	 * getActualFinish
//	 * Gets DateTime
//	 * @return ActualFinish
//	 */
//  public DateTime getActualFinish() {
//    return ActualFinish;
//  }
//
//	/**
//	 * setActualFinish
//	 * Sets DateTime
//	 * @param ActualFinish DateTime
//	 */
//  public void setActualFinish(DateTime ActualFinish) {
//    this.ActualFinish = ActualFinish;
//  }
//
//  /**
//	 * getActualOvertimeCost
//	 * Gets Double
//	 * @return ActualOvertimeCost
//	 */
//  public Double getActualOvertimeCost() {
//    return ActualOvertimeCost;
//  }
//
//	/**
//	 * setActualOvertimeCost
//	 * Sets Double
//	 * @param ActualOvertimeCost Double
//	 */
//  public void setActualOvertimeCost(Double ActualOvertimeCost) {
//    this.ActualOvertimeCost = ActualOvertimeCost;
//  }
//
//  /**
//	 * getActualOvertimeWork
//	 * Gets String
//	 * @return ActualOvertimeWork
//	 */
//  public String getActualOvertimeWork() {
//    return ActualOvertimeWork;
//  }
//
//	/**
//	 * setActualOvertimeWork
//	 * Sets String
//	 * @param ActualOvertimeWork String
//	 */
//  public void setActualOvertimeWork(String ActualOvertimeWork) {
//    this.ActualOvertimeWork = ActualOvertimeWork;
//  }
//
//  /**
//	 * getActualOvertimeWorkString
//	 * Gets String
//	 * @return ActualOvertimeWorkString
//	 */
//  public String getActualOvertimeWorkString() {
//    return ActualOvertimeWorkString;
//  }
//
//	/**
//	 * setActualOvertimeWorkString
//	 * Sets String
//	 * @param ActualOvertimeWorkString String
//	 */
//  public void setActualOvertimeWorkString(String ActualOvertimeWorkString) {
//    this.ActualOvertimeWorkString = ActualOvertimeWorkString;
//  }
//
//  /**
//	 * getActualStart
//	 * Gets DateTime
//	 * @return ActualStart
//	 */
//  public DateTime getActualStart() {
//    return ActualStart;
//  }
//
//	/**
//	 * setActualStart
//	 * Sets DateTime
//	 * @param ActualStart DateTime
//	 */
//  public void setActualStart(DateTime ActualStart) {
//    this.ActualStart = ActualStart;
//  }
//
//  /**
//	 * getActualWork
//	 * Gets String
//	 * @return ActualWork
//	 */
//  public String getActualWork() {
//    return ActualWork;
//  }
//
//	/**
//	 * setActualWork
//	 * Sets String
//	 * @param ActualWork String
//	 */
//  public void setActualWork(String ActualWork) {
//    this.ActualWork = ActualWork;
//  }
//
//  /**
//	 * getActualWorkString
//	 * Gets String
//	 * @return ActualWorkString
//	 */
//  public String getActualWorkString() {
//    return ActualWorkString;
//  }
//
//	/**
//	 * setActualWorkString
//	 * Sets String
//	 * @param ActualWorkString String
//	 */
//  public void setActualWorkString(String ActualWorkString) {
//    this.ActualWorkString = ActualWorkString;
//  }
//
//  /**
//	 * getAcwp
//	 * Gets Double
//	 * @return Acwp
//	 */
//  public Double getAcwp() {
//    return Acwp;
//  }
//
//	/**
//	 * setAcwp
//	 * Sets Double
//	 * @param Acwp Double
//	 */
//  public void setAcwp(Double Acwp) {
//    this.Acwp = Acwp;
//  }
//
//  /**
//	 * getConfirmed
//	 * Gets Boolean
//	 * @return Confirmed
//	 */
//  public Boolean getConfirmed() {
//    return Confirmed;
//  }
//
//	/**
//	 * setConfirmed
//	 * Sets Boolean
//	 * @param Confirmed Boolean
//	 */
//  public void setConfirmed(Boolean Confirmed) {
//    this.Confirmed = Confirmed;
//  }
//
//  /**
//	 * getCost
//	 * Gets Double
//	 * @return Cost
//	 */
//  public Double getCost() {
//    return Cost;
//  }
//
//	/**
//	 * setCost
//	 * Sets Double
//	 * @param Cost Double
//	 */
//  public void setCost(Double Cost) {
//    this.Cost = Cost;
//  }
//
//  /**
//	 * getCostRateTableType
//	 * Gets RateType
//	 * @return CostRateTableType
//	 */
//  public RateType getCostRateTableType() {
//    return CostRateTableType;
//  }
//
//	/**
//	 * setCostRateTableType
//	 * Sets RateType
//	 * @param CostRateTableType RateType
//	 */
//  public void setCostRateTableType(RateType CostRateTableType) {
//    this.CostRateTableType = CostRateTableType;
//  }
//
//  /**
//	 * getCostVariance
//	 * Gets Double
//	 * @return CostVariance
//	 */
//  public Double getCostVariance() {
//    return CostVariance;
//  }
//
//	/**
//	 * setCostVariance
//	 * Sets Double
//	 * @param CostVariance Double
//	 */
//  public void setCostVariance(Double CostVariance) {
//    this.CostVariance = CostVariance;
//  }
//
//  /**
//	 * getCv
//	 * Gets Double
//	 * @return Cv
//	 */
//  public Double getCv() {
//    return Cv;
//  }
//
//	/**
//	 * setCv
//	 * Sets Double
//	 * @param Cv Double
//	 */
//  public void setCv(Double Cv) {
//    this.Cv = Cv;
//  }
//
//  /**
//	 * getDelay
//	 * Gets Integer
//	 * @return Delay
//	 */
//  public Integer getDelay() {
//    return Delay;
//  }
//
//	/**
//	 * setDelay
//	 * Sets Integer
//	 * @param Delay Integer
//	 */
//  public void setDelay(Integer Delay) {
//    this.Delay = Delay;
//  }
//
//  /**
//	 * getFinish
//	 * Gets DateTime
//	 * @return Finish
//	 */
//  public DateTime getFinish() {
//    return Finish;
//  }
//
//	/**
//	 * setFinish
//	 * Sets DateTime
//	 * @param Finish DateTime
//	 */
//  public void setFinish(DateTime Finish) {
//    this.Finish = Finish;
//  }
//
//  /**
//	 * getFinishVariance
//	 * Gets Integer
//	 * @return FinishVariance
//	 */
//  public Integer getFinishVariance() {
//    return FinishVariance;
//  }
//
//	/**
//	 * setFinishVariance
//	 * Sets Integer
//	 * @param FinishVariance Integer
//	 */
//  public void setFinishVariance(Integer FinishVariance) {
//    this.FinishVariance = FinishVariance;
//  }
//
//  /**
//	 * getHyperlink
//	 * Gets String
//	 * @return Hyperlink
//	 */
//  public String getHyperlink() {
//    return Hyperlink;
//  }
//
//	/**
//	 * setHyperlink
//	 * Sets String
//	 * @param Hyperlink String
//	 */
//  public void setHyperlink(String Hyperlink) {
//    this.Hyperlink = Hyperlink;
//  }
//
//  /**
//	 * getHyperlinkAddress
//	 * Gets String
//	 * @return HyperlinkAddress
//	 */
//  public String getHyperlinkAddress() {
//    return HyperlinkAddress;
//  }
//
//	/**
//	 * setHyperlinkAddress
//	 * Sets String
//	 * @param HyperlinkAddress String
//	 */
//  public void setHyperlinkAddress(String HyperlinkAddress) {
//    this.HyperlinkAddress = HyperlinkAddress;
//  }
//
//  /**
//	 * getHyperlinkSubAddress
//	 * Gets String
//	 * @return HyperlinkSubAddress
//	 */
//  public String getHyperlinkSubAddress() {
//    return HyperlinkSubAddress;
//  }
//
//	/**
//	 * setHyperlinkSubAddress
//	 * Sets String
//	 * @param HyperlinkSubAddress String
//	 */
//  public void setHyperlinkSubAddress(String HyperlinkSubAddress) {
//    this.HyperlinkSubAddress = HyperlinkSubAddress;
//  }
//
//  /**
//	 * getWorkVariance
//	 * Gets Double
//	 * @return WorkVariance
//	 */
//  public Double getWorkVariance() {
//    return WorkVariance;
//  }
//
//	/**
//	 * setWorkVariance
//	 * Sets Double
//	 * @param WorkVariance Double
//	 */
//  public void setWorkVariance(Double WorkVariance) {
//    this.WorkVariance = WorkVariance;
//  }
//
//  /**
//	 * getHasFixedRateUnits
//	 * Gets Boolean
//	 * @return HasFixedRateUnits
//	 */
//  public Boolean getHasFixedRateUnits() {
//    return HasFixedRateUnits;
//  }
//
//	/**
//	 * setHasFixedRateUnits
//	 * Sets Boolean
//	 * @param HasFixedRateUnits Boolean
//	 */
//  public void setHasFixedRateUnits(Boolean HasFixedRateUnits) {
//    this.HasFixedRateUnits = HasFixedRateUnits;
//  }
//
//  /**
//	 * getFixedMaterial
//	 * Gets Boolean
//	 * @return FixedMaterial
//	 */
//  public Boolean getFixedMaterial() {
//    return FixedMaterial;
//  }
//
//	/**
//	 * setFixedMaterial
//	 * Sets Boolean
//	 * @param FixedMaterial Boolean
//	 */
//  public void setFixedMaterial(Boolean FixedMaterial) {
//    this.FixedMaterial = FixedMaterial;
//  }
//
//  /**
//	 * getLevelingDelay
//	 * Gets Integer
//	 * @return LevelingDelay
//	 */
//  public Integer getLevelingDelay() {
//    return LevelingDelay;
//  }
//
//	/**
//	 * setLevelingDelay
//	 * Sets Integer
//	 * @param LevelingDelay Integer
//	 */
//  public void setLevelingDelay(Integer LevelingDelay) {
//    this.LevelingDelay = LevelingDelay;
//  }
//
//  /**
//	 * getLevelingDelayFormat
//	 * Gets TimeUnitType
//	 * @return LevelingDelayFormat
//	 */
//  public TimeUnitType getLevelingDelayFormat() {
//    return LevelingDelayFormat;
//  }
//
//	/**
//	 * setLevelingDelayFormat
//	 * Sets TimeUnitType
//	 * @param LevelingDelayFormat TimeUnitType
//	 */
//  public void setLevelingDelayFormat(TimeUnitType LevelingDelayFormat) {
//    this.LevelingDelayFormat = LevelingDelayFormat;
//  }
//
//  /**
//	 * getLinkedFields
//	 * Gets Boolean
//	 * @return LinkedFields
//	 */
//  public Boolean getLinkedFields() {
//    return LinkedFields;
//  }
//
//	/**
//	 * setLinkedFields
//	 * Sets Boolean
//	 * @param LinkedFields Boolean
//	 */
//  public void setLinkedFields(Boolean LinkedFields) {
//    this.LinkedFields = LinkedFields;
//  }
//
//  /**
//	 * getMilestone
//	 * Gets Boolean
//	 * @return Milestone
//	 */
//  public Boolean getMilestone() {
//    return Milestone;
//  }
//
//	/**
//	 * setMilestone
//	 * Sets Boolean
//	 * @param Milestone Boolean
//	 */
//  public void setMilestone(Boolean Milestone) {
//    this.Milestone = Milestone;
//  }
//
//  /**
//	 * getNotes
//	 * Gets String
//	 * @return Notes
//	 */
//  public String getNotes() {
//    return Notes;
//  }
//
//	/**
//	 * setNotes
//	 * Sets String
//	 * @param Notes String
//	 */
//  public void setNotes(String Notes) {
//    this.Notes = Notes;
//  }
//
//  /**
//	 * getOverallocated
//	 * Gets Boolean
//	 * @return Overallocated
//	 */
//  public Boolean getOverallocated() {
//    return Overallocated;
//  }
//
//	/**
//	 * setOverallocated
//	 * Sets Boolean
//	 * @param Overallocated Boolean
//	 */
//  public void setOverallocated(Boolean Overallocated) {
//    this.Overallocated = Overallocated;
//  }
//
//  /**
//	 * getOvertimeCost
//	 * Gets Double
//	 * @return OvertimeCost
//	 */
//  public Double getOvertimeCost() {
//    return OvertimeCost;
//  }
//
//	/**
//	 * setOvertimeCost
//	 * Sets Double
//	 * @param OvertimeCost Double
//	 */
//  public void setOvertimeCost(Double OvertimeCost) {
//    this.OvertimeCost = OvertimeCost;
//  }
//
//  /**
//	 * getOvertimeWork
//	 * Gets String
//	 * @return OvertimeWork
//	 */
//  public String getOvertimeWork() {
//    return OvertimeWork;
//  }
//
//	/**
//	 * setOvertimeWork
//	 * Sets String
//	 * @param OvertimeWork String
//	 */
//  public void setOvertimeWork(String OvertimeWork) {
//    this.OvertimeWork = OvertimeWork;
//  }
//
//  /**
//	 * getOvertimeWorkString
//	 * Gets String
//	 * @return OvertimeWorkString
//	 */
//  public String getOvertimeWorkString() {
//    return OvertimeWorkString;
//  }
//
//	/**
//	 * setOvertimeWorkString
//	 * Sets String
//	 * @param OvertimeWorkString String
//	 */
//  public void setOvertimeWorkString(String OvertimeWorkString) {
//    this.OvertimeWorkString = OvertimeWorkString;
//  }
//
//  /**
//	 * getPeakUnits
//	 * Gets Double
//	 * @return PeakUnits
//	 */
//  public Double getPeakUnits() {
//    return PeakUnits;
//  }
//
//	/**
//	 * setPeakUnits
//	 * Sets Double
//	 * @param PeakUnits Double
//	 */
//  public void setPeakUnits(Double PeakUnits) {
//    this.PeakUnits = PeakUnits;
//  }
//
//  /**
//	 * getRegularWork
//	 * Gets String
//	 * @return RegularWork
//	 */
//  public String getRegularWork() {
//    return RegularWork;
//  }
//
//	/**
//	 * setRegularWork
//	 * Sets String
//	 * @param RegularWork String
//	 */
//  public void setRegularWork(String RegularWork) {
//    this.RegularWork = RegularWork;
//  }
//
//  /**
//	 * getRegularWorkString
//	 * Gets String
//	 * @return RegularWorkString
//	 */
//  public String getRegularWorkString() {
//    return RegularWorkString;
//  }
//
//	/**
//	 * setRegularWorkString
//	 * Sets String
//	 * @param RegularWorkString String
//	 */
//  public void setRegularWorkString(String RegularWorkString) {
//    this.RegularWorkString = RegularWorkString;
//  }
//
//  /**
//	 * getRemainingCost
//	 * Gets Double
//	 * @return RemainingCost
//	 */
//  public Double getRemainingCost() {
//    return RemainingCost;
//  }
//
//	/**
//	 * setRemainingCost
//	 * Sets Double
//	 * @param RemainingCost Double
//	 */
//  public void setRemainingCost(Double RemainingCost) {
//    this.RemainingCost = RemainingCost;
//  }
//
//  /**
//	 * getRemainingOvertimeCost
//	 * Gets Double
//	 * @return RemainingOvertimeCost
//	 */
//  public Double getRemainingOvertimeCost() {
//    return RemainingOvertimeCost;
//  }
//
//	/**
//	 * setRemainingOvertimeCost
//	 * Sets Double
//	 * @param RemainingOvertimeCost Double
//	 */
//  public void setRemainingOvertimeCost(Double RemainingOvertimeCost) {
//    this.RemainingOvertimeCost = RemainingOvertimeCost;
//  }
//
//  /**
//	 * getRemainingOvertimeWork
//	 * Gets String
//	 * @return RemainingOvertimeWork
//	 */
//  public String getRemainingOvertimeWork() {
//    return RemainingOvertimeWork;
//  }
//
//	/**
//	 * setRemainingOvertimeWork
//	 * Sets String
//	 * @param RemainingOvertimeWork String
//	 */
//  public void setRemainingOvertimeWork(String RemainingOvertimeWork) {
//    this.RemainingOvertimeWork = RemainingOvertimeWork;
//  }
//
//  /**
//	 * getRemainingOvertimeWorkString
//	 * Gets String
//	 * @return RemainingOvertimeWorkString
//	 */
//  public String getRemainingOvertimeWorkString() {
//    return RemainingOvertimeWorkString;
//  }
//
//	/**
//	 * setRemainingOvertimeWorkString
//	 * Sets String
//	 * @param RemainingOvertimeWorkString String
//	 */
//  public void setRemainingOvertimeWorkString(String RemainingOvertimeWorkString) {
//    this.RemainingOvertimeWorkString = RemainingOvertimeWorkString;
//  }
//
//  /**
//	 * getRemainingWork
//	 * Gets String
//	 * @return RemainingWork
//	 */
//  public String getRemainingWork() {
//    return RemainingWork;
//  }
//
//	/**
//	 * setRemainingWork
//	 * Sets String
//	 * @param RemainingWork String
//	 */
//  public void setRemainingWork(String RemainingWork) {
//    this.RemainingWork = RemainingWork;
//  }
//
//  /**
//	 * getRemainingWorkString
//	 * Gets String
//	 * @return RemainingWorkString
//	 */
//  public String getRemainingWorkString() {
//    return RemainingWorkString;
//  }
//
//	/**
//	 * setRemainingWorkString
//	 * Sets String
//	 * @param RemainingWorkString String
//	 */
//  public void setRemainingWorkString(String RemainingWorkString) {
//    this.RemainingWorkString = RemainingWorkString;
//  }
//
//  /**
//	 * getResponsePending
//	 * Gets Boolean
//	 * @return ResponsePending
//	 */
//  public Boolean getResponsePending() {
//    return ResponsePending;
//  }
//
//	/**
//	 * setResponsePending
//	 * Sets Boolean
//	 * @param ResponsePending Boolean
//	 */
//  public void setResponsePending(Boolean ResponsePending) {
//    this.ResponsePending = ResponsePending;
//  }
//
//  /**
//	 * getStart
//	 * Gets DateTime
//	 * @return Start
//	 */
//  public DateTime getStart() {
//    return Start;
//  }
//
//	/**
//	 * setStart
//	 * Sets DateTime
//	 * @param Start DateTime
//	 */
//  public void setStart(DateTime Start) {
//    this.Start = Start;
//  }
//
//  /**
//	 * getStop
//	 * Gets DateTime
//	 * @return Stop
//	 */
//  public DateTime getStop() {
//    return Stop;
//  }
//
//	/**
//	 * setStop
//	 * Sets DateTime
//	 * @param Stop DateTime
//	 */
//  public void setStop(DateTime Stop) {
//    this.Stop = Stop;
//  }
//
//  /**
//	 * getResume
//	 * Gets DateTime
//	 * @return Resume
//	 */
//  public DateTime getResume() {
//    return Resume;
//  }
//
//	/**
//	 * setResume
//	 * Sets DateTime
//	 * @param Resume DateTime
//	 */
//  public void setResume(DateTime Resume) {
//    this.Resume = Resume;
//  }
//
//  /**
//	 * getStartVariance
//	 * Gets Integer
//	 * @return StartVariance
//	 */
//  public Integer getStartVariance() {
//    return StartVariance;
//  }
//
//	/**
//	 * setStartVariance
//	 * Sets Integer
//	 * @param StartVariance Integer
//	 */
//  public void setStartVariance(Integer StartVariance) {
//    this.StartVariance = StartVariance;
//  }
//
//  /**
//	 * getSummary
//	 * Gets Boolean
//	 * @return Summary
//	 */
//  public Boolean getSummary() {
//    return Summary;
//  }
//
//	/**
//	 * setSummary
//	 * Sets Boolean
//	 * @param Summary Boolean
//	 */
//  public void setSummary(Boolean Summary) {
//    this.Summary = Summary;
//  }
//
//  /**
//	 * getSv
//	 * Gets Double
//	 * @return Sv
//	 */
//  public Double getSv() {
//    return Sv;
//  }
//
//	/**
//	 * setSv
//	 * Sets Double
//	 * @param Sv Double
//	 */
//  public void setSv(Double Sv) {
//    this.Sv = Sv;
//  }
//
//  /**
//	 * getUnits
//	 * Gets Double
//	 * @return Units
//	 */
//  public Double getUnits() {
//    return Units;
//  }
//
//	/**
//	 * setUnits
//	 * Sets Double
//	 * @param Units Double
//	 */
//  public void setUnits(Double Units) {
//    this.Units = Units;
//  }
//
//  /**
//	 * getUpdateNeeded
//	 * Gets Boolean
//	 * @return UpdateNeeded
//	 */
//  public Boolean getUpdateNeeded() {
//    return UpdateNeeded;
//  }
//
//	/**
//	 * setUpdateNeeded
//	 * Sets Boolean
//	 * @param UpdateNeeded Boolean
//	 */
//  public void setUpdateNeeded(Boolean UpdateNeeded) {
//    this.UpdateNeeded = UpdateNeeded;
//  }
//
//  /**
//	 * getVac
//	 * Gets Double
//	 * @return Vac
//	 */
//  public Double getVac() {
//    return Vac;
//  }
//
//	/**
//	 * setVac
//	 * Sets Double
//	 * @param Vac Double
//	 */
//  public void setVac(Double Vac) {
//    this.Vac = Vac;
//  }
//
//  /**
//	 * getWork
//	 * Gets String
//	 * @return Work
//	 */
//  public String getWork() {
//    return Work;
//  }
//
//	/**
//	 * setWork
//	 * Sets String
//	 * @param Work String
//	 */
//  public void setWork(String Work) {
//    this.Work = Work;
//  }
//
//  /**
//	 * getWorkString
//	 * Gets String
//	 * @return WorkString
//	 */
//  public String getWorkString() {
//    return WorkString;
//  }
//
//	/**
//	 * setWorkString
//	 * Sets String
//	 * @param WorkString String
//	 */
//  public void setWorkString(String WorkString) {
//    this.WorkString = WorkString;
//  }
//
//  /**
//	 * getWorkContour
//	 * Gets WorkContourType
//	 * @return WorkContour
//	 */
//  public WorkContourType getWorkContour() {
//    return WorkContour;
//  }
//
//	/**
//	 * setWorkContour
//	 * Sets WorkContourType
//	 * @param WorkContour WorkContourType
//	 */
//  public void setWorkContour(WorkContourType WorkContour) {
//    this.WorkContour = WorkContour;
//  }
//
//  /**
//	 * getBcws
//	 * Gets Double
//	 * @return Bcws
//	 */
//  public Double getBcws() {
//    return Bcws;
//  }
//
//	/**
//	 * setBcws
//	 * Sets Double
//	 * @param Bcws Double
//	 */
//  public void setBcws(Double Bcws) {
//    this.Bcws = Bcws;
//  }
//
//  /**
//	 * getBcwp
//	 * Gets Double
//	 * @return Bcwp
//	 */
//  public Double getBcwp() {
//    return Bcwp;
//  }
//
//	/**
//	 * setBcwp
//	 * Sets Double
//	 * @param Bcwp Double
//	 */
//  public void setBcwp(Double Bcwp) {
//    this.Bcwp = Bcwp;
//  }
//
//  /**
//	 * getBookingType
//	 * Gets BookingType
//	 * @return BookingType
//	 */
//  public BookingType getBookingType() {
//    return BookingType;
//  }
//
//	/**
//	 * setBookingType
//	 * Sets BookingType
//	 * @param BookingType BookingType
//	 */
//  public void setBookingType(BookingType BookingType) {
//    this.BookingType = BookingType;
//  }
//
//  /**
//	 * getActualWorkProtected
//	 * Gets String
//	 * @return ActualWorkProtected
//	 */
//  public String getActualWorkProtected() {
//    return ActualWorkProtected;
//  }
//
//	/**
//	 * setActualWorkProtected
//	 * Sets String
//	 * @param ActualWorkProtected String
//	 */
//  public void setActualWorkProtected(String ActualWorkProtected) {
//    this.ActualWorkProtected = ActualWorkProtected;
//  }
//
//  /**
//	 * getActualWorkProtectedString
//	 * Gets String
//	 * @return ActualWorkProtectedString
//	 */
//  public String getActualWorkProtectedString() {
//    return ActualWorkProtectedString;
//  }
//
//	/**
//	 * setActualWorkProtectedString
//	 * Sets String
//	 * @param ActualWorkProtectedString String
//	 */
//  public void setActualWorkProtectedString(String ActualWorkProtectedString) {
//    this.ActualWorkProtectedString = ActualWorkProtectedString;
//  }
//
//  /**
//	 * getActualOvertimeWorkProtected
//	 * Gets String
//	 * @return ActualOvertimeWorkProtected
//	 */
//  public String getActualOvertimeWorkProtected() {
//    return ActualOvertimeWorkProtected;
//  }
//
//	/**
//	 * setActualOvertimeWorkProtected
//	 * Sets String
//	 * @param ActualOvertimeWorkProtected String
//	 */
//  public void setActualOvertimeWorkProtected(String ActualOvertimeWorkProtected) {
//    this.ActualOvertimeWorkProtected = ActualOvertimeWorkProtected;
//  }
//
//  /**
//	 * getActualOvertimeWorkProtectedString
//	 * Gets String
//	 * @return ActualOvertimeWorkProtectedString
//	 */
//  public String getActualOvertimeWorkProtectedString() {
//    return ActualOvertimeWorkProtectedString;
//  }
//
//	/**
//	 * setActualOvertimeWorkProtectedString
//	 * Sets String
//	 * @param ActualOvertimeWorkProtectedString String
//	 */
//  public void setActualOvertimeWorkProtectedString(String ActualOvertimeWorkProtectedString) {
//    this.ActualOvertimeWorkProtectedString = ActualOvertimeWorkProtectedString;
//  }
//
//  /**
//	 * getCreationDate
//	 * Gets DateTime
//	 * @return CreationDate
//	 */
//  public DateTime getCreationDate() {
//    return CreationDate;
//  }
//
//	/**
//	 * setCreationDate
//	 * Sets DateTime
//	 * @param CreationDate DateTime
//	 */
//  public void setCreationDate(DateTime CreationDate) {
//    this.CreationDate = CreationDate;
//  }
//
//  /**
//	 * getAssnOwner
//	 * Gets String
//	 * @return AssnOwner
//	 */
//  public String getAssnOwner() {
//    return AssnOwner;
//  }
//
//	/**
//	 * setAssnOwner
//	 * Sets String
//	 * @param AssnOwner String
//	 */
//  public void setAssnOwner(String AssnOwner) {
//    this.AssnOwner = AssnOwner;
//  }
//
//  /**
//	 * getAssnOwnerGuid
//	 * Gets String
//	 * @return AssnOwnerGuid
//	 */
//  public String getAssnOwnerGuid() {
//    return AssnOwnerGuid;
//  }
//
//	/**
//	 * setAssnOwnerGuid
//	 * Sets String
//	 * @param AssnOwnerGuid String
//	 */
//  public void setAssnOwnerGuid(String AssnOwnerGuid) {
//    this.AssnOwnerGuid = AssnOwnerGuid;
//  }
//
//  /**
//	 * getBudgetCost
//	 * Gets Double
//	 * @return BudgetCost
//	 */
//  public Double getBudgetCost() {
//    return BudgetCost;
//  }
//
//	/**
//	 * setBudgetCost
//	 * Sets Double
//	 * @param BudgetCost Double
//	 */
//  public void setBudgetCost(Double BudgetCost) {
//    this.BudgetCost = BudgetCost;
//  }
//
//  /**
//	 * getBudgetWork
//	 * Gets String
//	 * @return BudgetWork
//	 */
//  public String getBudgetWork() {
//    return BudgetWork;
//  }
//
//	/**
//	 * setBudgetWork
//	 * Sets String
//	 * @param BudgetWork String
//	 */
//  public void setBudgetWork(String BudgetWork) {
//    this.BudgetWork = BudgetWork;
//  }
//
//  /**
//	 * getBudgetWorkString
//	 * Gets String
//	 * @return BudgetWorkString
//	 */
//  public String getBudgetWorkString() {
//    return BudgetWorkString;
//  }
//
//	/**
//	 * setBudgetWorkString
//	 * Sets String
//	 * @param BudgetWorkString String
//	 */
//  public void setBudgetWorkString(String BudgetWorkString) {
//    this.BudgetWorkString = BudgetWorkString;
//  }
//
//  /**
//	 * getRateScale
//	 * Gets Integer
//	 * @return RateScale
//	 */
//  public Integer getRateScale() {
//    return RateScale;
//  }
//
//	/**
//	 * setRateScale
//	 * Sets Integer
//	 * @param RateScale Integer
//	 */
//  public void setRateScale(Integer RateScale) {
//    this.RateScale = RateScale;
//  }
//
//  /**
//	 * getBaselineStart
//	 * Gets DateTime
//	 * @return BaselineStart
//	 */
//  public DateTime getBaselineStart() {
//    return BaselineStart;
//  }
//
//	/**
//	 * setBaselineStart
//	 * Sets DateTime
//	 * @param BaselineStart DateTime
//	 */
//  public void setBaselineStart(DateTime BaselineStart) {
//    this.BaselineStart = BaselineStart;
//  }
//
//  /**
//	 * getBaselineFinish
//	 * Gets DateTime
//	 * @return BaselineFinish
//	 */
//  public DateTime getBaselineFinish() {
//    return BaselineFinish;
//  }
//
//	/**
//	 * setBaselineFinish
//	 * Sets DateTime
//	 * @param BaselineFinish DateTime
//	 */
//  public void setBaselineFinish(DateTime BaselineFinish) {
//    this.BaselineFinish = BaselineFinish;
//  }
//
//  /**
//	 * getBaselineWork
//	 * Gets String
//	 * @return BaselineWork
//	 */
//  public String getBaselineWork() {
//    return BaselineWork;
//  }
//
//	/**
//	 * setBaselineWork
//	 * Sets String
//	 * @param BaselineWork String
//	 */
//  public void setBaselineWork(String BaselineWork) {
//    this.BaselineWork = BaselineWork;
//  }
//
//  /**
//	 * getBaselineWorkString
//	 * Gets String
//	 * @return BaselineWorkString
//	 */
//  public String getBaselineWorkString() {
//    return BaselineWorkString;
//  }
//
//	/**
//	 * setBaselineWorkString
//	 * Sets String
//	 * @param BaselineWorkString String
//	 */
//  public void setBaselineWorkString(String BaselineWorkString) {
//    this.BaselineWorkString = BaselineWorkString;
//  }
//
//  /**
//	 * getBaselineCost
//	 * Gets Double
//	 * @return BaselineCost
//	 */
//  public Double getBaselineCost() {
//    return BaselineCost;
//  }
//
//	/**
//	 * setBaselineCost
//	 * Sets Double
//	 * @param BaselineCost Double
//	 */
//  public void setBaselineCost(Double BaselineCost) {
//    this.BaselineCost = BaselineCost;
//  }
//
//  /**
//	 * getBaselineBcws
//	 * Gets Double
//	 * @return BaselineBcws
//	 */
//  public Double getBaselineBcws() {
//    return BaselineBcws;
//  }
//
//	/**
//	 * setBaselineBcws
//	 * Sets Double
//	 * @param BaselineBcws Double
//	 */
//  public void setBaselineBcws(Double BaselineBcws) {
//    this.BaselineBcws = BaselineBcws;
//  }
//
//  /**
//	 * getBaselineBcwp
//	 * Gets Double
//	 * @return BaselineBcwp
//	 */
//  public Double getBaselineBcwp() {
//    return BaselineBcwp;
//  }
//
//	/**
//	 * setBaselineBcwp
//	 * Sets Double
//	 * @param BaselineBcwp Double
//	 */
//  public void setBaselineBcwp(Double BaselineBcwp) {
//    this.BaselineBcwp = BaselineBcwp;
//  }
//
//  /**
//	 * getBaseline1Start
//	 * Gets DateTime
//	 * @return Baseline1Start
//	 */
//  public DateTime getBaseline1Start() {
//    return Baseline1Start;
//  }
//
//	/**
//	 * setBaseline1Start
//	 * Sets DateTime
//	 * @param Baseline1Start DateTime
//	 */
//  public void setBaseline1Start(DateTime Baseline1Start) {
//    this.Baseline1Start = Baseline1Start;
//  }
//
//  /**
//	 * getBaseline1Finish
//	 * Gets DateTime
//	 * @return Baseline1Finish
//	 */
//  public DateTime getBaseline1Finish() {
//    return Baseline1Finish;
//  }
//
//	/**
//	 * setBaseline1Finish
//	 * Sets DateTime
//	 * @param Baseline1Finish DateTime
//	 */
//  public void setBaseline1Finish(DateTime Baseline1Finish) {
//    this.Baseline1Finish = Baseline1Finish;
//  }
//
//  /**
//	 * getBaseline1Work
//	 * Gets String
//	 * @return Baseline1Work
//	 */
//  public String getBaseline1Work() {
//    return Baseline1Work;
//  }
//
//	/**
//	 * setBaseline1Work
//	 * Sets String
//	 * @param Baseline1Work String
//	 */
//  public void setBaseline1Work(String Baseline1Work) {
//    this.Baseline1Work = Baseline1Work;
//  }
//
//  /**
//	 * getBaseline1WorkString
//	 * Gets String
//	 * @return Baseline1WorkString
//	 */
//  public String getBaseline1WorkString() {
//    return Baseline1WorkString;
//  }
//
//	/**
//	 * setBaseline1WorkString
//	 * Sets String
//	 * @param Baseline1WorkString String
//	 */
//  public void setBaseline1WorkString(String Baseline1WorkString) {
//    this.Baseline1WorkString = Baseline1WorkString;
//  }
//
//  /**
//	 * getBaseline1Cost
//	 * Gets Double
//	 * @return Baseline1Cost
//	 */
//  public Double getBaseline1Cost() {
//    return Baseline1Cost;
//  }
//
//	/**
//	 * setBaseline1Cost
//	 * Sets Double
//	 * @param Baseline1Cost Double
//	 */
//  public void setBaseline1Cost(Double Baseline1Cost) {
//    this.Baseline1Cost = Baseline1Cost;
//  }
//
//  /**
//	 * getBaseline1Bcws
//	 * Gets Double
//	 * @return Baseline1Bcws
//	 */
//  public Double getBaseline1Bcws() {
//    return Baseline1Bcws;
//  }
//
//	/**
//	 * setBaseline1Bcws
//	 * Sets Double
//	 * @param Baseline1Bcws Double
//	 */
//  public void setBaseline1Bcws(Double Baseline1Bcws) {
//    this.Baseline1Bcws = Baseline1Bcws;
//  }
//
//  /**
//	 * getBaseline1Bcwp
//	 * Gets Double
//	 * @return Baseline1Bcwp
//	 */
//  public Double getBaseline1Bcwp() {
//    return Baseline1Bcwp;
//  }
//
//	/**
//	 * setBaseline1Bcwp
//	 * Sets Double
//	 * @param Baseline1Bcwp Double
//	 */
//  public void setBaseline1Bcwp(Double Baseline1Bcwp) {
//    this.Baseline1Bcwp = Baseline1Bcwp;
//  }
//
//  /**
//	 * getBaseline2Start
//	 * Gets DateTime
//	 * @return Baseline2Start
//	 */
//  public DateTime getBaseline2Start() {
//    return Baseline2Start;
//  }
//
//	/**
//	 * setBaseline2Start
//	 * Sets DateTime
//	 * @param Baseline2Start DateTime
//	 */
//  public void setBaseline2Start(DateTime Baseline2Start) {
//    this.Baseline2Start = Baseline2Start;
//  }
//
//  /**
//	 * getBaseline2Finish
//	 * Gets DateTime
//	 * @return Baseline2Finish
//	 */
//  public DateTime getBaseline2Finish() {
//    return Baseline2Finish;
//  }
//
//	/**
//	 * setBaseline2Finish
//	 * Sets DateTime
//	 * @param Baseline2Finish DateTime
//	 */
//  public void setBaseline2Finish(DateTime Baseline2Finish) {
//    this.Baseline2Finish = Baseline2Finish;
//  }
//
//  /**
//	 * getBaseline2Work
//	 * Gets String
//	 * @return Baseline2Work
//	 */
//  public String getBaseline2Work() {
//    return Baseline2Work;
//  }
//
//	/**
//	 * setBaseline2Work
//	 * Sets String
//	 * @param Baseline2Work String
//	 */
//  public void setBaseline2Work(String Baseline2Work) {
//    this.Baseline2Work = Baseline2Work;
//  }
//
//  /**
//	 * getBaseline2WorkString
//	 * Gets String
//	 * @return Baseline2WorkString
//	 */
//  public String getBaseline2WorkString() {
//    return Baseline2WorkString;
//  }
//
//	/**
//	 * setBaseline2WorkString
//	 * Sets String
//	 * @param Baseline2WorkString String
//	 */
//  public void setBaseline2WorkString(String Baseline2WorkString) {
//    this.Baseline2WorkString = Baseline2WorkString;
//  }
//
//  /**
//	 * getBaseline2Cost
//	 * Gets Double
//	 * @return Baseline2Cost
//	 */
//  public Double getBaseline2Cost() {
//    return Baseline2Cost;
//  }
//
//	/**
//	 * setBaseline2Cost
//	 * Sets Double
//	 * @param Baseline2Cost Double
//	 */
//  public void setBaseline2Cost(Double Baseline2Cost) {
//    this.Baseline2Cost = Baseline2Cost;
//  }
//
//  /**
//	 * getBaseline2Bcws
//	 * Gets Double
//	 * @return Baseline2Bcws
//	 */
//  public Double getBaseline2Bcws() {
//    return Baseline2Bcws;
//  }
//
//	/**
//	 * setBaseline2Bcws
//	 * Sets Double
//	 * @param Baseline2Bcws Double
//	 */
//  public void setBaseline2Bcws(Double Baseline2Bcws) {
//    this.Baseline2Bcws = Baseline2Bcws;
//  }
//
//  /**
//	 * getBaseline2Bcwp
//	 * Gets Double
//	 * @return Baseline2Bcwp
//	 */
//  public Double getBaseline2Bcwp() {
//    return Baseline2Bcwp;
//  }
//
//	/**
//	 * setBaseline2Bcwp
//	 * Sets Double
//	 * @param Baseline2Bcwp Double
//	 */
//  public void setBaseline2Bcwp(Double Baseline2Bcwp) {
//    this.Baseline2Bcwp = Baseline2Bcwp;
//  }
//
//  /**
//	 * getBaseline3Start
//	 * Gets DateTime
//	 * @return Baseline3Start
//	 */
//  public DateTime getBaseline3Start() {
//    return Baseline3Start;
//  }
//
//	/**
//	 * setBaseline3Start
//	 * Sets DateTime
//	 * @param Baseline3Start DateTime
//	 */
//  public void setBaseline3Start(DateTime Baseline3Start) {
//    this.Baseline3Start = Baseline3Start;
//  }
//
//  /**
//	 * getBaseline3Finish
//	 * Gets DateTime
//	 * @return Baseline3Finish
//	 */
//  public DateTime getBaseline3Finish() {
//    return Baseline3Finish;
//  }
//
//	/**
//	 * setBaseline3Finish
//	 * Sets DateTime
//	 * @param Baseline3Finish DateTime
//	 */
//  public void setBaseline3Finish(DateTime Baseline3Finish) {
//    this.Baseline3Finish = Baseline3Finish;
//  }
//
//  /**
//	 * getBaseline3Work
//	 * Gets String
//	 * @return Baseline3Work
//	 */
//  public String getBaseline3Work() {
//    return Baseline3Work;
//  }
//
//	/**
//	 * setBaseline3Work
//	 * Sets String
//	 * @param Baseline3Work String
//	 */
//  public void setBaseline3Work(String Baseline3Work) {
//    this.Baseline3Work = Baseline3Work;
//  }
//
//  /**
//	 * getBaseline3WorkString
//	 * Gets String
//	 * @return Baseline3WorkString
//	 */
//  public String getBaseline3WorkString() {
//    return Baseline3WorkString;
//  }
//
//	/**
//	 * setBaseline3WorkString
//	 * Sets String
//	 * @param Baseline3WorkString String
//	 */
//  public void setBaseline3WorkString(String Baseline3WorkString) {
//    this.Baseline3WorkString = Baseline3WorkString;
//  }
//
//  /**
//	 * getBaseline3Cost
//	 * Gets Double
//	 * @return Baseline3Cost
//	 */
//  public Double getBaseline3Cost() {
//    return Baseline3Cost;
//  }
//
//	/**
//	 * setBaseline3Cost
//	 * Sets Double
//	 * @param Baseline3Cost Double
//	 */
//  public void setBaseline3Cost(Double Baseline3Cost) {
//    this.Baseline3Cost = Baseline3Cost;
//  }
//
//  /**
//	 * getBaseline3Bcws
//	 * Gets Double
//	 * @return Baseline3Bcws
//	 */
//  public Double getBaseline3Bcws() {
//    return Baseline3Bcws;
//  }
//
//	/**
//	 * setBaseline3Bcws
//	 * Sets Double
//	 * @param Baseline3Bcws Double
//	 */
//  public void setBaseline3Bcws(Double Baseline3Bcws) {
//    this.Baseline3Bcws = Baseline3Bcws;
//  }
//
//  /**
//	 * getBaseline3Bcwp
//	 * Gets Double
//	 * @return Baseline3Bcwp
//	 */
//  public Double getBaseline3Bcwp() {
//    return Baseline3Bcwp;
//  }
//
//	/**
//	 * setBaseline3Bcwp
//	 * Sets Double
//	 * @param Baseline3Bcwp Double
//	 */
//  public void setBaseline3Bcwp(Double Baseline3Bcwp) {
//    this.Baseline3Bcwp = Baseline3Bcwp;
//  }
//
//  /**
//	 * getBaseline4Start
//	 * Gets DateTime
//	 * @return Baseline4Start
//	 */
//  public DateTime getBaseline4Start() {
//    return Baseline4Start;
//  }
//
//	/**
//	 * setBaseline4Start
//	 * Sets DateTime
//	 * @param Baseline4Start DateTime
//	 */
//  public void setBaseline4Start(DateTime Baseline4Start) {
//    this.Baseline4Start = Baseline4Start;
//  }
//
//  /**
//	 * getBaseline4Finish
//	 * Gets DateTime
//	 * @return Baseline4Finish
//	 */
//  public DateTime getBaseline4Finish() {
//    return Baseline4Finish;
//  }
//
//	/**
//	 * setBaseline4Finish
//	 * Sets DateTime
//	 * @param Baseline4Finish DateTime
//	 */
//  public void setBaseline4Finish(DateTime Baseline4Finish) {
//    this.Baseline4Finish = Baseline4Finish;
//  }
//
//  /**
//	 * getBaseline4Work
//	 * Gets String
//	 * @return Baseline4Work
//	 */
//  public String getBaseline4Work() {
//    return Baseline4Work;
//  }
//
//	/**
//	 * setBaseline4Work
//	 * Sets String
//	 * @param Baseline4Work String
//	 */
//  public void setBaseline4Work(String Baseline4Work) {
//    this.Baseline4Work = Baseline4Work;
//  }
//
//  /**
//	 * getBaseline4WorkString
//	 * Gets String
//	 * @return Baseline4WorkString
//	 */
//  public String getBaseline4WorkString() {
//    return Baseline4WorkString;
//  }
//
//	/**
//	 * setBaseline4WorkString
//	 * Sets String
//	 * @param Baseline4WorkString String
//	 */
//  public void setBaseline4WorkString(String Baseline4WorkString) {
//    this.Baseline4WorkString = Baseline4WorkString;
//  }
//
//  /**
//	 * getBaseline4Cost
//	 * Gets Double
//	 * @return Baseline4Cost
//	 */
//  public Double getBaseline4Cost() {
//    return Baseline4Cost;
//  }
//
//	/**
//	 * setBaseline4Cost
//	 * Sets Double
//	 * @param Baseline4Cost Double
//	 */
//  public void setBaseline4Cost(Double Baseline4Cost) {
//    this.Baseline4Cost = Baseline4Cost;
//  }
//
//  /**
//	 * getBaseline4Bcws
//	 * Gets Double
//	 * @return Baseline4Bcws
//	 */
//  public Double getBaseline4Bcws() {
//    return Baseline4Bcws;
//  }
//
//	/**
//	 * setBaseline4Bcws
//	 * Sets Double
//	 * @param Baseline4Bcws Double
//	 */
//  public void setBaseline4Bcws(Double Baseline4Bcws) {
//    this.Baseline4Bcws = Baseline4Bcws;
//  }
//
//  /**
//	 * getBaseline4Bcwp
//	 * Gets Double
//	 * @return Baseline4Bcwp
//	 */
//  public Double getBaseline4Bcwp() {
//    return Baseline4Bcwp;
//  }
//
//	/**
//	 * setBaseline4Bcwp
//	 * Sets Double
//	 * @param Baseline4Bcwp Double
//	 */
//  public void setBaseline4Bcwp(Double Baseline4Bcwp) {
//    this.Baseline4Bcwp = Baseline4Bcwp;
//  }
//
//  /**
//	 * getBaseline5Start
//	 * Gets DateTime
//	 * @return Baseline5Start
//	 */
//  public DateTime getBaseline5Start() {
//    return Baseline5Start;
//  }
//
//	/**
//	 * setBaseline5Start
//	 * Sets DateTime
//	 * @param Baseline5Start DateTime
//	 */
//  public void setBaseline5Start(DateTime Baseline5Start) {
//    this.Baseline5Start = Baseline5Start;
//  }
//
//  /**
//	 * getBaseline5Finish
//	 * Gets DateTime
//	 * @return Baseline5Finish
//	 */
//  public DateTime getBaseline5Finish() {
//    return Baseline5Finish;
//  }
//
//	/**
//	 * setBaseline5Finish
//	 * Sets DateTime
//	 * @param Baseline5Finish DateTime
//	 */
//  public void setBaseline5Finish(DateTime Baseline5Finish) {
//    this.Baseline5Finish = Baseline5Finish;
//  }
//
//  /**
//	 * getBaseline5Work
//	 * Gets String
//	 * @return Baseline5Work
//	 */
//  public String getBaseline5Work() {
//    return Baseline5Work;
//  }
//
//	/**
//	 * setBaseline5Work
//	 * Sets String
//	 * @param Baseline5Work String
//	 */
//  public void setBaseline5Work(String Baseline5Work) {
//    this.Baseline5Work = Baseline5Work;
//  }
//
//  /**
//	 * getBaseline5WorkString
//	 * Gets String
//	 * @return Baseline5WorkString
//	 */
//  public String getBaseline5WorkString() {
//    return Baseline5WorkString;
//  }
//
//	/**
//	 * setBaseline5WorkString
//	 * Sets String
//	 * @param Baseline5WorkString String
//	 */
//  public void setBaseline5WorkString(String Baseline5WorkString) {
//    this.Baseline5WorkString = Baseline5WorkString;
//  }
//
//  /**
//	 * getBaseline5Cost
//	 * Gets Double
//	 * @return Baseline5Cost
//	 */
//  public Double getBaseline5Cost() {
//    return Baseline5Cost;
//  }
//
//	/**
//	 * setBaseline5Cost
//	 * Sets Double
//	 * @param Baseline5Cost Double
//	 */
//  public void setBaseline5Cost(Double Baseline5Cost) {
//    this.Baseline5Cost = Baseline5Cost;
//  }
//
//  /**
//	 * getBaseline5Bcws
//	 * Gets Double
//	 * @return Baseline5Bcws
//	 */
//  public Double getBaseline5Bcws() {
//    return Baseline5Bcws;
//  }
//
//	/**
//	 * setBaseline5Bcws
//	 * Sets Double
//	 * @param Baseline5Bcws Double
//	 */
//  public void setBaseline5Bcws(Double Baseline5Bcws) {
//    this.Baseline5Bcws = Baseline5Bcws;
//  }
//
//  /**
//	 * getBaseline5Bcwp
//	 * Gets Double
//	 * @return Baseline5Bcwp
//	 */
//  public Double getBaseline5Bcwp() {
//    return Baseline5Bcwp;
//  }
//
//	/**
//	 * setBaseline5Bcwp
//	 * Sets Double
//	 * @param Baseline5Bcwp Double
//	 */
//  public void setBaseline5Bcwp(Double Baseline5Bcwp) {
//    this.Baseline5Bcwp = Baseline5Bcwp;
//  }
//
//  /**
//	 * getBaseline6Start
//	 * Gets DateTime
//	 * @return Baseline6Start
//	 */
//  public DateTime getBaseline6Start() {
//    return Baseline6Start;
//  }
//
//	/**
//	 * setBaseline6Start
//	 * Sets DateTime
//	 * @param Baseline6Start DateTime
//	 */
//  public void setBaseline6Start(DateTime Baseline6Start) {
//    this.Baseline6Start = Baseline6Start;
//  }
//
//  /**
//	 * getBaseline6Finish
//	 * Gets DateTime
//	 * @return Baseline6Finish
//	 */
//  public DateTime getBaseline6Finish() {
//    return Baseline6Finish;
//  }
//
//	/**
//	 * setBaseline6Finish
//	 * Sets DateTime
//	 * @param Baseline6Finish DateTime
//	 */
//  public void setBaseline6Finish(DateTime Baseline6Finish) {
//    this.Baseline6Finish = Baseline6Finish;
//  }
//
//  /**
//	 * getBaseline6Work
//	 * Gets String
//	 * @return Baseline6Work
//	 */
//  public String getBaseline6Work() {
//    return Baseline6Work;
//  }
//
//	/**
//	 * setBaseline6Work
//	 * Sets String
//	 * @param Baseline6Work String
//	 */
//  public void setBaseline6Work(String Baseline6Work) {
//    this.Baseline6Work = Baseline6Work;
//  }
//
//  /**
//	 * getBaseline6WorkString
//	 * Gets String
//	 * @return Baseline6WorkString
//	 */
//  public String getBaseline6WorkString() {
//    return Baseline6WorkString;
//  }
//
//	/**
//	 * setBaseline6WorkString
//	 * Sets String
//	 * @param Baseline6WorkString String
//	 */
//  public void setBaseline6WorkString(String Baseline6WorkString) {
//    this.Baseline6WorkString = Baseline6WorkString;
//  }
//
//  /**
//	 * getBaseline6Cost
//	 * Gets Double
//	 * @return Baseline6Cost
//	 */
//  public Double getBaseline6Cost() {
//    return Baseline6Cost;
//  }
//
//	/**
//	 * setBaseline6Cost
//	 * Sets Double
//	 * @param Baseline6Cost Double
//	 */
//  public void setBaseline6Cost(Double Baseline6Cost) {
//    this.Baseline6Cost = Baseline6Cost;
//  }
//
//  /**
//	 * getBaseline6Bcws
//	 * Gets Double
//	 * @return Baseline6Bcws
//	 */
//  public Double getBaseline6Bcws() {
//    return Baseline6Bcws;
//  }
//
//	/**
//	 * setBaseline6Bcws
//	 * Sets Double
//	 * @param Baseline6Bcws Double
//	 */
//  public void setBaseline6Bcws(Double Baseline6Bcws) {
//    this.Baseline6Bcws = Baseline6Bcws;
//  }
//
//  /**
//	 * getBaseline6Bcwp
//	 * Gets Double
//	 * @return Baseline6Bcwp
//	 */
//  public Double getBaseline6Bcwp() {
//    return Baseline6Bcwp;
//  }
//
//	/**
//	 * setBaseline6Bcwp
//	 * Sets Double
//	 * @param Baseline6Bcwp Double
//	 */
//  public void setBaseline6Bcwp(Double Baseline6Bcwp) {
//    this.Baseline6Bcwp = Baseline6Bcwp;
//  }
//
//  /**
//	 * getBaseline7Start
//	 * Gets DateTime
//	 * @return Baseline7Start
//	 */
//  public DateTime getBaseline7Start() {
//    return Baseline7Start;
//  }
//
//	/**
//	 * setBaseline7Start
//	 * Sets DateTime
//	 * @param Baseline7Start DateTime
//	 */
//  public void setBaseline7Start(DateTime Baseline7Start) {
//    this.Baseline7Start = Baseline7Start;
//  }
//
//  /**
//	 * getBaseline7Finish
//	 * Gets DateTime
//	 * @return Baseline7Finish
//	 */
//  public DateTime getBaseline7Finish() {
//    return Baseline7Finish;
//  }
//
//	/**
//	 * setBaseline7Finish
//	 * Sets DateTime
//	 * @param Baseline7Finish DateTime
//	 */
//  public void setBaseline7Finish(DateTime Baseline7Finish) {
//    this.Baseline7Finish = Baseline7Finish;
//  }
//
//  /**
//	 * getBaseline7Work
//	 * Gets String
//	 * @return Baseline7Work
//	 */
//  public String getBaseline7Work() {
//    return Baseline7Work;
//  }
//
//	/**
//	 * setBaseline7Work
//	 * Sets String
//	 * @param Baseline7Work String
//	 */
//  public void setBaseline7Work(String Baseline7Work) {
//    this.Baseline7Work = Baseline7Work;
//  }
//
//  /**
//	 * getBaseline7WorkString
//	 * Gets String
//	 * @return Baseline7WorkString
//	 */
//  public String getBaseline7WorkString() {
//    return Baseline7WorkString;
//  }
//
//	/**
//	 * setBaseline7WorkString
//	 * Sets String
//	 * @param Baseline7WorkString String
//	 */
//  public void setBaseline7WorkString(String Baseline7WorkString) {
//    this.Baseline7WorkString = Baseline7WorkString;
//  }
//
//  /**
//	 * getBaseline7Cost
//	 * Gets Double
//	 * @return Baseline7Cost
//	 */
//  public Double getBaseline7Cost() {
//    return Baseline7Cost;
//  }
//
//	/**
//	 * setBaseline7Cost
//	 * Sets Double
//	 * @param Baseline7Cost Double
//	 */
//  public void setBaseline7Cost(Double Baseline7Cost) {
//    this.Baseline7Cost = Baseline7Cost;
//  }
//
//  /**
//	 * getBaseline7Bcws
//	 * Gets Double
//	 * @return Baseline7Bcws
//	 */
//  public Double getBaseline7Bcws() {
//    return Baseline7Bcws;
//  }
//
//	/**
//	 * setBaseline7Bcws
//	 * Sets Double
//	 * @param Baseline7Bcws Double
//	 */
//  public void setBaseline7Bcws(Double Baseline7Bcws) {
//    this.Baseline7Bcws = Baseline7Bcws;
//  }
//
//  /**
//	 * getBaseline7Bcwp
//	 * Gets Double
//	 * @return Baseline7Bcwp
//	 */
//  public Double getBaseline7Bcwp() {
//    return Baseline7Bcwp;
//  }
//
//	/**
//	 * setBaseline7Bcwp
//	 * Sets Double
//	 * @param Baseline7Bcwp Double
//	 */
//  public void setBaseline7Bcwp(Double Baseline7Bcwp) {
//    this.Baseline7Bcwp = Baseline7Bcwp;
//  }
//
//  /**
//	 * getBaseline8Start
//	 * Gets DateTime
//	 * @return Baseline8Start
//	 */
//  public DateTime getBaseline8Start() {
//    return Baseline8Start;
//  }
//
//	/**
//	 * setBaseline8Start
//	 * Sets DateTime
//	 * @param Baseline8Start DateTime
//	 */
//  public void setBaseline8Start(DateTime Baseline8Start) {
//    this.Baseline8Start = Baseline8Start;
//  }
//
//  /**
//	 * getBaseline8Finish
//	 * Gets DateTime
//	 * @return Baseline8Finish
//	 */
//  public DateTime getBaseline8Finish() {
//    return Baseline8Finish;
//  }
//
//	/**
//	 * setBaseline8Finish
//	 * Sets DateTime
//	 * @param Baseline8Finish DateTime
//	 */
//  public void setBaseline8Finish(DateTime Baseline8Finish) {
//    this.Baseline8Finish = Baseline8Finish;
//  }
//
//  /**
//	 * getBaseline8Work
//	 * Gets String
//	 * @return Baseline8Work
//	 */
//  public String getBaseline8Work() {
//    return Baseline8Work;
//  }
//
//	/**
//	 * setBaseline8Work
//	 * Sets String
//	 * @param Baseline8Work String
//	 */
//  public void setBaseline8Work(String Baseline8Work) {
//    this.Baseline8Work = Baseline8Work;
//  }
//
//  /**
//	 * getBaseline8WorkString
//	 * Gets String
//	 * @return Baseline8WorkString
//	 */
//  public String getBaseline8WorkString() {
//    return Baseline8WorkString;
//  }
//
//	/**
//	 * setBaseline8WorkString
//	 * Sets String
//	 * @param Baseline8WorkString String
//	 */
//  public void setBaseline8WorkString(String Baseline8WorkString) {
//    this.Baseline8WorkString = Baseline8WorkString;
//  }
//
//  /**
//	 * getBaseline8Cost
//	 * Gets Double
//	 * @return Baseline8Cost
//	 */
//  public Double getBaseline8Cost() {
//    return Baseline8Cost;
//  }
//
//	/**
//	 * setBaseline8Cost
//	 * Sets Double
//	 * @param Baseline8Cost Double
//	 */
//  public void setBaseline8Cost(Double Baseline8Cost) {
//    this.Baseline8Cost = Baseline8Cost;
//  }
//
//  /**
//	 * getBaseline8Bcws
//	 * Gets Double
//	 * @return Baseline8Bcws
//	 */
//  public Double getBaseline8Bcws() {
//    return Baseline8Bcws;
//  }
//
//	/**
//	 * setBaseline8Bcws
//	 * Sets Double
//	 * @param Baseline8Bcws Double
//	 */
//  public void setBaseline8Bcws(Double Baseline8Bcws) {
//    this.Baseline8Bcws = Baseline8Bcws;
//  }
//
//  /**
//	 * getBaseline8Bcwp
//	 * Gets Double
//	 * @return Baseline8Bcwp
//	 */
//  public Double getBaseline8Bcwp() {
//    return Baseline8Bcwp;
//  }
//
//	/**
//	 * setBaseline8Bcwp
//	 * Sets Double
//	 * @param Baseline8Bcwp Double
//	 */
//  public void setBaseline8Bcwp(Double Baseline8Bcwp) {
//    this.Baseline8Bcwp = Baseline8Bcwp;
//  }
//
//  /**
//	 * getBaseline9Start
//	 * Gets DateTime
//	 * @return Baseline9Start
//	 */
//  public DateTime getBaseline9Start() {
//    return Baseline9Start;
//  }
//
//	/**
//	 * setBaseline9Start
//	 * Sets DateTime
//	 * @param Baseline9Start DateTime
//	 */
//  public void setBaseline9Start(DateTime Baseline9Start) {
//    this.Baseline9Start = Baseline9Start;
//  }
//
//  /**
//	 * getBaseline9Finish
//	 * Gets DateTime
//	 * @return Baseline9Finish
//	 */
//  public DateTime getBaseline9Finish() {
//    return Baseline9Finish;
//  }
//
//	/**
//	 * setBaseline9Finish
//	 * Sets DateTime
//	 * @param Baseline9Finish DateTime
//	 */
//  public void setBaseline9Finish(DateTime Baseline9Finish) {
//    this.Baseline9Finish = Baseline9Finish;
//  }
//
//  /**
//	 * getBaseline9Work
//	 * Gets String
//	 * @return Baseline9Work
//	 */
//  public String getBaseline9Work() {
//    return Baseline9Work;
//  }
//
//	/**
//	 * setBaseline9Work
//	 * Sets String
//	 * @param Baseline9Work String
//	 */
//  public void setBaseline9Work(String Baseline9Work) {
//    this.Baseline9Work = Baseline9Work;
//  }
//
//  /**
//	 * getBaseline9WorkString
//	 * Gets String
//	 * @return Baseline9WorkString
//	 */
//  public String getBaseline9WorkString() {
//    return Baseline9WorkString;
//  }
//
//	/**
//	 * setBaseline9WorkString
//	 * Sets String
//	 * @param Baseline9WorkString String
//	 */
//  public void setBaseline9WorkString(String Baseline9WorkString) {
//    this.Baseline9WorkString = Baseline9WorkString;
//  }
//
//  /**
//	 * getBaseline9Cost
//	 * Gets Double
//	 * @return Baseline9Cost
//	 */
//  public Double getBaseline9Cost() {
//    return Baseline9Cost;
//  }
//
//	/**
//	 * setBaseline9Cost
//	 * Sets Double
//	 * @param Baseline9Cost Double
//	 */
//  public void setBaseline9Cost(Double Baseline9Cost) {
//    this.Baseline9Cost = Baseline9Cost;
//  }
//
//  /**
//	 * getBaseline9Bcws
//	 * Gets Double
//	 * @return Baseline9Bcws
//	 */
//  public Double getBaseline9Bcws() {
//    return Baseline9Bcws;
//  }
//
//	/**
//	 * setBaseline9Bcws
//	 * Sets Double
//	 * @param Baseline9Bcws Double
//	 */
//  public void setBaseline9Bcws(Double Baseline9Bcws) {
//    this.Baseline9Bcws = Baseline9Bcws;
//  }
//
//  /**
//	 * getBaseline9Bcwp
//	 * Gets Double
//	 * @return Baseline9Bcwp
//	 */
//  public Double getBaseline9Bcwp() {
//    return Baseline9Bcwp;
//  }
//
//	/**
//	 * setBaseline9Bcwp
//	 * Sets Double
//	 * @param Baseline9Bcwp Double
//	 */
//  public void setBaseline9Bcwp(Double Baseline9Bcwp) {
//    this.Baseline9Bcwp = Baseline9Bcwp;
//  }
//
//  /**
//	 * getBaseline10Start
//	 * Gets DateTime
//	 * @return Baseline10Start
//	 */
//  public DateTime getBaseline10Start() {
//    return Baseline10Start;
//  }
//
//	/**
//	 * setBaseline10Start
//	 * Sets DateTime
//	 * @param Baseline10Start DateTime
//	 */
//  public void setBaseline10Start(DateTime Baseline10Start) {
//    this.Baseline10Start = Baseline10Start;
//  }
//
//  /**
//	 * getBaseline10Finish
//	 * Gets DateTime
//	 * @return Baseline10Finish
//	 */
//  public DateTime getBaseline10Finish() {
//    return Baseline10Finish;
//  }
//
//	/**
//	 * setBaseline10Finish
//	 * Sets DateTime
//	 * @param Baseline10Finish DateTime
//	 */
//  public void setBaseline10Finish(DateTime Baseline10Finish) {
//    this.Baseline10Finish = Baseline10Finish;
//  }
//
//  /**
//	 * getBaseline10Work
//	 * Gets String
//	 * @return Baseline10Work
//	 */
//  public String getBaseline10Work() {
//    return Baseline10Work;
//  }
//
//	/**
//	 * setBaseline10Work
//	 * Sets String
//	 * @param Baseline10Work String
//	 */
//  public void setBaseline10Work(String Baseline10Work) {
//    this.Baseline10Work = Baseline10Work;
//  }
//
//  /**
//	 * getBaseline10WorkString
//	 * Gets String
//	 * @return Baseline10WorkString
//	 */
//  public String getBaseline10WorkString() {
//    return Baseline10WorkString;
//  }
//
//	/**
//	 * setBaseline10WorkString
//	 * Sets String
//	 * @param Baseline10WorkString String
//	 */
//  public void setBaseline10WorkString(String Baseline10WorkString) {
//    this.Baseline10WorkString = Baseline10WorkString;
//  }
//
//  /**
//	 * getBaseline10Cost
//	 * Gets Double
//	 * @return Baseline10Cost
//	 */
//  public Double getBaseline10Cost() {
//    return Baseline10Cost;
//  }
//
//	/**
//	 * setBaseline10Cost
//	 * Sets Double
//	 * @param Baseline10Cost Double
//	 */
//  public void setBaseline10Cost(Double Baseline10Cost) {
//    this.Baseline10Cost = Baseline10Cost;
//  }
//
//  /**
//	 * getBaseline10Bcws
//	 * Gets Double
//	 * @return Baseline10Bcws
//	 */
//  public Double getBaseline10Bcws() {
//    return Baseline10Bcws;
//  }
//
//	/**
//	 * setBaseline10Bcws
//	 * Sets Double
//	 * @param Baseline10Bcws Double
//	 */
//  public void setBaseline10Bcws(Double Baseline10Bcws) {
//    this.Baseline10Bcws = Baseline10Bcws;
//  }
//
//  /**
//	 * getBaseline10Bcwp
//	 * Gets Double
//	 * @return Baseline10Bcwp
//	 */
//  public Double getBaseline10Bcwp() {
//    return Baseline10Bcwp;
//  }
//
//	/**
//	 * setBaseline10Bcwp
//	 * Sets Double
//	 * @param Baseline10Bcwp Double
//	 */
//  public void setBaseline10Bcwp(Double Baseline10Bcwp) {
//    this.Baseline10Bcwp = Baseline10Bcwp;
//  }
//
//  /**
//	 * getExtendedAttributes
//	 * Gets List<ExtendedAttribute>
//	 * @return ExtendedAttributes
//	 */
//  public List<ExtendedAttribute> getExtendedAttributes() {
//    return ExtendedAttributes;
//  }
//
//	/**
//	 * setExtendedAttributes
//	 * Sets List<ExtendedAttribute>
//	 * @param ExtendedAttributes List<ExtendedAttribute>
//	 */
//  public void setExtendedAttributes(List<ExtendedAttribute> ExtendedAttributes) {
//    this.ExtendedAttributes = ExtendedAttributes;
//  }

    private Integer TaskUid;
    private Integer ResourceUid;
    private Integer Uid;
    private Integer PercentWorkComplete;
    private Double ActualCost;
    private String ActualFinish;
    private Double ActualOvertimeCost;
    private String ActualOvertimeWork;
    private String ActualStart;
    private String ActualWork;
    private Double Acwp;
    private Boolean Confirmed;
    private Double Cost;
    private Integer CostRateTableType;
    private Double CostVariance;
    private Double Cv;
    private Integer Delay;
    private String Finish;
    private Integer FinishVariance;
    private Object Hyperlink;
    private Object HyperlinkAddress;
    private Object HyperlinkSubAddress;
    private Double WorkVariance;
    private Boolean HasFixedRateUnits;
    private Boolean FixedMaterial;
    private Integer LevelingDelay;
    private Integer LevelingDelayFormat;
    private Boolean LinkedFields;
    private Boolean Milestone;
    private Object Notes;
    private Boolean Overallocated;
    private Double OvertimeCost;
    private String OvertimeWork;
    private Double PeakUnits;
    private String RegularWork;
    private Double RemainingCost;
    private Double RemainingOvertimeCost;
    private String RemainingOvertimeWork;
    private String RemainingWork;
    private Boolean ResponsePending;
    private String Start;
    private String Stop;
    private String Resume;
    private Integer StartVariance;
    private Boolean Summary;
    private Double Sv;
    private Double Units;
    private Boolean UpdateNeeded;
    private Double Vac;
    private String Work;
    private Integer WorkContour;
    private Double Bcws;
    private Double Bcwp;
    private Integer BookingType;
    private String ActualWorkProtected;
    private String ActualOvertimeWorkProtected;
    private String CreationDate;
    private Object AssnOwner;
    private Object AssnOwnerGuid;
    private Double BudgetCost;
    private String BudgetWork;
    private Integer RateScale;
    private String BaselineStart;
    private String BaselineFinish;
    private String BaselineWork;
    private Double BaselineCost;
    private Double BaselineBcws;
    private Double BaselineBcwp;
    private String Baseline1Start;
    private String Baseline1Finish;
    private String Baseline1Work;
    private Double Baseline1Cost;
    private Double Baseline1Bcws;
    private Double Baseline1Bcwp;
    private String Baseline2Start;
    private String Baseline2Finish;
    private String Baseline2Work;
    private Double Baseline2Cost;
    private Double Baseline2Bcws;
    private Double Baseline2Bcwp;
    private String Baseline3Start;
    private String Baseline3Finish;
    private String Baseline3Work;
    private Double Baseline3Cost;
    private Double Baseline3Bcws;
    private Double Baseline3Bcwp;
    private String Baseline4Start;
    private String Baseline4Finish;
    private String Baseline4Work;
    private Double Baseline4Cost;
    private Double Baseline4Bcws;
    private Double Baseline4Bcwp;
    private String Baseline5Start;
    private String Baseline5Finish;
    private String Baseline5Work;
    private Double Baseline5Cost;
    private Double Baseline5Bcws;
    private Double Baseline5Bcwp;
    private String Baseline6Start;
    private String Baseline6Finish;
    private String Baseline6Work;
    private Double Baseline6Cost;
    private Double Baseline6Bcws;
    private Double Baseline6Bcwp;
    private String Baseline7Start;
    private String Baseline7Finish;
    private String Baseline7Work;
    private Double Baseline7Cost;
    private Double Baseline7Bcws;
    private Double Baseline7Bcwp;
    private String Baseline8Start;
    private String Baseline8Finish;
    private String Baseline8Work;
    private Double Baseline8Cost;
    private Double Baseline8Bcws;
    private Double Baseline8Bcwp;
    private String Baseline9Start;
    private String Baseline9Finish;
    private String Baseline9Work;
    private Double Baseline9Cost;
    private Double Baseline9Bcws;
    private Double Baseline9Bcwp;
    private String Baseline10Start;
    private String Baseline10Finish;
    private String Baseline10Work;
    private Double Baseline10Cost;
    private Double Baseline10Bcws;
    private Double Baseline10Bcwp;
    private List<Object> ExtendedAttributes = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The TaskUid
     */
    public Integer getTaskUid() {
        return TaskUid;
    }

    /**
     * 
     * @param TaskUid
     *     The TaskUid
     */
    public void setTaskUid(Integer TaskUid) {
        this.TaskUid = TaskUid;
    }

    /**
     * 
     * @return
     *     The ResourceUid
     */
    public Integer getResourceUid() {
        return ResourceUid;
    }

    /**
     * 
     * @param ResourceUid
     *     The ResourceUid
     */
    public void setResourceUid(Integer ResourceUid) {
        this.ResourceUid = ResourceUid;
    }

    /**
     * 
     * @return
     *     The Uid
     */
    public Integer getUid() {
        return Uid;
    }

    /**
     * 
     * @param Uid
     *     The Uid
     */
    public void setUid(Integer Uid) {
        this.Uid = Uid;
    }

    /**
     * 
     * @return
     *     The PercentWorkComplete
     */
    public Integer getPercentWorkComplete() {
        return PercentWorkComplete;
    }

    /**
     * 
     * @param PercentWorkComplete
     *     The PercentWorkComplete
     */
    public void setPercentWorkComplete(Integer PercentWorkComplete) {
        this.PercentWorkComplete = PercentWorkComplete;
    }

    /**
     * 
     * @return
     *     The ActualCost
     */
    public Double getActualCost() {
        return ActualCost;
    }

    /**
     * 
     * @param ActualCost
     *     The ActualCost
     */
    public void setActualCost(Double ActualCost) {
        this.ActualCost = ActualCost;
    }

    /**
     * 
     * @return
     *     The ActualFinish
     */
    public String getActualFinish() {
        return ActualFinish;
    }

    /**
     * 
     * @param ActualFinish
     *     The ActualFinish
     */
    public void setActualFinish(String ActualFinish) {
        this.ActualFinish = ActualFinish;
    }

    /**
     * 
     * @return
     *     The ActualOvertimeCost
     */
    public Double getActualOvertimeCost() {
        return ActualOvertimeCost;
    }

    /**
     * 
     * @param ActualOvertimeCost
     *     The ActualOvertimeCost
     */
    public void setActualOvertimeCost(Double ActualOvertimeCost) {
        this.ActualOvertimeCost = ActualOvertimeCost;
    }

    /**
     * 
     * @return
     *     The ActualOvertimeWork
     */
    public String getActualOvertimeWork() {
        return ActualOvertimeWork;
    }

    /**
     * 
     * @param ActualOvertimeWork
     *     The ActualOvertimeWork
     */
    public void setActualOvertimeWork(String ActualOvertimeWork) {
        this.ActualOvertimeWork = ActualOvertimeWork;
    }

    /**
     * 
     * @return
     *     The ActualStart
     */
    public String getActualStart() {
        return ActualStart;
    }

    /**
     * 
     * @param ActualStart
     *     The ActualStart
     */
    public void setActualStart(String ActualStart) {
        this.ActualStart = ActualStart;
    }

    /**
     * 
     * @return
     *     The ActualWork
     */
    public String getActualWork() {
        return ActualWork;
    }

    /**
     * 
     * @param ActualWork
     *     The ActualWork
     */
    public void setActualWork(String ActualWork) {
        this.ActualWork = ActualWork;
    }

    /**
     * 
     * @return
     *     The Acwp
     */
    public Double getAcwp() {
        return Acwp;
    }

    /**
     * 
     * @param Acwp
     *     The Acwp
     */
    public void setAcwp(Double Acwp) {
        this.Acwp = Acwp;
    }

    /**
     * 
     * @return
     *     The Confirmed
     */
    public Boolean getConfirmed() {
        return Confirmed;
    }

    /**
     * 
     * @param Confirmed
     *     The Confirmed
     */
    public void setConfirmed(Boolean Confirmed) {
        this.Confirmed = Confirmed;
    }

    /**
     * 
     * @return
     *     The Cost
     */
    public Double getCost() {
        return Cost;
    }

    /**
     * 
     * @param Cost
     *     The Cost
     */
    public void setCost(Double Cost) {
        this.Cost = Cost;
    }

    /**
     * 
     * @return
     *     The CostRateTableType
     */
    public Integer getCostRateTableType() {
        return CostRateTableType;
    }

    /**
     * 
     * @param CostRateTableType
     *     The CostRateTableType
     */
    public void setCostRateTableType(Integer CostRateTableType) {
        this.CostRateTableType = CostRateTableType;
    }

    /**
     * 
     * @return
     *     The CostVariance
     */
    public Double getCostVariance() {
        return CostVariance;
    }

    /**
     * 
     * @param CostVariance
     *     The CostVariance
     */
    public void setCostVariance(Double CostVariance) {
        this.CostVariance = CostVariance;
    }

    /**
     * 
     * @return
     *     The Cv
     */
    public Double getCv() {
        return Cv;
    }

    /**
     * 
     * @param Cv
     *     The Cv
     */
    public void setCv(Double Cv) {
        this.Cv = Cv;
    }

    /**
     * 
     * @return
     *     The Delay
     */
    public Integer getDelay() {
        return Delay;
    }

    /**
     * 
     * @param Delay
     *     The Delay
     */
    public void setDelay(Integer Delay) {
        this.Delay = Delay;
    }

    /**
     * 
     * @return
     *     The Finish
     */
    public String getFinish() {
        return Finish;
    }

    /**
     * 
     * @param Finish
     *     The Finish
     */
    public void setFinish(String Finish) {
        this.Finish = Finish;
    }

    /**
     * 
     * @return
     *     The FinishVariance
     */
    public Integer getFinishVariance() {
        return FinishVariance;
    }

    /**
     * 
     * @param FinishVariance
     *     The FinishVariance
     */
    public void setFinishVariance(Integer FinishVariance) {
        this.FinishVariance = FinishVariance;
    }

    /**
     * 
     * @return
     *     The Hyperlink
     */
    public Object getHyperlink() {
        return Hyperlink;
    }

    /**
     * 
     * @param Hyperlink
     *     The Hyperlink
     */
    public void setHyperlink(Object Hyperlink) {
        this.Hyperlink = Hyperlink;
    }

    /**
     * 
     * @return
     *     The HyperlinkAddress
     */
    public Object getHyperlinkAddress() {
        return HyperlinkAddress;
    }

    /**
     * 
     * @param HyperlinkAddress
     *     The HyperlinkAddress
     */
    public void setHyperlinkAddress(Object HyperlinkAddress) {
        this.HyperlinkAddress = HyperlinkAddress;
    }

    /**
     * 
     * @return
     *     The HyperlinkSubAddress
     */
    public Object getHyperlinkSubAddress() {
        return HyperlinkSubAddress;
    }

    /**
     * 
     * @param HyperlinkSubAddress
     *     The HyperlinkSubAddress
     */
    public void setHyperlinkSubAddress(Object HyperlinkSubAddress) {
        this.HyperlinkSubAddress = HyperlinkSubAddress;
    }

    /**
     * 
     * @return
     *     The WorkVariance
     */
    public Double getWorkVariance() {
        return WorkVariance;
    }

    /**
     * 
     * @param WorkVariance
     *     The WorkVariance
     */
    public void setWorkVariance(Double WorkVariance) {
        this.WorkVariance = WorkVariance;
    }

    /**
     * 
     * @return
     *     The HasFixedRateUnits
     */
    public Boolean getHasFixedRateUnits() {
        return HasFixedRateUnits;
    }

    /**
     * 
     * @param HasFixedRateUnits
     *     The HasFixedRateUnits
     */
    public void setHasFixedRateUnits(Boolean HasFixedRateUnits) {
        this.HasFixedRateUnits = HasFixedRateUnits;
    }

    /**
     * 
     * @return
     *     The FixedMaterial
     */
    public Boolean getFixedMaterial() {
        return FixedMaterial;
    }

    /**
     * 
     * @param FixedMaterial
     *     The FixedMaterial
     */
    public void setFixedMaterial(Boolean FixedMaterial) {
        this.FixedMaterial = FixedMaterial;
    }

    /**
     * 
     * @return
     *     The LevelingDelay
     */
    public Integer getLevelingDelay() {
        return LevelingDelay;
    }

    /**
     * 
     * @param LevelingDelay
     *     The LevelingDelay
     */
    public void setLevelingDelay(Integer LevelingDelay) {
        this.LevelingDelay = LevelingDelay;
    }

    /**
     * 
     * @return
     *     The LevelingDelayFormat
     */
    public Integer getLevelingDelayFormat() {
        return LevelingDelayFormat;
    }

    /**
     * 
     * @param LevelingDelayFormat
     *     The LevelingDelayFormat
     */
    public void setLevelingDelayFormat(Integer LevelingDelayFormat) {
        this.LevelingDelayFormat = LevelingDelayFormat;
    }

    /**
     * 
     * @return
     *     The LinkedFields
     */
    public Boolean getLinkedFields() {
        return LinkedFields;
    }

    /**
     * 
     * @param LinkedFields
     *     The LinkedFields
     */
    public void setLinkedFields(Boolean LinkedFields) {
        this.LinkedFields = LinkedFields;
    }

    /**
     * 
     * @return
     *     The Milestone
     */
    public Boolean getMilestone() {
        return Milestone;
    }

    /**
     * 
     * @param Milestone
     *     The Milestone
     */
    public void setMilestone(Boolean Milestone) {
        this.Milestone = Milestone;
    }

    /**
     * 
     * @return
     *     The Notes
     */
    public Object getNotes() {
        return Notes;
    }

    /**
     * 
     * @param Notes
     *     The Notes
     */
    public void setNotes(Object Notes) {
        this.Notes = Notes;
    }

    /**
     * 
     * @return
     *     The Overallocated
     */
    public Boolean getOverallocated() {
        return Overallocated;
    }

    /**
     * 
     * @param Overallocated
     *     The Overallocated
     */
    public void setOverallocated(Boolean Overallocated) {
        this.Overallocated = Overallocated;
    }

    /**
     * 
     * @return
     *     The OvertimeCost
     */
    public Double getOvertimeCost() {
        return OvertimeCost;
    }

    /**
     * 
     * @param OvertimeCost
     *     The OvertimeCost
     */
    public void setOvertimeCost(Double OvertimeCost) {
        this.OvertimeCost = OvertimeCost;
    }

    /**
     * 
     * @return
     *     The OvertimeWork
     */
    public String getOvertimeWork() {
        return OvertimeWork;
    }

    /**
     * 
     * @param OvertimeWork
     *     The OvertimeWork
     */
    public void setOvertimeWork(String OvertimeWork) {
        this.OvertimeWork = OvertimeWork;
    }

    /**
     * 
     * @return
     *     The PeakUnits
     */
    public Double getPeakUnits() {
        return PeakUnits;
    }

    /**
     * 
     * @param PeakUnits
     *     The PeakUnits
     */
    public void setPeakUnits(Double PeakUnits) {
        this.PeakUnits = PeakUnits;
    }

    /**
     * 
     * @return
     *     The RegularWork
     */
    public String getRegularWork() {
        return RegularWork;
    }

    /**
     * 
     * @param RegularWork
     *     The RegularWork
     */
    public void setRegularWork(String RegularWork) {
        this.RegularWork = RegularWork;
    }

    /**
     * 
     * @return
     *     The RemainingCost
     */
    public Double getRemainingCost() {
        return RemainingCost;
    }

    /**
     * 
     * @param RemainingCost
     *     The RemainingCost
     */
    public void setRemainingCost(Double RemainingCost) {
        this.RemainingCost = RemainingCost;
    }

    /**
     * 
     * @return
     *     The RemainingOvertimeCost
     */
    public Double getRemainingOvertimeCost() {
        return RemainingOvertimeCost;
    }

    /**
     * 
     * @param RemainingOvertimeCost
     *     The RemainingOvertimeCost
     */
    public void setRemainingOvertimeCost(Double RemainingOvertimeCost) {
        this.RemainingOvertimeCost = RemainingOvertimeCost;
    }

    /**
     * 
     * @return
     *     The RemainingOvertimeWork
     */
    public String getRemainingOvertimeWork() {
        return RemainingOvertimeWork;
    }

    /**
     * 
     * @param RemainingOvertimeWork
     *     The RemainingOvertimeWork
     */
    public void setRemainingOvertimeWork(String RemainingOvertimeWork) {
        this.RemainingOvertimeWork = RemainingOvertimeWork;
    }

    /**
     * 
     * @return
     *     The RemainingWork
     */
    public String getRemainingWork() {
        return RemainingWork;
    }

    /**
     * 
     * @param RemainingWork
     *     The RemainingWork
     */
    public void setRemainingWork(String RemainingWork) {
        this.RemainingWork = RemainingWork;
    }

    /**
     * 
     * @return
     *     The ResponsePending
     */
    public Boolean getResponsePending() {
        return ResponsePending;
    }

    /**
     * 
     * @param ResponsePending
     *     The ResponsePending
     */
    public void setResponsePending(Boolean ResponsePending) {
        this.ResponsePending = ResponsePending;
    }

    /**
     * 
     * @return
     *     The Start
     */
    public String getStart() {
        return Start;
    }

    /**
     * 
     * @param Start
     *     The Start
     */
    public void setStart(String Start) {
        this.Start = Start;
    }

    /**
     * 
     * @return
     *     The Stop
     */
    public String getStop() {
        return Stop;
    }

    /**
     * 
     * @param Stop
     *     The Stop
     */
    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    /**
     * 
     * @return
     *     The Resume
     */
    public String getResume() {
        return Resume;
    }

    /**
     * 
     * @param Resume
     *     The Resume
     */
    public void setResume(String Resume) {
        this.Resume = Resume;
    }

    /**
     * 
     * @return
     *     The StartVariance
     */
    public Integer getStartVariance() {
        return StartVariance;
    }

    /**
     * 
     * @param StartVariance
     *     The StartVariance
     */
    public void setStartVariance(Integer StartVariance) {
        this.StartVariance = StartVariance;
    }

    /**
     * 
     * @return
     *     The Summary
     */
    public Boolean getSummary() {
        return Summary;
    }

    /**
     * 
     * @param Summary
     *     The Summary
     */
    public void setSummary(Boolean Summary) {
        this.Summary = Summary;
    }

    /**
     * 
     * @return
     *     The Sv
     */
    public Double getSv() {
        return Sv;
    }

    /**
     * 
     * @param Sv
     *     The Sv
     */
    public void setSv(Double Sv) {
        this.Sv = Sv;
    }

    /**
     * 
     * @return
     *     The Units
     */
    public Double getUnits() {
        return Units;
    }

    /**
     * 
     * @param Units
     *     The Units
     */
    public void setUnits(Double Units) {
        this.Units = Units;
    }

    /**
     * 
     * @return
     *     The UpdateNeeded
     */
    public Boolean getUpdateNeeded() {
        return UpdateNeeded;
    }

    /**
     * 
     * @param UpdateNeeded
     *     The UpdateNeeded
     */
    public void setUpdateNeeded(Boolean UpdateNeeded) {
        this.UpdateNeeded = UpdateNeeded;
    }

    /**
     * 
     * @return
     *     The Vac
     */
    public Double getVac() {
        return Vac;
    }

    /**
     * 
     * @param Vac
     *     The Vac
     */
    public void setVac(Double Vac) {
        this.Vac = Vac;
    }

    /**
     * 
     * @return
     *     The Work
     */
    public String getWork() {
        return Work;
    }

    /**
     * 
     * @param Work
     *     The Work
     */
    public void setWork(String Work) {
        this.Work = Work;
    }

    /**
     * 
     * @return
     *     The WorkContour
     */
    public Integer getWorkContour() {
        return WorkContour;
    }

    /**
     * 
     * @param WorkContour
     *     The WorkContour
     */
    public void setWorkContour(Integer WorkContour) {
        this.WorkContour = WorkContour;
    }

    /**
     * 
     * @return
     *     The Bcws
     */
    public Double getBcws() {
        return Bcws;
    }

    /**
     * 
     * @param Bcws
     *     The Bcws
     */
    public void setBcws(Double Bcws) {
        this.Bcws = Bcws;
    }

    /**
     * 
     * @return
     *     The Bcwp
     */
    public Double getBcwp() {
        return Bcwp;
    }

    /**
     * 
     * @param Bcwp
     *     The Bcwp
     */
    public void setBcwp(Double Bcwp) {
        this.Bcwp = Bcwp;
    }

    /**
     * 
     * @return
     *     The BookingType
     */
    public Integer getBookingType() {
        return BookingType;
    }

    /**
     * 
     * @param BookingType
     *     The BookingType
     */
    public void setBookingType(Integer BookingType) {
        this.BookingType = BookingType;
    }

    /**
     * 
     * @return
     *     The ActualWorkProtected
     */
    public String getActualWorkProtected() {
        return ActualWorkProtected;
    }

    /**
     * 
     * @param ActualWorkProtected
     *     The ActualWorkProtected
     */
    public void setActualWorkProtected(String ActualWorkProtected) {
        this.ActualWorkProtected = ActualWorkProtected;
    }

    /**
     * 
     * @return
     *     The ActualOvertimeWorkProtected
     */
    public String getActualOvertimeWorkProtected() {
        return ActualOvertimeWorkProtected;
    }

    /**
     * 
     * @param ActualOvertimeWorkProtected
     *     The ActualOvertimeWorkProtected
     */
    public void setActualOvertimeWorkProtected(String ActualOvertimeWorkProtected) {
        this.ActualOvertimeWorkProtected = ActualOvertimeWorkProtected;
    }

    /**
     * 
     * @return
     *     The CreationDate
     */
    public String getCreationDate() {
        return CreationDate;
    }

    /**
     * 
     * @param CreationDate
     *     The CreationDate
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * 
     * @return
     *     The AssnOwner
     */
    public Object getAssnOwner() {
        return AssnOwner;
    }

    /**
     * 
     * @param AssnOwner
     *     The AssnOwner
     */
    public void setAssnOwner(Object AssnOwner) {
        this.AssnOwner = AssnOwner;
    }

    /**
     * 
     * @return
     *     The AssnOwnerGuid
     */
    public Object getAssnOwnerGuid() {
        return AssnOwnerGuid;
    }

    /**
     * 
     * @param AssnOwnerGuid
     *     The AssnOwnerGuid
     */
    public void setAssnOwnerGuid(Object AssnOwnerGuid) {
        this.AssnOwnerGuid = AssnOwnerGuid;
    }

    /**
     * 
     * @return
     *     The BudgetCost
     */
    public Double getBudgetCost() {
        return BudgetCost;
    }

    /**
     * 
     * @param BudgetCost
     *     The BudgetCost
     */
    public void setBudgetCost(Double BudgetCost) {
        this.BudgetCost = BudgetCost;
    }

    /**
     * 
     * @return
     *     The BudgetWork
     */
    public String getBudgetWork() {
        return BudgetWork;
    }

    /**
     * 
     * @param BudgetWork
     *     The BudgetWork
     */
    public void setBudgetWork(String BudgetWork) {
        this.BudgetWork = BudgetWork;
    }

    /**
     * 
     * @return
     *     The RateScale
     */
    public Integer getRateScale() {
        return RateScale;
    }

    /**
     * 
     * @param RateScale
     *     The RateScale
     */
    public void setRateScale(Integer RateScale) {
        this.RateScale = RateScale;
    }

    /**
     * 
     * @return
     *     The BaselineStart
     */
    public String getBaselineStart() {
        return BaselineStart;
    }

    /**
     * 
     * @param BaselineStart
     *     The BaselineStart
     */
    public void setBaselineStart(String BaselineStart) {
        this.BaselineStart = BaselineStart;
    }

    /**
     * 
     * @return
     *     The BaselineFinish
     */
    public String getBaselineFinish() {
        return BaselineFinish;
    }

    /**
     * 
     * @param BaselineFinish
     *     The BaselineFinish
     */
    public void setBaselineFinish(String BaselineFinish) {
        this.BaselineFinish = BaselineFinish;
    }

    /**
     * 
     * @return
     *     The BaselineWork
     */
    public String getBaselineWork() {
        return BaselineWork;
    }

    /**
     * 
     * @param BaselineWork
     *     The BaselineWork
     */
    public void setBaselineWork(String BaselineWork) {
        this.BaselineWork = BaselineWork;
    }

    /**
     * 
     * @return
     *     The BaselineCost
     */
    public Double getBaselineCost() {
        return BaselineCost;
    }

    /**
     * 
     * @param BaselineCost
     *     The BaselineCost
     */
    public void setBaselineCost(Double BaselineCost) {
        this.BaselineCost = BaselineCost;
    }

    /**
     * 
     * @return
     *     The BaselineBcws
     */
    public Double getBaselineBcws() {
        return BaselineBcws;
    }

    /**
     * 
     * @param BaselineBcws
     *     The BaselineBcws
     */
    public void setBaselineBcws(Double BaselineBcws) {
        this.BaselineBcws = BaselineBcws;
    }

    /**
     * 
     * @return
     *     The BaselineBcwp
     */
    public Double getBaselineBcwp() {
        return BaselineBcwp;
    }

    /**
     * 
     * @param BaselineBcwp
     *     The BaselineBcwp
     */
    public void setBaselineBcwp(Double BaselineBcwp) {
        this.BaselineBcwp = BaselineBcwp;
    }

    /**
     * 
     * @return
     *     The Baseline1Start
     */
    public String getBaseline1Start() {
        return Baseline1Start;
    }

    /**
     * 
     * @param Baseline1Start
     *     The Baseline1Start
     */
    public void setBaseline1Start(String Baseline1Start) {
        this.Baseline1Start = Baseline1Start;
    }

    /**
     * 
     * @return
     *     The Baseline1Finish
     */
    public String getBaseline1Finish() {
        return Baseline1Finish;
    }

    /**
     * 
     * @param Baseline1Finish
     *     The Baseline1Finish
     */
    public void setBaseline1Finish(String Baseline1Finish) {
        this.Baseline1Finish = Baseline1Finish;
    }

    /**
     * 
     * @return
     *     The Baseline1Work
     */
    public String getBaseline1Work() {
        return Baseline1Work;
    }

    /**
     * 
     * @param Baseline1Work
     *     The Baseline1Work
     */
    public void setBaseline1Work(String Baseline1Work) {
        this.Baseline1Work = Baseline1Work;
    }

    /**
     * 
     * @return
     *     The Baseline1Cost
     */
    public Double getBaseline1Cost() {
        return Baseline1Cost;
    }

    /**
     * 
     * @param Baseline1Cost
     *     The Baseline1Cost
     */
    public void setBaseline1Cost(Double Baseline1Cost) {
        this.Baseline1Cost = Baseline1Cost;
    }

    /**
     * 
     * @return
     *     The Baseline1Bcws
     */
    public Double getBaseline1Bcws() {
        return Baseline1Bcws;
    }

    /**
     * 
     * @param Baseline1Bcws
     *     The Baseline1Bcws
     */
    public void setBaseline1Bcws(Double Baseline1Bcws) {
        this.Baseline1Bcws = Baseline1Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline1Bcwp
     */
    public Double getBaseline1Bcwp() {
        return Baseline1Bcwp;
    }

    /**
     * 
     * @param Baseline1Bcwp
     *     The Baseline1Bcwp
     */
    public void setBaseline1Bcwp(Double Baseline1Bcwp) {
        this.Baseline1Bcwp = Baseline1Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline2Start
     */
    public String getBaseline2Start() {
        return Baseline2Start;
    }

    /**
     * 
     * @param Baseline2Start
     *     The Baseline2Start
     */
    public void setBaseline2Start(String Baseline2Start) {
        this.Baseline2Start = Baseline2Start;
    }

    /**
     * 
     * @return
     *     The Baseline2Finish
     */
    public String getBaseline2Finish() {
        return Baseline2Finish;
    }

    /**
     * 
     * @param Baseline2Finish
     *     The Baseline2Finish
     */
    public void setBaseline2Finish(String Baseline2Finish) {
        this.Baseline2Finish = Baseline2Finish;
    }

    /**
     * 
     * @return
     *     The Baseline2Work
     */
    public String getBaseline2Work() {
        return Baseline2Work;
    }

    /**
     * 
     * @param Baseline2Work
     *     The Baseline2Work
     */
    public void setBaseline2Work(String Baseline2Work) {
        this.Baseline2Work = Baseline2Work;
    }

    /**
     * 
     * @return
     *     The Baseline2Cost
     */
    public Double getBaseline2Cost() {
        return Baseline2Cost;
    }

    /**
     * 
     * @param Baseline2Cost
     *     The Baseline2Cost
     */
    public void setBaseline2Cost(Double Baseline2Cost) {
        this.Baseline2Cost = Baseline2Cost;
    }

    /**
     * 
     * @return
     *     The Baseline2Bcws
     */
    public Double getBaseline2Bcws() {
        return Baseline2Bcws;
    }

    /**
     * 
     * @param Baseline2Bcws
     *     The Baseline2Bcws
     */
    public void setBaseline2Bcws(Double Baseline2Bcws) {
        this.Baseline2Bcws = Baseline2Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline2Bcwp
     */
    public Double getBaseline2Bcwp() {
        return Baseline2Bcwp;
    }

    /**
     * 
     * @param Baseline2Bcwp
     *     The Baseline2Bcwp
     */
    public void setBaseline2Bcwp(Double Baseline2Bcwp) {
        this.Baseline2Bcwp = Baseline2Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline3Start
     */
    public String getBaseline3Start() {
        return Baseline3Start;
    }

    /**
     * 
     * @param Baseline3Start
     *     The Baseline3Start
     */
    public void setBaseline3Start(String Baseline3Start) {
        this.Baseline3Start = Baseline3Start;
    }

    /**
     * 
     * @return
     *     The Baseline3Finish
     */
    public String getBaseline3Finish() {
        return Baseline3Finish;
    }

    /**
     * 
     * @param Baseline3Finish
     *     The Baseline3Finish
     */
    public void setBaseline3Finish(String Baseline3Finish) {
        this.Baseline3Finish = Baseline3Finish;
    }

    /**
     * 
     * @return
     *     The Baseline3Work
     */
    public String getBaseline3Work() {
        return Baseline3Work;
    }

    /**
     * 
     * @param Baseline3Work
     *     The Baseline3Work
     */
    public void setBaseline3Work(String Baseline3Work) {
        this.Baseline3Work = Baseline3Work;
    }

    /**
     * 
     * @return
     *     The Baseline3Cost
     */
    public Double getBaseline3Cost() {
        return Baseline3Cost;
    }

    /**
     * 
     * @param Baseline3Cost
     *     The Baseline3Cost
     */
    public void setBaseline3Cost(Double Baseline3Cost) {
        this.Baseline3Cost = Baseline3Cost;
    }

    /**
     * 
     * @return
     *     The Baseline3Bcws
     */
    public Double getBaseline3Bcws() {
        return Baseline3Bcws;
    }

    /**
     * 
     * @param Baseline3Bcws
     *     The Baseline3Bcws
     */
    public void setBaseline3Bcws(Double Baseline3Bcws) {
        this.Baseline3Bcws = Baseline3Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline3Bcwp
     */
    public Double getBaseline3Bcwp() {
        return Baseline3Bcwp;
    }

    /**
     * 
     * @param Baseline3Bcwp
     *     The Baseline3Bcwp
     */
    public void setBaseline3Bcwp(Double Baseline3Bcwp) {
        this.Baseline3Bcwp = Baseline3Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline4Start
     */
    public String getBaseline4Start() {
        return Baseline4Start;
    }

    /**
     * 
     * @param Baseline4Start
     *     The Baseline4Start
     */
    public void setBaseline4Start(String Baseline4Start) {
        this.Baseline4Start = Baseline4Start;
    }

    /**
     * 
     * @return
     *     The Baseline4Finish
     */
    public String getBaseline4Finish() {
        return Baseline4Finish;
    }

    /**
     * 
     * @param Baseline4Finish
     *     The Baseline4Finish
     */
    public void setBaseline4Finish(String Baseline4Finish) {
        this.Baseline4Finish = Baseline4Finish;
    }

    /**
     * 
     * @return
     *     The Baseline4Work
     */
    public String getBaseline4Work() {
        return Baseline4Work;
    }

    /**
     * 
     * @param Baseline4Work
     *     The Baseline4Work
     */
    public void setBaseline4Work(String Baseline4Work) {
        this.Baseline4Work = Baseline4Work;
    }

    /**
     * 
     * @return
     *     The Baseline4Cost
     */
    public Double getBaseline4Cost() {
        return Baseline4Cost;
    }

    /**
     * 
     * @param Baseline4Cost
     *     The Baseline4Cost
     */
    public void setBaseline4Cost(Double Baseline4Cost) {
        this.Baseline4Cost = Baseline4Cost;
    }

    /**
     * 
     * @return
     *     The Baseline4Bcws
     */
    public Double getBaseline4Bcws() {
        return Baseline4Bcws;
    }

    /**
     * 
     * @param Baseline4Bcws
     *     The Baseline4Bcws
     */
    public void setBaseline4Bcws(Double Baseline4Bcws) {
        this.Baseline4Bcws = Baseline4Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline4Bcwp
     */
    public Double getBaseline4Bcwp() {
        return Baseline4Bcwp;
    }

    /**
     * 
     * @param Baseline4Bcwp
     *     The Baseline4Bcwp
     */
    public void setBaseline4Bcwp(Double Baseline4Bcwp) {
        this.Baseline4Bcwp = Baseline4Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline5Start
     */
    public String getBaseline5Start() {
        return Baseline5Start;
    }

    /**
     * 
     * @param Baseline5Start
     *     The Baseline5Start
     */
    public void setBaseline5Start(String Baseline5Start) {
        this.Baseline5Start = Baseline5Start;
    }

    /**
     * 
     * @return
     *     The Baseline5Finish
     */
    public String getBaseline5Finish() {
        return Baseline5Finish;
    }

    /**
     * 
     * @param Baseline5Finish
     *     The Baseline5Finish
     */
    public void setBaseline5Finish(String Baseline5Finish) {
        this.Baseline5Finish = Baseline5Finish;
    }

    /**
     * 
     * @return
     *     The Baseline5Work
     */
    public String getBaseline5Work() {
        return Baseline5Work;
    }

    /**
     * 
     * @param Baseline5Work
     *     The Baseline5Work
     */
    public void setBaseline5Work(String Baseline5Work) {
        this.Baseline5Work = Baseline5Work;
    }

    /**
     * 
     * @return
     *     The Baseline5Cost
     */
    public Double getBaseline5Cost() {
        return Baseline5Cost;
    }

    /**
     * 
     * @param Baseline5Cost
     *     The Baseline5Cost
     */
    public void setBaseline5Cost(Double Baseline5Cost) {
        this.Baseline5Cost = Baseline5Cost;
    }

    /**
     * 
     * @return
     *     The Baseline5Bcws
     */
    public Double getBaseline5Bcws() {
        return Baseline5Bcws;
    }

    /**
     * 
     * @param Baseline5Bcws
     *     The Baseline5Bcws
     */
    public void setBaseline5Bcws(Double Baseline5Bcws) {
        this.Baseline5Bcws = Baseline5Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline5Bcwp
     */
    public Double getBaseline5Bcwp() {
        return Baseline5Bcwp;
    }

    /**
     * 
     * @param Baseline5Bcwp
     *     The Baseline5Bcwp
     */
    public void setBaseline5Bcwp(Double Baseline5Bcwp) {
        this.Baseline5Bcwp = Baseline5Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline6Start
     */
    public String getBaseline6Start() {
        return Baseline6Start;
    }

    /**
     * 
     * @param Baseline6Start
     *     The Baseline6Start
     */
    public void setBaseline6Start(String Baseline6Start) {
        this.Baseline6Start = Baseline6Start;
    }

    /**
     * 
     * @return
     *     The Baseline6Finish
     */
    public String getBaseline6Finish() {
        return Baseline6Finish;
    }

    /**
     * 
     * @param Baseline6Finish
     *     The Baseline6Finish
     */
    public void setBaseline6Finish(String Baseline6Finish) {
        this.Baseline6Finish = Baseline6Finish;
    }

    /**
     * 
     * @return
     *     The Baseline6Work
     */
    public String getBaseline6Work() {
        return Baseline6Work;
    }

    /**
     * 
     * @param Baseline6Work
     *     The Baseline6Work
     */
    public void setBaseline6Work(String Baseline6Work) {
        this.Baseline6Work = Baseline6Work;
    }

    /**
     * 
     * @return
     *     The Baseline6Cost
     */
    public Double getBaseline6Cost() {
        return Baseline6Cost;
    }

    /**
     * 
     * @param Baseline6Cost
     *     The Baseline6Cost
     */
    public void setBaseline6Cost(Double Baseline6Cost) {
        this.Baseline6Cost = Baseline6Cost;
    }

    /**
     * 
     * @return
     *     The Baseline6Bcws
     */
    public Double getBaseline6Bcws() {
        return Baseline6Bcws;
    }

    /**
     * 
     * @param Baseline6Bcws
     *     The Baseline6Bcws
     */
    public void setBaseline6Bcws(Double Baseline6Bcws) {
        this.Baseline6Bcws = Baseline6Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline6Bcwp
     */
    public Double getBaseline6Bcwp() {
        return Baseline6Bcwp;
    }

    /**
     * 
     * @param Baseline6Bcwp
     *     The Baseline6Bcwp
     */
    public void setBaseline6Bcwp(Double Baseline6Bcwp) {
        this.Baseline6Bcwp = Baseline6Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline7Start
     */
    public String getBaseline7Start() {
        return Baseline7Start;
    }

    /**
     * 
     * @param Baseline7Start
     *     The Baseline7Start
     */
    public void setBaseline7Start(String Baseline7Start) {
        this.Baseline7Start = Baseline7Start;
    }

    /**
     * 
     * @return
     *     The Baseline7Finish
     */
    public String getBaseline7Finish() {
        return Baseline7Finish;
    }

    /**
     * 
     * @param Baseline7Finish
     *     The Baseline7Finish
     */
    public void setBaseline7Finish(String Baseline7Finish) {
        this.Baseline7Finish = Baseline7Finish;
    }

    /**
     * 
     * @return
     *     The Baseline7Work
     */
    public String getBaseline7Work() {
        return Baseline7Work;
    }

    /**
     * 
     * @param Baseline7Work
     *     The Baseline7Work
     */
    public void setBaseline7Work(String Baseline7Work) {
        this.Baseline7Work = Baseline7Work;
    }

    /**
     * 
     * @return
     *     The Baseline7Cost
     */
    public Double getBaseline7Cost() {
        return Baseline7Cost;
    }

    /**
     * 
     * @param Baseline7Cost
     *     The Baseline7Cost
     */
    public void setBaseline7Cost(Double Baseline7Cost) {
        this.Baseline7Cost = Baseline7Cost;
    }

    /**
     * 
     * @return
     *     The Baseline7Bcws
     */
    public Double getBaseline7Bcws() {
        return Baseline7Bcws;
    }

    /**
     * 
     * @param Baseline7Bcws
     *     The Baseline7Bcws
     */
    public void setBaseline7Bcws(Double Baseline7Bcws) {
        this.Baseline7Bcws = Baseline7Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline7Bcwp
     */
    public Double getBaseline7Bcwp() {
        return Baseline7Bcwp;
    }

    /**
     * 
     * @param Baseline7Bcwp
     *     The Baseline7Bcwp
     */
    public void setBaseline7Bcwp(Double Baseline7Bcwp) {
        this.Baseline7Bcwp = Baseline7Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline8Start
     */
    public String getBaseline8Start() {
        return Baseline8Start;
    }

    /**
     * 
     * @param Baseline8Start
     *     The Baseline8Start
     */
    public void setBaseline8Start(String Baseline8Start) {
        this.Baseline8Start = Baseline8Start;
    }

    /**
     * 
     * @return
     *     The Baseline8Finish
     */
    public String getBaseline8Finish() {
        return Baseline8Finish;
    }

    /**
     * 
     * @param Baseline8Finish
     *     The Baseline8Finish
     */
    public void setBaseline8Finish(String Baseline8Finish) {
        this.Baseline8Finish = Baseline8Finish;
    }

    /**
     * 
     * @return
     *     The Baseline8Work
     */
    public String getBaseline8Work() {
        return Baseline8Work;
    }

    /**
     * 
     * @param Baseline8Work
     *     The Baseline8Work
     */
    public void setBaseline8Work(String Baseline8Work) {
        this.Baseline8Work = Baseline8Work;
    }

    /**
     * 
     * @return
     *     The Baseline8Cost
     */
    public Double getBaseline8Cost() {
        return Baseline8Cost;
    }

    /**
     * 
     * @param Baseline8Cost
     *     The Baseline8Cost
     */
    public void setBaseline8Cost(Double Baseline8Cost) {
        this.Baseline8Cost = Baseline8Cost;
    }

    /**
     * 
     * @return
     *     The Baseline8Bcws
     */
    public Double getBaseline8Bcws() {
        return Baseline8Bcws;
    }

    /**
     * 
     * @param Baseline8Bcws
     *     The Baseline8Bcws
     */
    public void setBaseline8Bcws(Double Baseline8Bcws) {
        this.Baseline8Bcws = Baseline8Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline8Bcwp
     */
    public Double getBaseline8Bcwp() {
        return Baseline8Bcwp;
    }

    /**
     * 
     * @param Baseline8Bcwp
     *     The Baseline8Bcwp
     */
    public void setBaseline8Bcwp(Double Baseline8Bcwp) {
        this.Baseline8Bcwp = Baseline8Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline9Start
     */
    public String getBaseline9Start() {
        return Baseline9Start;
    }

    /**
     * 
     * @param Baseline9Start
     *     The Baseline9Start
     */
    public void setBaseline9Start(String Baseline9Start) {
        this.Baseline9Start = Baseline9Start;
    }

    /**
     * 
     * @return
     *     The Baseline9Finish
     */
    public String getBaseline9Finish() {
        return Baseline9Finish;
    }

    /**
     * 
     * @param Baseline9Finish
     *     The Baseline9Finish
     */
    public void setBaseline9Finish(String Baseline9Finish) {
        this.Baseline9Finish = Baseline9Finish;
    }

    /**
     * 
     * @return
     *     The Baseline9Work
     */
    public String getBaseline9Work() {
        return Baseline9Work;
    }

    /**
     * 
     * @param Baseline9Work
     *     The Baseline9Work
     */
    public void setBaseline9Work(String Baseline9Work) {
        this.Baseline9Work = Baseline9Work;
    }

    /**
     * 
     * @return
     *     The Baseline9Cost
     */
    public Double getBaseline9Cost() {
        return Baseline9Cost;
    }

    /**
     * 
     * @param Baseline9Cost
     *     The Baseline9Cost
     */
    public void setBaseline9Cost(Double Baseline9Cost) {
        this.Baseline9Cost = Baseline9Cost;
    }

    /**
     * 
     * @return
     *     The Baseline9Bcws
     */
    public Double getBaseline9Bcws() {
        return Baseline9Bcws;
    }

    /**
     * 
     * @param Baseline9Bcws
     *     The Baseline9Bcws
     */
    public void setBaseline9Bcws(Double Baseline9Bcws) {
        this.Baseline9Bcws = Baseline9Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline9Bcwp
     */
    public Double getBaseline9Bcwp() {
        return Baseline9Bcwp;
    }

    /**
     * 
     * @param Baseline9Bcwp
     *     The Baseline9Bcwp
     */
    public void setBaseline9Bcwp(Double Baseline9Bcwp) {
        this.Baseline9Bcwp = Baseline9Bcwp;
    }

    /**
     * 
     * @return
     *     The Baseline10Start
     */
    public String getBaseline10Start() {
        return Baseline10Start;
    }

    /**
     * 
     * @param Baseline10Start
     *     The Baseline10Start
     */
    public void setBaseline10Start(String Baseline10Start) {
        this.Baseline10Start = Baseline10Start;
    }

    /**
     * 
     * @return
     *     The Baseline10Finish
     */
    public String getBaseline10Finish() {
        return Baseline10Finish;
    }

    /**
     * 
     * @param Baseline10Finish
     *     The Baseline10Finish
     */
    public void setBaseline10Finish(String Baseline10Finish) {
        this.Baseline10Finish = Baseline10Finish;
    }

    /**
     * 
     * @return
     *     The Baseline10Work
     */
    public String getBaseline10Work() {
        return Baseline10Work;
    }

    /**
     * 
     * @param Baseline10Work
     *     The Baseline10Work
     */
    public void setBaseline10Work(String Baseline10Work) {
        this.Baseline10Work = Baseline10Work;
    }

    /**
     * 
     * @return
     *     The Baseline10Cost
     */
    public Double getBaseline10Cost() {
        return Baseline10Cost;
    }

    /**
     * 
     * @param Baseline10Cost
     *     The Baseline10Cost
     */
    public void setBaseline10Cost(Double Baseline10Cost) {
        this.Baseline10Cost = Baseline10Cost;
    }

    /**
     * 
     * @return
     *     The Baseline10Bcws
     */
    public Double getBaseline10Bcws() {
        return Baseline10Bcws;
    }

    /**
     * 
     * @param Baseline10Bcws
     *     The Baseline10Bcws
     */
    public void setBaseline10Bcws(Double Baseline10Bcws) {
        this.Baseline10Bcws = Baseline10Bcws;
    }

    /**
     * 
     * @return
     *     The Baseline10Bcwp
     */
    public Double getBaseline10Bcwp() {
        return Baseline10Bcwp;
    }

    /**
     * 
     * @param Baseline10Bcwp
     *     The Baseline10Bcwp
     */
    public void setBaseline10Bcwp(Double Baseline10Bcwp) {
        this.Baseline10Bcwp = Baseline10Bcwp;
    }

    /**
     * 
     * @return
     *     The ExtendedAttributes
     */
    public List<Object> getExtendedAttributes() {
        return ExtendedAttributes;
    }

    /**
     * 
     * @param ExtendedAttributes
     *     The ExtendedAttributes
     */
    public void setExtendedAttributes(List<Object> ExtendedAttributes) {
        this.ExtendedAttributes = ExtendedAttributes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
	
	
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceAssignment {\n");
    sb.append("  TaskUid: ").append(TaskUid).append("\n");
    sb.append("  ResourceUid: ").append(ResourceUid).append("\n");
    sb.append("  Uid: ").append(Uid).append("\n");
    sb.append("  PercentWorkComplete: ").append(PercentWorkComplete).append("\n");
    sb.append("  ActualCost: ").append(ActualCost).append("\n");
    sb.append("  ActualFinish: ").append(ActualFinish).append("\n");
    sb.append("  ActualOvertimeCost: ").append(ActualOvertimeCost).append("\n");
    sb.append("  ActualOvertimeWork: ").append(ActualOvertimeWork).append("\n");
    //sb.append("  ActualOvertimeWorkString: ").append(ActualOvertimeWorkString).append("\n");
    sb.append("  ActualStart: ").append(ActualStart).append("\n");
    sb.append("  ActualWork: ").append(ActualWork).append("\n");
    //sb.append("  ActualWorkString: ").append(ActualWorkString).append("\n");
    sb.append("  Acwp: ").append(Acwp).append("\n");
    sb.append("  Confirmed: ").append(Confirmed).append("\n");
    sb.append("  Cost: ").append(Cost).append("\n");
    sb.append("  CostRateTableType: ").append(CostRateTableType).append("\n");
    sb.append("  CostVariance: ").append(CostVariance).append("\n");
    sb.append("  Cv: ").append(Cv).append("\n");
    sb.append("  Delay: ").append(Delay).append("\n");
    sb.append("  Finish: ").append(Finish).append("\n");
    sb.append("  FinishVariance: ").append(FinishVariance).append("\n");
    sb.append("  Hyperlink: ").append(Hyperlink).append("\n");
    sb.append("  HyperlinkAddress: ").append(HyperlinkAddress).append("\n");
    sb.append("  HyperlinkSubAddress: ").append(HyperlinkSubAddress).append("\n");
    sb.append("  WorkVariance: ").append(WorkVariance).append("\n");
    sb.append("  HasFixedRateUnits: ").append(HasFixedRateUnits).append("\n");
    sb.append("  FixedMaterial: ").append(FixedMaterial).append("\n");
    sb.append("  LevelingDelay: ").append(LevelingDelay).append("\n");
    sb.append("  LevelingDelayFormat: ").append(LevelingDelayFormat).append("\n");
    sb.append("  LinkedFields: ").append(LinkedFields).append("\n");
    sb.append("  Milestone: ").append(Milestone).append("\n");
    sb.append("  Notes: ").append(Notes).append("\n");
    sb.append("  Overallocated: ").append(Overallocated).append("\n");
    sb.append("  OvertimeCost: ").append(OvertimeCost).append("\n");
    sb.append("  OvertimeWork: ").append(OvertimeWork).append("\n");
    //sb.append("  OvertimeWorkString: ").append(OvertimeWorkString).append("\n");
    sb.append("  PeakUnits: ").append(PeakUnits).append("\n");
    sb.append("  RegularWork: ").append(RegularWork).append("\n");
    //sb.append("  RegularWorkString: ").append(RegularWorkString).append("\n");
    sb.append("  RemainingCost: ").append(RemainingCost).append("\n");
    sb.append("  RemainingOvertimeCost: ").append(RemainingOvertimeCost).append("\n");
    sb.append("  RemainingOvertimeWork: ").append(RemainingOvertimeWork).append("\n");
    //sb.append("  RemainingOvertimeWorkString: ").append(RemainingOvertimeWorkString).append("\n");
    sb.append("  RemainingWork: ").append(RemainingWork).append("\n");
    //sb.append("  RemainingWorkString: ").append(RemainingWorkString).append("\n");
    sb.append("  ResponsePending: ").append(ResponsePending).append("\n");
    sb.append("  Start: ").append(Start).append("\n");
    sb.append("  Stop: ").append(Stop).append("\n");
    sb.append("  Resume: ").append(Resume).append("\n");
    sb.append("  StartVariance: ").append(StartVariance).append("\n");
    sb.append("  Summary: ").append(Summary).append("\n");
    sb.append("  Sv: ").append(Sv).append("\n");
    sb.append("  Units: ").append(Units).append("\n");
    sb.append("  UpdateNeeded: ").append(UpdateNeeded).append("\n");
    sb.append("  Vac: ").append(Vac).append("\n");
    sb.append("  Work: ").append(Work).append("\n");
    //sb.append("  WorkString: ").append(WorkString).append("\n");
    sb.append("  WorkContour: ").append(WorkContour).append("\n");
    sb.append("  Bcws: ").append(Bcws).append("\n");
    sb.append("  Bcwp: ").append(Bcwp).append("\n");
    sb.append("  BookingType: ").append(BookingType).append("\n");
    sb.append("  ActualWorkProtected: ").append(ActualWorkProtected).append("\n");
    //sb.append("  ActualWorkProtectedString: ").append(ActualWorkProtectedString).append("\n");
    sb.append("  ActualOvertimeWorkProtected: ").append(ActualOvertimeWorkProtected).append("\n");
    //sb.append("  ActualOvertimeWorkProtectedString: ").append(ActualOvertimeWorkProtectedString).append("\n");
    sb.append("  CreationDate: ").append(CreationDate).append("\n");
    sb.append("  AssnOwner: ").append(AssnOwner).append("\n");
    sb.append("  AssnOwnerGuid: ").append(AssnOwnerGuid).append("\n");
    sb.append("  BudgetCost: ").append(BudgetCost).append("\n");
    sb.append("  BudgetWork: ").append(BudgetWork).append("\n");
    //sb.append("  BudgetWorkString: ").append(BudgetWorkString).append("\n");
    sb.append("  RateScale: ").append(RateScale).append("\n");
    sb.append("  BaselineStart: ").append(BaselineStart).append("\n");
    sb.append("  BaselineFinish: ").append(BaselineFinish).append("\n");
    sb.append("  BaselineWork: ").append(BaselineWork).append("\n");
    //sb.append("  BaselineWorkString: ").append(BaselineWorkString).append("\n");
    sb.append("  BaselineCost: ").append(BaselineCost).append("\n");
    sb.append("  BaselineBcws: ").append(BaselineBcws).append("\n");
    sb.append("  BaselineBcwp: ").append(BaselineBcwp).append("\n");
    sb.append("  Baseline1Start: ").append(Baseline1Start).append("\n");
    sb.append("  Baseline1Finish: ").append(Baseline1Finish).append("\n");
    sb.append("  Baseline1Work: ").append(Baseline1Work).append("\n");
    //sb.append("  Baseline1WorkString: ").append(Baseline1WorkString).append("\n");
    sb.append("  Baseline1Cost: ").append(Baseline1Cost).append("\n");
    sb.append("  Baseline1Bcws: ").append(Baseline1Bcws).append("\n");
    sb.append("  Baseline1Bcwp: ").append(Baseline1Bcwp).append("\n");
    sb.append("  Baseline2Start: ").append(Baseline2Start).append("\n");
    sb.append("  Baseline2Finish: ").append(Baseline2Finish).append("\n");
    sb.append("  Baseline2Work: ").append(Baseline2Work).append("\n");
    //sb.append("  Baseline2WorkString: ").append(Baseline2WorkString).append("\n");
    sb.append("  Baseline2Cost: ").append(Baseline2Cost).append("\n");
    sb.append("  Baseline2Bcws: ").append(Baseline2Bcws).append("\n");
    sb.append("  Baseline2Bcwp: ").append(Baseline2Bcwp).append("\n");
    sb.append("  Baseline3Start: ").append(Baseline3Start).append("\n");
    sb.append("  Baseline3Finish: ").append(Baseline3Finish).append("\n");
    sb.append("  Baseline3Work: ").append(Baseline3Work).append("\n");
    //sb.append("  Baseline3WorkString: ").append(Baseline3WorkString).append("\n");
    sb.append("  Baseline3Cost: ").append(Baseline3Cost).append("\n");
    sb.append("  Baseline3Bcws: ").append(Baseline3Bcws).append("\n");
    sb.append("  Baseline3Bcwp: ").append(Baseline3Bcwp).append("\n");
    sb.append("  Baseline4Start: ").append(Baseline4Start).append("\n");
    sb.append("  Baseline4Finish: ").append(Baseline4Finish).append("\n");
    sb.append("  Baseline4Work: ").append(Baseline4Work).append("\n");
    //sb.append("  Baseline4WorkString: ").append(Baseline4WorkString).append("\n");
    sb.append("  Baseline4Cost: ").append(Baseline4Cost).append("\n");
    sb.append("  Baseline4Bcws: ").append(Baseline4Bcws).append("\n");
    sb.append("  Baseline4Bcwp: ").append(Baseline4Bcwp).append("\n");
    sb.append("  Baseline5Start: ").append(Baseline5Start).append("\n");
    sb.append("  Baseline5Finish: ").append(Baseline5Finish).append("\n");
    sb.append("  Baseline5Work: ").append(Baseline5Work).append("\n");
    //sb.append("  Baseline5WorkString: ").append(Baseline5WorkString).append("\n");
    sb.append("  Baseline5Cost: ").append(Baseline5Cost).append("\n");
    sb.append("  Baseline5Bcws: ").append(Baseline5Bcws).append("\n");
    sb.append("  Baseline5Bcwp: ").append(Baseline5Bcwp).append("\n");
    sb.append("  Baseline6Start: ").append(Baseline6Start).append("\n");
    sb.append("  Baseline6Finish: ").append(Baseline6Finish).append("\n");
    sb.append("  Baseline6Work: ").append(Baseline6Work).append("\n");
    //sb.append("  Baseline6WorkString: ").append(Baseline6WorkString).append("\n");
    sb.append("  Baseline6Cost: ").append(Baseline6Cost).append("\n");
    sb.append("  Baseline6Bcws: ").append(Baseline6Bcws).append("\n");
    sb.append("  Baseline6Bcwp: ").append(Baseline6Bcwp).append("\n");
    sb.append("  Baseline7Start: ").append(Baseline7Start).append("\n");
    sb.append("  Baseline7Finish: ").append(Baseline7Finish).append("\n");
    sb.append("  Baseline7Work: ").append(Baseline7Work).append("\n");
    //sb.append("  Baseline7WorkString: ").append(Baseline7WorkString).append("\n");
    sb.append("  Baseline7Cost: ").append(Baseline7Cost).append("\n");
    sb.append("  Baseline7Bcws: ").append(Baseline7Bcws).append("\n");
    sb.append("  Baseline7Bcwp: ").append(Baseline7Bcwp).append("\n");
    sb.append("  Baseline8Start: ").append(Baseline8Start).append("\n");
    sb.append("  Baseline8Finish: ").append(Baseline8Finish).append("\n");
    sb.append("  Baseline8Work: ").append(Baseline8Work).append("\n");
    //sb.append("  Baseline8WorkString: ").append(Baseline8WorkString).append("\n");
    sb.append("  Baseline8Cost: ").append(Baseline8Cost).append("\n");
    sb.append("  Baseline8Bcws: ").append(Baseline8Bcws).append("\n");
    sb.append("  Baseline8Bcwp: ").append(Baseline8Bcwp).append("\n");
    sb.append("  Baseline9Start: ").append(Baseline9Start).append("\n");
    sb.append("  Baseline9Finish: ").append(Baseline9Finish).append("\n");
    sb.append("  Baseline9Work: ").append(Baseline9Work).append("\n");
    //sb.append("  Baseline9WorkString: ").append(Baseline9WorkString).append("\n");
    sb.append("  Baseline9Cost: ").append(Baseline9Cost).append("\n");
    sb.append("  Baseline9Bcws: ").append(Baseline9Bcws).append("\n");
    sb.append("  Baseline9Bcwp: ").append(Baseline9Bcwp).append("\n");
    sb.append("  Baseline10Start: ").append(Baseline10Start).append("\n");
    sb.append("  Baseline10Finish: ").append(Baseline10Finish).append("\n");
    sb.append("  Baseline10Work: ").append(Baseline10Work).append("\n");
    //sb.append("  Baseline10WorkString: ").append(Baseline10WorkString).append("\n");
    sb.append("  Baseline10Cost: ").append(Baseline10Cost).append("\n");
    sb.append("  Baseline10Bcws: ").append(Baseline10Bcws).append("\n");
    sb.append("  Baseline10Bcwp: ").append(Baseline10Bcwp).append("\n");
    sb.append("  ExtendedAttributes: ").append(ExtendedAttributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

