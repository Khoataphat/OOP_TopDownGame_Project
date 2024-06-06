package environment;

import main.GamePanel;

import java.awt.*;

public interface EnvironmentManager {

//    GamePanel gp;
//    public Lighting lighting;

//    public EnvironmentManager(GamePanel gp)
//    {
////        this.gp = gp;
//    }
    public default void setup()
    {
//        lighting = new Lighting(gp,350);
    }
//    public void update()
//    {
//        lighting.update();
//    }
    public default void draw(Graphics2D g2)
    {
//        lighting.draw(g2);
    }
}
