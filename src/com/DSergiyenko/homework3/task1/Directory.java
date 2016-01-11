package com.DSergiyenko.homework3.task1;

public class Directory {
    private String defaultDirectoryName = "DIRECOTRY1";
    public File[] directoryFiles;
    public String directoryLocation = "c:/";
    public String directoryName;
    private int numberOfFilesInDirectory=0;

    public Directory(String directoryName){
        this.directoryName=directoryName;
    }

    public int getNumberOfFilesInDirectory (String dirName){
        return numberOfFilesInDirectory;
    }

    public void setNumberOfFilesInDirectory(String dirName, int howManyFilesToAdd){
        numberOfFilesInDirectory += howManyFilesToAdd;
    }

    public void dir(){
        if (numberOfFilesInDirectory==0)
            System.out.println("There are no files in Bouquet " + directoryName);
        else
            System.out.println("Bouquet " + directoryName + " contains the following files:");
        //for (File f : this.directoryFiles) {
        //for (File f : directoryFiles) {             System.out.println(f.fileName);        }//    for (String s | )
    }

}
