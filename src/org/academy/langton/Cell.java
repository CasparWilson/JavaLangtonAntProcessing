package org.academy.langton;

public class Cell {
    private int colour;
    private final GridPosition gridPosition;

    public Cell(int x, int y){
        gridPosition = new GridPosition(x, y);
        colour = 255;
    }

//    public boolean toggleActive(){
//        isActive = !isActive;
//        return isActive;
//    }

    public int getColour(){
        return this.colour;
    }

    public void updateColour(){
        if (this.colour == 255){
            this.colour = 0;
        }
        else if (this.colour == 0){
            this.colour = 122;
        }
        else {
           this.colour = 255;
        }
    }

//    public void setActive(boolean value){
//        isActive = value;
//    }
//
//    public boolean isActive() {
//        return isActive;
//    }

    public GridPosition gridPosition(){
        return gridPosition;
    }
}
