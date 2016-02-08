package com.DSergiyenko.homeworks.homework3.task1;

import java.util.Scanner;

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
            System.out.println("There are no files in Directory " + directoryName);
        else
            System.out.println("Directory " + directoryName + " contains the following files:");
        //for (File f : this.directoryFiles) {
        //for (File f : directoryFiles) {             System.out.println(f.fileName);        }//    for (String s | )
    }

    void MD () throws IllegalDirectoryNameFormat {
        String dirName="";
        do {
            System.out.println("Please enter direcotry name. It should be between 1 and 8 characters long :");
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            //System.out.println(s.length());
            if ((s.length()==0)|(s.length()>8)) {
                System.out.println("Error. You've entered directory name which is " + s.length() + " symbols long!");
                System.out.println("Try again!");
                }
            else {
                this.directoryName=s;
                break;
            }

        } while (dirName=="");  //для сравнения обьектов нужно использовать метод equals
    }
}
