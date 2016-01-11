package com.DSergiyenko.homework3.task1;

public class VideoFile extends File {
    private String videoFileName = "1.";
    private static final String defaultVideoFileExtension = "mpg";
    private String videoFileExtension = defaultVideoFileExtension;

    public VideoFile (String newVideoFileName) {
        super(newVideoFileName, defaultVideoFileExtension);
    }

    public VideoFile (String newVideoFileName, String newVideoFileExtensio) {
        super(newVideoFileName, newVideoFileExtensio);

    }

}
