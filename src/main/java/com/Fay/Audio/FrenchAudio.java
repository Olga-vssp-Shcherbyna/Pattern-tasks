package com.Fay.Audio;

public class FrenchAudio extends Audio {
    private String language = "French";

    @Override
    public String getLang() {
        return "French audio file";
    }

    @Override
    public String getLanguage() {
        return language;
    }
}