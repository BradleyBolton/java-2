package javaFX;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class SpriteClient extends Application
{
    private Sprite s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;
    @Override
    public void start(Stage stage)
    {
        GraphicsContext gc = JIGRaphicsUtility.setUpGraphics(stage, "One year of monthly temperatures", 750, 500);
        s1 = new Sprite(0, 750 - 31*8, 1, 31, "Jan");
        s2 = new Sprite(40, 750 - 28*8, 1, 28, "Feb");
        s3 = new Sprite(80, 750 - 45*8, 1, 45, "Mar");
        s4 = new Sprite(120, 750 - 60*8, 1, 60, "Apr");
        s5 = new Sprite(160, 750 - 69*8, 1, 69, "May");
        s6 = new Sprite(200, 750 - 8*80, 1, 80, "Jun");
        s7 = new Sprite(240, 750 - 88*8, 1, 88, "Jul");
        s8 = new Sprite(280, 750 - 87*8, 1, 87, "Aug");
        s9 = new Sprite(320, 750 - 75*8, 1, 75, "Sep");
        s10= new Sprite(360, 750 - 65*8, 1, 65, "Oct");
        s11= new Sprite(400, 750 - 43*8, 1,  43, "Nov");
        s12= new Sprite(440, 750 - 23*8, 1, 23, "Dec");
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

