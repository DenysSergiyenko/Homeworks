package com.DSergiyenko.homeworks.homework3.task1;

/**
 * Created by DsergiyenkoN on 15.01.2016.
 */
public class IllegalDirectoryNameFormat extends Exception {
    private String directoryName;

    public IllegalDirectoryNameFormat(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getDirectoryName() {
        return directoryName;
    }


}
