package com.aspose.tasks.model;

import com.aspose.tasks.model.TaskLinkType;
import com.aspose.tasks.model.Link;
import com.aspose.tasks.model.TimeUnitType;
public class TaskLink {
  private Link Link = null;
  private Integer Index = null;
  private Integer PredecessorUid = null;
  private Integer SuccessorUid = null;
  private String LinkType = null;
  private Integer Lag = null;
  private String LagFormat = null;
  /**
	 * getLink
	 * Gets Link
	 * @return Link
	 */
  public Link getLink() {
    return Link;
  }

	/**
	 * setLink
	 * Sets Link
	 * @param Link Link
	 */
  public void setLink(Link Link) {
    this.Link = Link;
  }

  /**
	 * getIndex
	 * Gets Integer
	 * @return Index
	 */
  public Integer getIndex() {
    return Index;
  }

	/**
	 * setIndex
	 * Sets Integer
	 * @param Index Integer
	 */
  public void setIndex(Integer Index) {
    this.Index = Index;
  }

  /**
	 * getPredecessorUid
	 * Gets Integer
	 * @return PredecessorUid
	 */
  public Integer getPredecessorUid() {
    return PredecessorUid;
  }

	/**
	 * setPredecessorUid
	 * Sets Integer
	 * @param PredecessorUid Integer
	 */
  public void setPredecessorUid(Integer PredecessorUid) {
    this.PredecessorUid = PredecessorUid;
  }

  /**
	 * getSuccessorUid
	 * Gets Integer
	 * @return SuccessorUid
	 */
  public Integer getSuccessorUid() {
    return SuccessorUid;
  }

	/**
	 * setSuccessorUid
	 * Sets Integer
	 * @param SuccessorUid Integer
	 */
  public void setSuccessorUid(Integer SuccessorUid) {
    this.SuccessorUid = SuccessorUid;
  }

  /**
	 * getLinkType
	 * Gets TaskLinkType
	 * @return LinkType
	 */
  public String getLinkType() {
    return LinkType;
  }

	/**
	 * setLinkType
	 * Sets TaskLinkType
	 * @param LinkType TaskLinkType
	 */
  public void setLinkType(String LinkType) {
    this.LinkType = LinkType;
  }

  /**
	 * getLag
	 * Gets Integer
	 * @return Lag
	 */
  public Integer getLag() {
    return Lag;
  }

	/**
	 * setLag
	 * Sets Integer
	 * @param Lag Integer
	 */
  public void setLag(Integer Lag) {
    this.Lag = Lag;
  }

  /**
	 * getLagFormat
	 * Gets TimeUnitType
	 * @return LagFormat
	 */
  public String getLagFormat() {
    return LagFormat;
  }

	/**
	 * setLagFormat
	 * Sets TimeUnitType
	 * @param LagFormat TimeUnitType
	 */
  public void setLagFormat(String LagFormat) {
    this.LagFormat = LagFormat;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLink {\n");
    sb.append("  Link: ").append(Link).append("\n");
    sb.append("  Index: ").append(Index).append("\n");
    sb.append("  PredecessorUid: ").append(PredecessorUid).append("\n");
    sb.append("  SuccessorUid: ").append(SuccessorUid).append("\n");
    sb.append("  LinkType: ").append(LinkType).append("\n");
    sb.append("  Lag: ").append(Lag).append("\n");
    sb.append("  LagFormat: ").append(LagFormat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

