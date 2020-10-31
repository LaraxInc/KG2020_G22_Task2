package ru.vsu.cs.kozjutenko;

import java.awt.*;

public interface LineDrower {
    void drawLine(int x1, int y1, int x2, int y2, Color color);
    void drawLine(int x1,int y1, int x2, int y2);
}