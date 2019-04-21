package com.Fay.Factories;

import com.Fay.Audio.Audio;
import com.Fay.Audio.MermaidAudio;
import com.Fay.Subs.Sub;

public class MermaidMovieFactory extends MovieFactory {
    @Override
    public Audio getAudio() {
        return new MermaidAudio();
    }

    @Override
    public Sub getSub() {
        return SubFactory.getSub(getAudio());
    }
}
