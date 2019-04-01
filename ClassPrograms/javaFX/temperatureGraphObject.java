package javaFX;

import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class temperatureGraphObject
{
    private int sX;
    private int sY;
    private double scale;
    private int temperature;
    private String month;
    public temperatureGraphObject()
    {
        scale = 1;
    }
    public temperatureGraphObject(int sX, int sY, double scale, int temp, String mon)
    {
        setCoordinates(sX, sY);
        setScale(scale);
        temperature = temp;
        month = mon;
    }
    public temperatureGraphObject setCoordinates(int sX, int sY)
    {
        this.sX = sX;
        this.sY = sY;
        return this;
    }
    public temperatureGraphObject setScale(double scale)
    {
        this.scale = (scale > 0 ? scale:this.scale);
        return this;
    }
    public int getTemperature()
    {
        return temperature;
    }
    public void draw(GraphicsContext gc)
    {
        if (temperature < 50) { gc.setFill(Color.BLUE); }
        else if (temperature > 77) { gc.setFill(Color.RED); }
        else { gc.setFill(Color.YELLOW); }
        gc.fillRect(sX, sY, 25, temperature * 8);
        gc.setFill(Color.BLACK);
        gc.fillText(month, sX, sY - 24);
        String temp = ""+temperature;
        gc.fillText(temp, sX + 5, sY - 8);
        //System.out.println("Printing a rectangle. sX = "+sX+". sY = "+sY+". Height is "+temperature * 8+"."); //for debug
    }
}
