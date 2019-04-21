package com.Fay;

import com.Fay.Audio.Audio;
import com.Fay.Factories.*;
import com.Fay.Subs.Sub;

public class MovieShop {
    public static Movie getMovie(String lang) {
        MovieFactory movieFactory;
        if (lang.equalsIgnoreCase("french"))
            movieFactory = new FrenchMovieFactory();
        else if (lang.equalsIgnoreCase("german"))
            movieFactory = new GermanMovieFactory();
        else if (lang.equalsIgnoreCase("english"))
            movieFactory = new EnglishMovieFactory();
        else if (lang.equalsIgnoreCase("mermaid"))
            movieFactory = new MermaidMovieFactory();
        else {
            System.out.println("Invalid input");
            return null;
        }
        Audio audio = movieFactory.getAudio();
        Sub sub = movieFactory.getSub();
        return new Movie(audio, sub);
    }
}
