package com.DSergiyenko.homework3.task1;


public class TextFile extends File {
    private String name;
    //private String fileAddress;
    //private int fileSize;
    String fileExtension = "txt";
    boolean fileIsOpenIndicator = false;
    private String fileContent = "";

    //private Date creationDate;

    public TextFile (String fileName){
        super(fileName, ".txt");
        //this.name = fileName;
    }

    public TextFile (String fileName, String textFileExtension){
        super(fileName, ".txt");
        fileExtension=textFileExtension;
        //this.name = fileName;
    }

    public String getName(){
        return name;
    }

    public void copyFile (String fileName, String whereToCopy){
        System.out.println("file " + fileAddress + "/" + name + " is copied to " + whereToCopy);
    }

    public boolean fileIsOpen(){
        return false;
    }

    public void openFile (){
        System.out.println("File " + name + "is open now");
    }

    /**
     * Created by DsergiyenkoN on 11.01.2016.
     */
    public static enum TextFileExtensionTypes {

    }
}
