package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String rice;
    private String meat;

    public FoodConfig() {
    }

    public FoodConfig(String rice, String meat) {
        this.rice = rice;
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
