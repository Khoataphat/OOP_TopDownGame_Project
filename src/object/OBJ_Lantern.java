package object;

import entity.Entity;
import main.GamePanel;

import java.awt.*;

public class OBJ_Lantern extends Entity {

    public static final String objName = "Lantern";

    public OBJ_Lantern(GamePanel gp)
    {
        super(gp);

        type = type_obstacle;
        name = objName;
        down1 = setup("/objects/lantern",gp.tileSize,gp.tileSize);
        description = "[Lantern]\nIlluminates your \nsurroundings.";
        price = 200;
        lightRadius = 350;

    }

}
