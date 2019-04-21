package com.Fay.Audio;

public class GermanAudio extends Audio {
    private String language = "German";

    @Override
    public String getLang() {
        return "German audio file";
    }

    @Override
    public String getLanguage() {
        return language;
    }
}