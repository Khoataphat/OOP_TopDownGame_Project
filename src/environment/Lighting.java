//package environment;
//
//import main.GamePanel;
//
//import java.awt.*;
//import java.awt.geom.Rectangle2D;
//import java.awt.image.BufferedImage;
//import java.awt.geom.Area;
//import java.awt.geom.Ellipse2D;
//import java.awt.RadialGradientPaint;
//
//
//public class Lighting implements EnvironmentManager  {
//
//    GamePanel gp;
//    BufferedImage darknessFilter;
//    public int dayCounter;
//    public float filterAlpha = 0f;
//
//    public final int day = 0;
//    public final int dusk = 1;
//    public final int night = 2;
//    public final int dawn = 3;
//    public int dayState = day;
//
//
////    public Lighting (GamePanel gp, int circleSize){
//public Lighting (GamePanel gp ){
//
//        this.gp = gp;
//        int circleSize = 350;
//        darknessFilter = new BufferedImage(gp.screenWidth, gp.screenHeight, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2 = (Graphics2D)darknessFilter.getGraphics();
//
//        Area screenArea = new Area( new Rectangle2D.Double(0,0,gp.screenWidth,gp.screenHeight));
////
////        int centerX = gp.player.screenX +(gp.tileSize)/2;
////        int centerY = gp.player.screenY +(gp.tileSize)/2;
//        int centerX = gp.screenWidth / 2;
//        int centerY = gp.screenHeight / 2;
//
//        double x = centerX - (circleSize/2);
//        double y = centerY - (circleSize/2);
//        Shape  circleShape = new Ellipse2D.Double(x,y,circleSize,circleSize);
//
//        Area lightingArea = new Area(circleShape);
//
//        screenArea.subtract(lightingArea);
//
//        Color color[] = new Color[12];
//        float fraction[] = new float[12];
//        color[0] = new Color(0,0,0.08f,0.1f);    //Center
//        color[1] = new Color(0,0,0.08f,0.3f);
//        color[2] = new Color(0,0,0.08f,0.32f);
//        color[3] = new Color(0,0,0.08f,0.34f);
//        color[4] = new Color(0,0,0.08f,0.40f);
//        color[5] = new Color(0,0,0.08f,0.45f);
//        color[6] = new Color(0,0,0.08f,0.50f);
//        color[7] = new Color(0,0,0.08f,0.55f);
//        color[8] = new Color(0,0,0.08f,0.60f);
//        color[9] = new Color(0,0,0.08f,0.65f);
//        color[10] = new Color(0,0,0.08f,0.70f);
//        color[11] = new Color(0,0,0.08f,0.75f);  //Edge
//
//        //Distance between gradation
//        fraction[0] = 0f;    //Center
//        fraction[1] = 0.4f;
//        fraction[2] = 0.5f;
//        fraction[3] = 0.6f;
//        fraction[4] = 0.65f;
//        fraction[5] = 0.7f;
//        fraction[6] = 0.75f;
//        fraction[7] = 0.8f;
//        fraction[8] = 0.85f;
//        fraction[9] = 0.9f;
//        fraction[10] = 0.95f;
//        fraction[11] = 1f;    //Edge   //Edge
//
//        RadialGradientPaint gPaint = new RadialGradientPaint(centerX,centerY,(circleSize/2),fraction,color);
//
//                g2.setPaint(gPaint);
//                g2.fill(lightingArea);
//        g2.setColor(new Color(0,0,0,0.85f));
//
//        g2.fill(screenArea);
//
//        g2.dispose();
//    }
//    public  void draw(Graphics2D g2){
//        g2.drawImage(darknessFilter,0,0,null);
//    }
//    public  void setup(){
////        lighting = new Lighting(gp,350);
//    }
//}
package environment;

import entity.Entity;
import main.GamePanel;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Lighting {

    GamePanel gp;
    BufferedImage darknessFilter;
    public int dayCounter;
    public float filterAlpha = 0f;

    public final int day = 0;
    public final int dusk = 1;
    public final int night = 2;
    public final int dawn = 3;
    public int dayState = night;
    public List<Entity> lightSource = new ArrayList<>();

    public Lighting(GamePanel gp) {
        this.gp = gp;
        setLightSource();
    }

    /*public void addLightSource(int screenX, int screenY) {
        List<Point> lightSources = new ArrayList<>();
        int centerX = screenX +(gp.tileSize)/2;
        int centerY = screenY +(gp.tileSize)/2;
        lightSources.add(new Point(centerX, centerY));
        setLightSource(lightSources);
    }*/
    public List<Entity> getLightSource() {
        return lightSource;
    }

    public void setLightSource() {
        Color color[] = new Color[12];
        float fraction[] = new float[12];
        color[0] = new Color(0,0,0.08f,0.1f);    //Center
        color[1] = new Color(0,0,0.08f,0.3f);
        color[2] = new Color(0,0,0.08f,0.32f);
        color[3] = new Color(0,0,0.08f,0.34f);
        color[4] = new Color(0,0,0.08f,0.40f);
        color[5] = new Color(0,0,0.08f,0.45f);
        color[6] = new Color(0,0,0.08f,0.50f);
        color[7] = new Color(0,0,0.08f,0.55f);
        color[8] = new Color(0,0,0.08f,0.60f);
        color[9] = new Color(0,0,0.08f,0.65f);
        color[10] = new Color(0,0,0.08f,0.70f);
        color[11] = new Color(0,0,0.08f,0.75f);  //Edge

        //Distance between gradation
        fraction[0] = 0f;    //Center
        fraction[1] = 0.4f;
        fraction[2] = 0.5f;
        fraction[3] = 0.6f;
        fraction[4] = 0.65f;
        fraction[5] = 0.7f;
        fraction[6] = 0.75f;
        fraction[7] = 0.8f;
        fraction[8] = 0.85f;
        fraction[9] = 0.9f;
        fraction[10] = 0.95f;
        fraction[11] = 1f;    //Edge   //Edge


        darknessFilter = new BufferedImage(gp.screenWidth, gp.screenHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 =  (Graphics2D) darknessFilter.getGraphics();

        // Ensure entire screen is initially dark
        Area screenArea = new Area(new Rectangle2D.Double(0, 0, gp.screenWidth, gp.screenHeight));

        int circleSize = 150;

        for (Entity lightSource : lightSource) {
            int centerX = lightSource.getScreenX() + (gp.tileSize)/2;
            int centerY = lightSource.getScreenY() + (gp.tileSize)/2;

            Shape circleShape = new Ellipse2D.Double(centerX - (circleSize / 2), centerY - (circleSize / 2), circleSize, circleSize);
            Area lightingArea = new Area(circleShape);

            screenArea.subtract(lightingArea);

            RadialGradientPaint gPaint = new RadialGradientPaint(centerX, centerY, circleSize / 2, fraction, color);
            g2.setPaint(gPaint);
            g2.fill(lightingArea);
        }

        // Draw the remaining dark area
        g2.setColor(new Color(0, 0, 0, 0.75f));
        g2.fill(screenArea);

        g2.dispose();
    }

    public void resetDay() {
        dayState = night;
        filterAlpha = 0f;
    }

    public void update() {
        if (gp.player.lightUpdated) {
            setLightSource();
        }
        if (dayState == night) {
            dayCounter++;
            if (dayCounter > 3600) { // 1 min night
                dayState = night;
                dayCounter = 0;
            }
        }
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(darknessFilter, 0, 0, null);
    }
    public  void setup(){
//       lighting = new Lighting(gp,350);
    }
}
