package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

public class Window extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void draw() {
        rect(100, 250, 120, 10);
        rect(275, 250, 120, 10);
        rect(300, 350, 10, 120);
        rect(200, 350, 10, 120);
        circle(250, 300, 180);
        circle(250, 160, 100);
        circle(250, 250, 10);
        circle(250, 300, 10);
        circle(250, 350, 10);
        circle(230, 150, 15);
        circle(270, 150, 15);
        triangle(200, 170, 250, 165, 250, 175);
        triangle(220, 120, 250, 80, 280, 120);
        line(220, 190, 280, 190);
    }

    public void mousePressed() {
        background(64);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"window"};
        Window window = new Window();
        PApplet.runSketch(processingArgs, window);
    }
}