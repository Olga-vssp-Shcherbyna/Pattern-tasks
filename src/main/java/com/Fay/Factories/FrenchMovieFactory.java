package com.Fay.Factories;

import com.Fay.Audio.Audio;
import com.Fay.Audio.FrenchAudio;
import com.Fay.Subs.Sub;

public class FrenchMovieFactory extends MovieFactory {
    @Override
    public Audio getAudio() {
        return new FrenchAudio();
    }

    @Override
    public Sub getSub() {
        return SubFactory.getSub(getAudio());
    }
}
