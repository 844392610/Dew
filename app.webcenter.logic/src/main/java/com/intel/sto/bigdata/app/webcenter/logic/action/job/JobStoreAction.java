package com.intel.sto.bigdata.app.webcenter.logic.action.job;

import com.intel.sto.bigdata.app.webcenter.logic.db.DBOperator;
import com.opensymphony.xwork2.ActionSupport;

public class JobStoreAction extends ActionSupport{
  public String name;
  public String defination;
  public String cycle;
  public String userId;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDefination() {
    return defination;
  }
  public void setDefination(String defination) {
    this.defination = defination;
  }
  public String getCycle() {
    return cycle;
  }
  public void setCycle(String cycle) {
    this.cycle = cycle;
  }
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  public String execute() throws Exception {
    DBOperator operator = new DBOperator();
    operator.addNewJob(name, defination, cycle, userId);
    return SUCCESS;
  }
}