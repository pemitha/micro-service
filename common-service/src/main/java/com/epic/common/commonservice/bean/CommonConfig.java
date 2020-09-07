package com.epic.common.commonservice.bean;

/**
 * This class contains
 *
 * @author : Shashika Kalatuwawa
 */
public class CommonConfig {
    
    private int minimum;
    private int maximum;
    
    public CommonConfig() {
    }
    
    public CommonConfig(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    
    
    public int getMinimum() {
        return minimum;
    }
    
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
    
    public int getMaximum() {
        return maximum;
    }
    
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
