package com.Fay.Factories;

import com.Fay.Audio.Audio;
import com.Fay.Audio.EnglishAudio;
import com.Fay.Subs.Sub;

public class EnglishMovieFactory extends MovieFactory {
    @Override
    public Audio getAudio() {
        return new EnglishAudio();
    }

    @Override
    public Sub getSub() {
        return SubFactory.getSub(getAudio());
    }
}

