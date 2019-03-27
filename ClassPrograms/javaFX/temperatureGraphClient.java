package javaFX;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class temperatureGraphClient extends Application
{
    private temperatureGraphObject s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;
    @Override
    public void start(Stage stage)
    {
        GraphicsContext gc = JIGRaphicsUtility.setUpGraphics(stage, "One year of monthly temperatures", 490, 760); //height and width are backwards
        s1 = new temperatureGraphObject(10, 750 - 31*8, 1, 31, "Jan");
        s2 = new temperatureGraphObject(50, 750 - 28*8, 1, 28, "Feb");
        s3 = new temperatureGraphObject(90, 750 - 45*8, 1, 45, "Mar");
        s4 = new temperatureGraphObject(130, 750 - 60*8, 1, 60, "Apr");
        s5 = new temperatureGraphObject(170, 750 - 69*8, 1, 69, "May");
        s6 = new temperatureGraphObject(210, 750 - 8*80, 1, 80, "Jun");
        s7 = new temperatureGraphObject(250, 750 - 88*8, 1, 88, "Jul");
        s8 = new temperatureGraphObject(290, 750 - 87*8, 1, 87, "Aug");
        s9 = new temperatureGraphObject(330, 750 - 75*8, 1, 75, "Sep");
        s10= new temperatureGraphObject(370, 750 - 65*8, 1, 65, "Oct");
        s11= new temperatureGraphObject(410, 750 - 43*8, 1,  43, "Nov");
        s12= new temperatureGraphObject(450, 750 - 23*8, 1, 23, "Dec");
        s1.draw(gc);
        s2.draw(gc);
        s3.draw(gc);
        s4.draw(gc);
        s5.draw(gc);
        s6.draw(gc);
        s7.draw(gc);
        s8.draw(gc);
        s9.draw(gc);
        s10.draw(gc);
        s11.draw(gc);
        s12.draw(gc);
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

