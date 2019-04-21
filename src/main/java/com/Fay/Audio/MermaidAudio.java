package com.Fay.Audio;

public class MermaidAudio extends Audio {
    private String language = "Mermaid";

    @Override
    public String getLang() {
        return "Mermaid audio file";
    }

    @Override
    public String getLanguage() {
        return language;
    }
}