package tile_interactive;

import main.GamePanel;
import object.OBJ_Torch;

import java.awt.*;

public class IT_Torch extends InteractiveTile{
    GamePanel gp;

    public IT_Torch(GamePanel gp, int col, int row) {
        super(gp, col, row);
        this.gp = gp;

        this.worldX = gp.tileSize * col;
        this.worldY = gp.tileSize * row;

        down1 = setup("/object/torch_2", gp.tileSize, gp.tileSize);
        destructible = true;
        life = 2;
    }
    public  boolean isCorrectItem(){
        boolean isCorrectItem = false;
//        if(entity.current.type)
        return isCorrectItem;
    }
    public void playSE(){
        gp.playSE(11);
    }

//    public Color getParticleColor(){
//        gp.eManager.lighting.removelight(gp.currentMap,worldX/gp.tileSize,worldY/gp.tileSize);
//
//        gp.player.canObtainItem(new OBJ_Torch());
//
//        return null;
//    }
    public  int getParticleSize(){
        int size = 6;
        return size;
    }

}
