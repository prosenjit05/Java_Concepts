package com.prop.PropertiesYamlDemo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyAppDetails {

    @Value("my demo name")
    private String myAppName;
    @Value("my demo version")
    private String myAppVersion;

    public String getMyAppName() { return myAppName; }
    public void setMyAppName(String myAppName) { this.myAppName = myAppName; }

    public String getMyAppVersion() { return myAppVersion; }
    public void setMyAppVersion(String myAppVersion) { this.myAppVersion = myAppVersion; }

}
