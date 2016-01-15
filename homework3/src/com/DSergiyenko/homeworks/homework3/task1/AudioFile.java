package com.DSergiyenko.homeworks.homework3.task1;

public class AudioFile extends File {
    private String audioFileName = "audio1.";
    private static final String defaultAudioFileExtension = "mp3";
    private String audioFileExtension = defaultAudioFileExtension;

    public AudioFile (String audioFileName){ //consturctor using superClass File and including file name & extension
        super(audioFileName, defaultAudioFileExtension);
    }

    public String getAudioFileName(){
        return this.audioFileName;
    }

    public void setAudioFileName(String newAudioFileName){
        this.audioFileName = newAudioFileName;
    }

}
