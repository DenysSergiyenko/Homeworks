package com.DSergiyenko.homeworks.homework3.task1;

public abstract class File {
    String fileName = "file1.";
    String fileAddress = "c:/";
    int fileSize;
    private String fileAuthor = "unanimous";
    String fileExtension = "";


    public File (String name) {

        this.fileName = name;
    }

    public File (String name, String extension) {
        this.fileName = name;
        this.fileExtension = extension;
    }

    public File (String name, String address, String extension) {
        this.fileName = name;
        this.fileAddress = address;
        this.fileExtension = extension;
    }


    public String getFileName(){
        return this.fileName;
    }
    public void setName (String fileName){
        this.fileName = fileName;
    }

    public void setFileAuthor(String name){
        this.fileName = name;
    }
}
