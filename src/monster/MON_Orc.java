package monster;

import entity.Entity;
import main.GamePanel;
import object.OBJ_Coin_Bronze;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;
import object.OBJ_Rock;

import java.util.Random;

public class MON_Orc extends Entity {
    GamePanel gp; // cuz of different package
    public MON_Orc(GamePanel gp) {
        super(gp);

        this.gp = gp;

        type = type_monster;
        name = "Orc";
        defaultSpeed = 1;
        speed = defaultSpeed;
        maxLife = 60;
        life = maxLife;
        attack = 8;
        defense = 2;
        exp = 8;
        knockBackPower = 5;

        solidArea.x = 4*4;
        solidArea.y = 4*4;
        solidArea.width = 40*2;
        solidArea.height = 44*2;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        attackArea.width = 48*3;
        attackArea.height = 48*3;
        motion1_duration = 40;
        motion2_duration = 85;

        getImage();
        getAttackImage();
    }

    int i = 2;
    public void getImage()
    {
    	 up1 = setup("/monster/orc_up_1",gp.tileSize * i,gp.tileSize * i);
         up2 = setup("/monster/orc_up_2",gp.tileSize * i,gp.tileSize * i);
         up3 = setup("/monster/orc_up_1",gp.tileSize * i,gp.tileSize * i);
         up4 = setup("/monster/orc_up_2",gp.tileSize * i,gp.tileSize * i);
         down1 = setup("/monster/orc_down_1",gp.tileSize * i,gp.tileSize * i);
         down2 = setup("/monster/orc_down_2",gp.tileSize * i,gp.tileSize * i);
         down3 = setup("/monster/orc_down_1",gp.tileSize * i,gp.tileSize * i);
         down4 = setup("/monster/orc_down_2",gp.tileSize * i,gp.tileSize * i);
         left1 = setup("/monster/orc_left_1",gp.tileSize * i,gp.tileSize * i);
         left2 = setup("/monster/orc_left_2",gp.tileSize * i,gp.tileSize * i);
         left3 = setup("/monster/orc_left_1",gp.tileSize * i,gp.tileSize * i);
         left4 = setup("/monster/orc_left_2",gp.tileSize * i,gp.tileSize * i);
         right1 = setup("/monster/orc_right_1",gp.tileSize * i,gp.tileSize * i);
         right2 = setup("/monster/orc_right_2",gp.tileSize * i,gp.tileSize * i);
         right3 = setup("/monster/orc_right_1",gp.tileSize * i,gp.tileSize * i);
         right4 = setup("/monster/orc_right_2",gp.tileSize * i,gp.tileSize * i);
    }
    public void getAttackImage()
    {
    	 attackUp1 = setup("/monster/orc_attack_up_1",gp.tileSize * i, gp.tileSize  * i* 2);
         attackUp2 = setup("/monster/orc_attack_up_2",gp.tileSize * i, gp.tileSize  * i* 2);
         attackUp3 = setup("/monster/orc_attack_up_1",gp.tileSize * i, gp.tileSize  * i* 2);
         attackUp4 = setup("/monster/orc_attack_up_2",gp.tileSize * i, gp.tileSize  * i* 2);
         attackDown1 = setup("/monster/orc_attack_down_1",gp.tileSize * i, gp.tileSize  * i* 2);
         attackDown2 = setup("/monster/orc_attack_down_2",gp.tileSize * i, gp.tileSize  * i* 2);
         attackDown3 = setup("/monster/orc_attack_down_1",gp.tileSize * i, gp.tileSize  * i* 2);
         attackDown4 = setup("/monster/orc_attack_down_2",gp.tileSize * i, gp.tileSize  * i* 2);
         attackLeft1 = setup("/monster/orc_attack_left_1",gp.tileSize * 2 * i, gp.tileSize * i);
         attackLeft2 = setup("/monster/orc_attack_left_2",gp.tileSize * 2 * i, gp.tileSize * i);
         attackLeft3 = setup("/monster/orc_attack_left_1",gp.tileSize * 2 * i, gp.tileSize * i);
         attackLeft4 = setup("/monster/orc_attack_left_2",gp.tileSize * 2 * i, gp.tileSize * i);
         attackRight1 = setup("/monster/orc_attack_right_1",gp.tileSize * 2 * i, gp.tileSize * i);
         attackRight2 = setup("/monster/orc_attack_right_2",gp.tileSize * 2 * i, gp.tileSize * i);
         attackRight3 = setup("/monster/orc_attack_right_1",gp.tileSize * 2 * i, gp.tileSize * i);
         attackRight4 = setup("/monster/orc_attack_right_2",gp.tileSize * 2 * i, gp.tileSize * i);
    }
    public void setAction()
    {
        if(onPath == true)
        {
            //Check if it stops chasing
            checkStopChasingOrNot(gp.player,15,100);

            //Search the direction to go
            searchPath(getGoalCol(gp.player), getGoalRow(gp.player));
        }
        else
        {
            //Check if it starts chasing
            checkStartChasingOrNot(gp.player, 5, 100);

            //Get a random direction
            getRandomDirection(120);
        }

        //Check if it is attacks
        if(attacking == false)
        {
            checkAttackOrNot(30, gp.tileSize*4, gp.tileSize); //Small rate = More agressive
        }
    }

    public void damageReaction() {
        actionLockCounter = 0;
        //direction = gp.player.direction;
        onPath = true; // gets aggro
    }
    public void checkDrop()
    {
        //CAST A DIE
        int i = new Random().nextInt(100)+1;

        //SET THE MONSTER DROP
        if(i < 50)
        {
            dropItem(new OBJ_Coin_Bronze(gp));
        }
        if(i >= 50 && i < 75)
        {
            dropItem(new OBJ_Heart(gp));
        }
        if(i >= 75 && i < 100)
        {
            dropItem(new OBJ_ManaCrystal(gp));
        }
    }
}
