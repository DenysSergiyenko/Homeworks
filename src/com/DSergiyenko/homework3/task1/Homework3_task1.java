package com.DSergiyenko.homework3.task1;

public class Homework3_task1 {

    public static void main(String[] args) {
        System.out.println("Homework3 task1:");

        Directory Folder1 = new Directory("DirecotryWithFiles");

        System.out.println(Folder1.getNumberOfFilesInDirectory(Folder1.directoryName));

        Folder1.setNumberOfFilesInDirectory(Folder1.directoryName, 1);

        System.out.println(Folder1.getNumberOfFilesInDirectory(Folder1.directoryName));

        TextFile tf1 = new TextFile("abc." , "doc");
        AudioFile af1 = new AudioFile("For whom the bell tolls");
        VideoFile vf1 = new VideoFile("Monsters Inc");

        //DIR1.directoryFiles[1]=tf1;
        //DIR1.directoryFiles[1]= new TextFile("abc." , "doc");
        //DIR1.directoryFiles[2] = new AudioFile("For whom the bell tolls");
        //DIR1.directoryFiles[3] = new VideoFile("Monsters Inc");

        Folder1.dir();
    }
}


