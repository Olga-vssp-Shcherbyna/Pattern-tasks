package com.Fay;

import com.Fay.Audio.Audio;
import com.Fay.Subs.Sub;

public class Movie {
    private Audio audio;
    private Sub sub;

    public Movie(Audio audio, Sub sub) {
        this.audio = audio;
        this.sub = sub;
    }
}
