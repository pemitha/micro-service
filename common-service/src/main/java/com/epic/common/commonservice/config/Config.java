package com.epic.common.commonservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class contains
 *
 * @author : Shashika Kalatuwawa
 */
@Component
@ConfigurationProperties("common-service")
public class Config {
    
    private int minimum;
    private int maximum;
    
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
