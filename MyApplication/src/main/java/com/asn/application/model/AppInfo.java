package com.asn.application.model;

/**
 * @Author: wangsen
 * @Date: 2020/11/21 11:10
 * @Description:
 **/
public class AppInfo {
    String mainClass;
    String jarPath;
    String note;//应用说明

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }
}
