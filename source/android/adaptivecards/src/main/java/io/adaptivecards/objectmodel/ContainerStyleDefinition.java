/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ContainerStyleDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ContainerStyleDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContainerStyleDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ContainerStyleDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBackgroundColor(String value) {
    AdaptiveCardObjectModelJNI.ContainerStyleDefinition_backgroundColor_set(swigCPtr, this, value);
  }

  public String getBackgroundColor() {
    return AdaptiveCardObjectModelJNI.ContainerStyleDefinition_backgroundColor_get(swigCPtr, this);
  }

  public void setBorderColor(String value) {
    AdaptiveCardObjectModelJNI.ContainerStyleDefinition_borderColor_set(swigCPtr, this, value);
  }

  public String getBorderColor() {
    return AdaptiveCardObjectModelJNI.ContainerStyleDefinition_borderColor_get(swigCPtr, this);
  }

  public void setBorderThickness(long value) {
    AdaptiveCardObjectModelJNI.ContainerStyleDefinition_borderThickness_set(swigCPtr, this, value);
  }

  public long getBorderThickness() {
    return AdaptiveCardObjectModelJNI.ContainerStyleDefinition_borderThickness_get(swigCPtr, this);
  }

  public void setForegroundColors(ColorsConfig value) {
    AdaptiveCardObjectModelJNI.ContainerStyleDefinition_foregroundColors_set(swigCPtr, this, ColorsConfig.getCPtr(value), value);
  }

  public ColorsConfig getForegroundColors() {
    long cPtr = AdaptiveCardObjectModelJNI.ContainerStyleDefinition_foregroundColors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ColorsConfig(cPtr, false);
  }

  public static ContainerStyleDefinition Deserialize(JsonValue json, ContainerStyleDefinition defaultValue) {
    return new ContainerStyleDefinition(AdaptiveCardObjectModelJNI.ContainerStyleDefinition_Deserialize(JsonValue.getCPtr(json), json, ContainerStyleDefinition.getCPtr(defaultValue), defaultValue), true);
  }

  public ContainerStyleDefinition() {
    this(AdaptiveCardObjectModelJNI.new_ContainerStyleDefinition(), true);
  }

}
