package com.Fay.Factories;

import com.Fay.Audio.Audio;
import com.Fay.Subs.Sub;

public abstract class MovieFactory {
    public abstract Audio getAudio();

    public abstract Sub getSub();
}
