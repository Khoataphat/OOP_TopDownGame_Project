package object;

import entity.Entity;
import main.GamePanel;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.RadialGradientPaint;

public class OBJ_Torch extends Entity {
    int x,y;
    GamePanel gp;
    BufferedImage darkFilter;
    public static final String objName = "Torch";
//    BufferedImage darknessFilter;
//public OBJ_Torch(GamePanel gp){
//    super(gp);
//    this.gp = gp;
//    solidArea.x = 0;
//    solidArea.y = 16;
//    solidArea.width = 48;
//    solidArea.height = 32;
//    solidAreaDefaultX = solidArea.x;
//    solidAreaDefaultY = solidArea.y;
//
//
//    down1 = setup("/objects/Torch_2",gp.tileSize,gp.tileSize);
//}

    public OBJ_Torch(GamePanel gp)
    {
        super(gp);
        this.gp = gp;
        type = type_obstacle;


        down1 = setup("/objects/torch_2",gp.tileSize,gp.tileSize);
        collision = true;
        int circleSize = 150;

        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        drawLightInsight(circleSize);

//        setDialogue();
//        getImage();
//        gradationFraction(150);
//        super(gp);
//        direction = "down";
//        speed = 0;
//
//        solidArea = new Rectangle();
//        solidArea.x = 8;
//        solidArea.y = 16;
//        solidArea.width = 32;
//        solidArea.height = 32;
//        down1 = setup("/objects/tent",gp.tileSize,gp.tileSize);
//
//        solidAreaDefaultX = 8;
//        solidAreaDefaultY = 16;
//
//        dialogueSet = -1; //For first dialogueSet(= 0)

//        getImage();
//        setDialogue();
    }
    public  void drawLightInsight(int circleSize){

        double x = gp.tileSize*6;
        double y = gp.tileSize*10;
        darkFilter = new BufferedImage(gp.screenWidth/2, gp.screenHeight/2, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D)darkFilter.getGraphics();
        Area screenArea = new Area( new Rectangle2D.Double(0,0,gp.screenWidth,gp.screenHeight));
        Area region = new Area(new Rectangle2D. Double(x, y, circleSize, circleSize));


//        int centerX = gp.tileSize*6 +(gp.tileSize)/2;
//        int centerY = gp.tileSize*12 +(gp.tileSize)/2;


//        double x = gp.tileSize*6;
//        double y = gp.tileSize*10;
        Shape  circleShape = new Ellipse2D.Double(x,y,circleSize,circleSize);
        Shape playerInsight = new Ellipse2D.Double(x,y,350,350);

        Area lightingArea = new Area(circleShape);

        region.subtract(lightingArea);
        Area playerLight = new Area(playerInsight);
        region.subtract(playerLight);


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

//        RadialGradientPaint gPaint = new RadialGradientPaint(gp.tileSize*3,gp.tileSize*10,(circleSize/2),fraction,color);
//
//        g2.setPaint(gPaint);
//        g2.fill(playerInsight);
//        g2.setColor(new Color(0,0,0,0.85f));
//
//        g2.fill(region);
//
//        g2.dispose();


    }


//    public  void draw(Graphics2D g2){
//        g2.drawImage(darkFilter,worldX,worldY,null);
//    }
//    public void getImage()
//    {
        //up1 = setup("/npc/oldman_up_1",gp.tileSize,gp.tileSize);
        //up2 = setup("/npc/oldman_up_2",gp.tileSize,gp.tileSize);
        //up3 = setup("/npc/oldman_up_1",gp.tileSize,gp.tileSize);
        //up4 = setup("/npc/oldman_up_2",gp.tileSize,gp.tileSize);
//        down1 = setup("/objects/Torch_2",gp.tileSize,gp.tileSize);
//        down2 = setup("/objects/sword_normal",gp.tileSize,gp.tileSize);
//        down3 = setup("/objects/pickaxe",gp.tileSize,gp.tileSize);
//        down4 = setup("/objects/key",gp.tileSize,gp.tileSize);
        //left1 = setup("/npc/oldman_left_1",gp.tileSize,gp.tileSize);
        //left2 = setup("/npc/oldman_left_2",gp.tileSize,gp.tileSize);
        //left3 = setup("/npc/oldman_left_1",gp.tileSize,gp.tileSize);
        //left4 = setup("/npc/oldman_left_2",gp.tileSize,gp.tileSize);
        //right1 = setup("/npc/oldman_right_1",gp.tileSize,gp.tileSize);
        //right2 = setup("/npc/oldman_right_2",gp.tileSize,gp.tileSize);
        //right3 = setup("/npc/oldman_right_1",gp.tileSize,gp.tileSize);
        //right4 = setup("/npc/oldman_right_2",gp.tileSize,gp.tileSize);
//    }

//    public void gradationFraction(int circleSize){
//
//        darknessFilter = new BufferedImage(gp.screenWidth, gp.screenHeight, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2 = (Graphics2D)darknessFilter.getGraphics();
//
//        Area screenArea = new Area( new Rectangle2D.Double(0,0,gp.screenWidth,gp.screenHeight));
//        int mapNum = 0;
//        int i= 0;
//        int centerX =   (gp.tileSize)/2;
//        int centerY = (gp.tileSize)/2;
//
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
//        g2.setPaint(gPaint);
//        g2.fill(lightingArea);
//        g2.setColor(new Color(0,0,0,0.85f));
//
//        g2.fill(screenArea);
//
//        g2.dispose();
//    }
//    public  void draw(Graphics2D g2){
//        g2.drawImage(darknessFilter,0,0,null);
//    }
    }



