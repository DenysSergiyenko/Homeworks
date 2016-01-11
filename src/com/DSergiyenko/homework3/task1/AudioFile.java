package com.DSergiyenko.homework3.task1;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class AudioFile extends File {
    private String audioFileName = "audio1.";
    private static final String defaultAudioFileExtensio = "mp3";
    private String audioFileExtension = defaultAudioFileExtensio;

    public AudioFile (String audioFileName){ //consturctor using superClass File and including file name & extension
        super(audioFileName, defaultAudioFileExtensio);
    }

    public String getAudioFileName(){
        return this.audioFileName;
    }

    public void setAudioFileName(String newAudioFileName){
        this.audioFileName = newAudioFileName;
    }

}
