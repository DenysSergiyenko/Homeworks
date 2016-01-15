package com.DSergiyenko.homeworks.homework3.task1;


public class Homework3_task1 {

    public static void main(String[] args)  {
        System.out.println("Homework3 task1:");

        Directory Folder1 = new Directory("DirecotryWithFiles");
        TextFile tf1 = new TextFile("abc." , "doc");
        AudioFile af1 = new AudioFile("For whom the bell tolls");
        VideoFile vf1 = new VideoFile("Monsters Inc");

        try {
            Folder1.MD();
            System.out.println("new floder created with the name '" + Folder1.directoryName + "'");
        } catch (IllegalDirectoryNameFormat illegalDirectoryNameFormat) {
            illegalDirectoryNameFormat.printStackTrace();
        }

        //System.out.println("number of files in directory= " + Folder1.getNumberOfFilesInDirectory(Folder1.directoryName));
        //Folder1.setNumberOfFilesInDirectory(Folder1.directoryName, Folder1.getNumberOfFilesInDirectory("DirectoryWithFiles") + 1);
        //System.out.println(Folder1.getNumberOfFilesInDirectory(Folder1.directoryName));


        //DIR1.directoryFiles[1]=tf1;
        //DIR1.directoryFiles[1]= new TextFile("abc." , "doc");
        //DIR1.directoryFiles[2] = new AudioFile("For whom the bell tolls");
        //DIR1.directoryFiles[3] = new VideoFile("Monsters Inc");
        //Folder1.dir();





    }
}


