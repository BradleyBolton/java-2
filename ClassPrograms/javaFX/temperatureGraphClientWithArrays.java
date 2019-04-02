package javaFX;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import java.util.*;

public class temperatureGraphClientWithArrays extends Application
{
    @Override
    public void start(Stage stage)
    {
        Scanner scan = new Scanner(System.in);
        int temperature;
        temperatureGraphObject [] month = new temperatureGraphObject[12];
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int lowTemp = 1000;
        int highTemp = 0;
        int lowLimit = 0;
        int highLimit = 40;
        int flip = 1;
        for (int i = 0; i < 12; i++) {
            System.out.println("temperature in "+months[i]+"- ");
            temperature = scan.nextInt();
            if (temperature > highLimit || temperature < lowLimit)
            {
                System.out.println("The input temperature seems odd and may have been an input error. Input intended temperature for "+months[i]+" to confirm.");
                temperature = scan.nextInt();
            }
            if (temperature < 0)
            {
                System.err.println("Negative temperature not currently supported. Temperature set to 0");
                temperature = 0;
            }
            month[i] = new temperatureGraphObject(0, 0, 1, temperature, months[i]);
            if (lowTemp > temperature) { lowTemp = temperature; }
            if (highTemp < temperature) {highTemp = temperature; }
            if (months[i].equals("Jul")) { flip = flip * -1; }
            lowLimit += 10*flip;
            highLimit += 10*flip;
        }
        GraphicsContext gc = JIGRaphicsUtility.setUpGraphics(stage, "One year of monthly temperatures", 490, highTemp * 8 + 100); //height and width are backwards
        int x = 10;
        for (int i = 0; i < 12; i++)
        {
            month[i].setCoordinates( x, (highTemp * 8 + 50) - (month[i].getTemperature() * 8));
            month[i].draw(gc);
            x += 40;
        }
        gc.fillText("The max temperature was "+highTemp+".", 10, highTemp * 8 + 65);
        gc.fillText("The min temperature was "+lowTemp+".", 10, highTemp * 8 + 75);
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

