package com.intel.sto.bigdata.dew.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ServiceDes implements Serializable {

  private static final long serialVersionUID = 3892709135300906780L;
  private String serviceName;
  private String serviceClass;
  private String serviceType;
  // more KV style description
  private Map<String, String> context = new HashMap<String, String>();

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServiceClass() {
    return serviceClass;
  }

  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public String serialize() {
    return this.serviceName + "," + this.serviceType + "," + this.serviceClass;
  }

  public Map<String, String> getContext() {
    return context;
  }

  public void setContext(Map<String, String> context) {
    this.context = context;
  }

  public void deSerialize(String desString) {
    String[] split = desString.split(",");
    this.setServiceName(split[0]);
    this.setServiceType(split[1]);
    this.setServiceClass(split[2]);
  }
}
