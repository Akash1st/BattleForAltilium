package com.myapp;

import com.myapp.paint.Paint;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Paint paint = new Paint();
        JFrame frame = new JFrame("Battle For Altilium");
        frame.setSize(1100, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(paint);
        frame.setVisible(true);
    }
}
