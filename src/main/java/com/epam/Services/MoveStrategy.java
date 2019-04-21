package com.epam.Services;

import com.epam.Characters.mlpChar;

public interface MoveStrategy {
    int move(int distance, mlpChar c);
    int getPosition();
}
