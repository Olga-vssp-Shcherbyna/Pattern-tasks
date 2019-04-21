package com.Fay.Factories;

import com.Fay.Audio.Audio;
import com.Fay.Subs.*;

public class SubFactory {
    public static Sub getSub(Audio audio) {
        String lang = audio.getLanguage();
        System.out.println(audio.getLang());
        if (lang.equalsIgnoreCase("english"))
            return new EnglishSub();
        else if (lang.equalsIgnoreCase("french"))
            return new FrenchSub();
        else if (lang.equalsIgnoreCase("german"))
            return new GermanSub();
        else if (lang.equalsIgnoreCase("mermaid"))
            return new MermaidSub();
        else return null;
    }
}
