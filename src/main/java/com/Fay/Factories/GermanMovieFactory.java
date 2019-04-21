package com.Fay.Factories;

import com.Fay.Audio.Audio;
import com.Fay.Audio.GermanAudio;
import com.Fay.Subs.Sub;

public class GermanMovieFactory extends MovieFactory {
    @Override
    public Audio getAudio() {
        return new GermanAudio();
    }

    @Override
    public Sub getSub() {
        return SubFactory.getSub(getAudio());
    }
}
