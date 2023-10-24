package Structural.facade.demo;

import Structural.facade.facade.VideoConvertionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConvertionFacade converter = new VideoConvertionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
