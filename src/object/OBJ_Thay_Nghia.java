package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Thay_Nghia extends Entity {

    GamePanel gp;
    public static final String objName = "Blue Heart";
    public OBJ_Thay_Nghia(GamePanel gp)
    {
        super(gp);

        this.gp = gp;

        type = type_pickupOnly;
        name = objName;
        down1 = setup("/objects/thay_nghia", gp.tileSize, gp.tileSize);
        setDialogues();
    }
    public void setDialogues()
    {
        dialogues[0][0] = "You found Teacher Nghia.";
        dialogues[0][1] = "You successfully rescued him from the dungeon.";
    }
    public boolean use(Entity entity) //when pickup this method will be called
    {
        gp.gameState = gp.cutsceneState;
        gp.csManager.sceneNum = gp.csManager.ending;
        return true;
    }

}
