package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_LandFills1 extends Entity {

    GamePanel gp;
    public static final String objName = "LandFills1";

    public OBJ_LandFills1(GamePanel gp)
    {
        super(gp);
        this.gp = gp;
        type = type_obstacle;
        name = objName;

        down1 = setup("/objects/LandFills1", gp.tileSize, gp.tileSize);

        collision = false;
        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        price = 35;
        setDialogue();
    }
    public void setDialogue()
    {
        dialogues[0][0] = "You are standing on the LandFills, run immediately!!!!!!!";
    }
    public void interact() {
        startDialogue(this,0);
    }
}
