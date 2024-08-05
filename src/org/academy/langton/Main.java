package org.academy.langton;

import processing.core.PApplet;

import java.util.Random;

//TODO: remove this javascript implementation link
//https://openprocessing.org/sketch/2248058
public class Main extends PApplet {
    private Ant[] ants;
    private Ground ground;
    private final int pixelWidth = 800;
    private final int pixelHeight = 800;

    public static void main(String[] args) {
        PApplet.main(new String[]{"org.academy.langton.Main"});
    }

    @Override
    public void settings() {
        size(pixelWidth, pixelHeight);
    }

    @Override
    public void setup() {
        int cellSize = 20;
        int numColumns = pixelWidth / cellSize;
        int numRows = pixelHeight / cellSize;
        ground = new Ground(this, numColumns, numRows, cellSize);

        Random random = new Random();

        ants = new Ant[10];
        for (int i = 0; i < ants.length; i++) {
            GridPosition startPos = new GridPosition(random.nextInt(numColumns), random.nextInt(numRows));
            ants[i] = new Ant(this, ground, startPos);
        }

        //You can speed things up or down, here:
        frameRate(10);
    }

    @Override
    public void draw() {
        background(200);
        ground.draw();
        for(Ant ant : ants) {
            ant.display();
            ant.update();
        }
    }
}