package com.Fay.Audio;

public class EnglishAudio extends Audio {
    private String language = "English";

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getLang() {
        return "English audio file";
    }
}
