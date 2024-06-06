package object;

import entity.Entity;
import main.GamePanel;

import java.awt.*;

public class OBJ_Lantern extends Entity {

    public static final String objName = "Lantern";

    public OBJ_Lantern(GamePanel gp)
    {
        super(gp);

        type = type_light;
        name = objName;
        down1 = setup("/objects/lantern",gp.tileSize,gp.tileSize);
        description = "[Lantern]\nIlluminates your \nsurroundings.";
        price = 200;
        lightRadius = 350;
    }

    public void renderLight(Graphics2D g2) {
        // Vẽ hình tròn ánh sáng
        g2.setColor(new Color(255, 255, 255, 100)); // Màu trắng trong suốt
        g2.fillOval(
                (int) (worldX + 6 - lightRadius / 2),
                (int) (worldY + 10 - lightRadius / 2),
                lightRadius,
                lightRadius
        );
        }
}
