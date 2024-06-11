package monster;

import data.Progress;
import entity.Entity;
import main.AssetSetter;
import main.GamePanel;
import object.OBJ_Coin_Bronze;
import object.OBJ_Door_Iron;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;

import java.util.Random;

public class MON_SkeletonLord extends Entity {
    private static MON_SkeletonLord instance;
    GamePanel gp; // cuz of different package
    public AssetSetter  aSetter = AssetSetter.getInstance(gp); // Get the instance of AssetSetter

    public static final String monName = "Skeleton Lord";

    private MON_SkeletonLord(GamePanel gp) {
        super(gp);

        this.gp = gp;

        type = type_monster;
        boss = true;
        name = monName;
        defaultSpeed = 1;
        speed = defaultSpeed;
        maxLife = 40;
        life = maxLife;
        attack = 16;
        defense = 3;
        //exp = 40;
        knockBackPower = 5;
        sleep = false;

        int size = gp.tileSize * 2;
        solidArea.x = 48;
        solidArea.y = 48;
        solidArea.width = size + 48*2;
        solidArea.height = size + 48*2 ;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        attackArea.width = 170;
        attackArea.height = 170;
        motion1_duration = 25;
        motion2_duration = 50;

        getImage();
        getAttackImage();
        setDialogue();
    }
    public static MON_SkeletonLord getInstance(GamePanel gp){
        if (instance == null) {
            instance = new MON_SkeletonLord(gp);
        }
        return instance;
    }

    public void getImage()
    {

        int i = 5;
        if(inRage == false)
        {
        	up1 = setup("/monster/skeletonlord_up_1",gp.tileSize * i,gp.tileSize * i);
            up2 = setup("/monster/skeletonlord_up_2",gp.tileSize * i,gp.tileSize * i);
            up3 = setup("/monster/skeletonlord_up_1",gp.tileSize * i,gp.tileSize * i);
            up4 = setup("/monster/skeletonlord_up_2",gp.tileSize * i,gp.tileSize * i);
            down1 = setup("/monster/skeletonlord_down_1",gp.tileSize * i,gp.tileSize * i);
            down2 = setup("/monster/skeletonlord_down_2",gp.tileSize * i,gp.tileSize * i);
            down3 = setup("/monster/skeletonlord_down_1",gp.tileSize * i,gp.tileSize * i);
            down4 = setup("/monster/skeletonlord_down_2",gp.tileSize * i,gp.tileSize * i);
            left1 = setup("/monster/skeletonlord_left_1",gp.tileSize * i,gp.tileSize * i);
            left2 = setup("/monster/skeletonlord_left_2",gp.tileSize * i,gp.tileSize * i);
            left3 = setup("/monster/skeletonlord_left_1",gp.tileSize * i,gp.tileSize * i);
            left4 = setup("/monster/skeletonlord_left_2",gp.tileSize * i,gp.tileSize * i);
            right1 = setup("/monster/skeletonlord_right_1",gp.tileSize * i,gp.tileSize * i);
            right2 = setup("/monster/skeletonlord_right_2",gp.tileSize * i,gp.tileSize * i);
            right3 = setup("/monster/skeletonlord_right_1",gp.tileSize * i,gp.tileSize * i);
            right4 = setup("/monster/skeletonlord_right_2",gp.tileSize * i,gp.tileSize * i);
        }
        if(inRage == true)
        {
        	 up1 = setup("/monster/skeletonlord_phase2_up_1",gp.tileSize * i,gp.tileSize * i);
             up2 = setup("/monster/skeletonlord_phase2_up_2",gp.tileSize * i,gp.tileSize * i);
             up3 = setup("/monster/skeletonlord_phase2_up_1",gp.tileSize * i,gp.tileSize * i);
             up4 = setup("/monster/skeletonlord_phase2_up_2",gp.tileSize * i,gp.tileSize * i);
             down1 = setup("/monster/skeletonlord_phase2_down_1",gp.tileSize * i,gp.tileSize * i);
             down2 = setup("/monster/skeletonlord_phase2_down_2",gp.tileSize * i,gp.tileSize * i);
             down3 = setup("/monster/skeletonlord_phase2_down_1",gp.tileSize * i,gp.tileSize * i);
             down4 = setup("/monster/skeletonlord_phase2_down_2",gp.tileSize * i,gp.tileSize * i);
             left1 = setup("/monster/skeletonlord_phase2_left_1",gp.tileSize * i,gp.tileSize * i);
             left2 = setup("/monster/skeletonlord_phase2_left_2",gp.tileSize * i,gp.tileSize * i);
             left3 = setup("/monster/skeletonlord_phase2_left_1",gp.tileSize * i,gp.tileSize * i);
             left4 = setup("/monster/skeletonlord_phase2_left_2",gp.tileSize * i,gp.tileSize * i);
             right1 = setup("/monster/skeletonlord_phase2_right_1",gp.tileSize * i,gp.tileSize * i);
             right2 = setup("/monster/skeletonlord_phase2_right_2",gp.tileSize * i,gp.tileSize * i);
             right3 = setup("/monster/skeletonlord_phase2_right_1",gp.tileSize * i,gp.tileSize * i);
             right4 = setup("/monster/skeletonlord_phase2_right_2",gp.tileSize * i,gp.tileSize * i);
        }
    }
    public void getAttackImage()
    {

        int i = 5;

        if(inRage == false)
        {
        	 attackUp1 = setup("/monster/skeletonlord_attack_up_1",gp.tileSize * i, gp.tileSize * 2 * i);
             attackUp2 = setup("/monster/skeletonlord_attack_up_2",gp.tileSize * i, gp.tileSize * 2 * i);
             attackUp3 = setup("/monster/skeletonlord_attack_up_1",gp.tileSize * i, gp.tileSize * 2 * i);
             attackUp4 = setup("/monster/skeletonlord_attack_up_2",gp.tileSize * i, gp.tileSize * 2 * i);
             attackDown1 = setup("/monster/skeletonlord_attack_down_1",gp.tileSize * i, gp.tileSize * 2 * i);
             attackDown2 = setup("/monster/skeletonlord_attack_down_2",gp.tileSize * i, gp.tileSize * 2 * i);
             attackDown3 = setup("/monster/skeletonlord_attack_down_1",gp.tileSize * i, gp.tileSize * 2 * i);
             attackDown4 = setup("/monster/skeletonlord_attack_down_2",gp.tileSize * i, gp.tileSize * 2 * i);
             attackLeft1 = setup("/monster/skeletonlord_attack_left_1",gp.tileSize * 2 * i, gp.tileSize * i);
             attackLeft2 = setup("/monster/skeletonlord_attack_left_2",gp.tileSize * 2 * i, gp.tileSize * i);
             attackLeft3 = setup("/monster/skeletonlord_attack_left_1",gp.tileSize * 2 * i, gp.tileSize * i);
             attackLeft4 = setup("/monster/skeletonlord_attack_left_2",gp.tileSize * 2 * i, gp.tileSize * i);
             attackRight1 = setup("/monster/skeletonlord_attack_right_1",gp.tileSize * 2 * i, gp.tileSize * i);
             attackRight2 = setup("/monster/skeletonlord_attack_right_2",gp.tileSize * 2 * i, gp.tileSize * i);
             attackRight3 = setup("/monster/skeletonlord_attack_right_1",gp.tileSize * 2 * i, gp.tileSize * i);
             attackRight4 = setup("/monster/skeletonlord_attack_right_2",gp.tileSize * 2 * i, gp.tileSize * i);
        }
        if(inRage == true)
        {
        	attackUp1 = setup("/monster/skeletonlord_phase2_attack_up_1",gp.tileSize * i, gp.tileSize * 2 * i);
            attackUp2 = setup("/monster/skeletonlord_phase2_attack_up_2",gp.tileSize * i, gp.tileSize * 2 * i);
            attackUp3 = setup("/monster/skeletonlord_phase2_attack_up_1",gp.tileSize * i, gp.tileSize * 2 * i);
            attackUp4 = setup("/monster/skeletonlord_phase2_attack_up_2",gp.tileSize * i, gp.tileSize * 2 * i);
            attackDown1 = setup("/monster/skeletonlord_phase2_attack_down_1",gp.tileSize * i, gp.tileSize * 2 * i);
            attackDown2 = setup("/monster/skeletonlord_phase2_attack_down_2",gp.tileSize * i, gp.tileSize * 2 * i);
            attackDown3 = setup("/monster/skeletonlord_phase2_attack_down_1",gp.tileSize * i, gp.tileSize * 2 * i);
            attackDown4 = setup("/monster/skeletonlord_phase2_attack_down_2",gp.tileSize * i, gp.tileSize * 2 * i);
            attackLeft1 = setup("/monster/skeletonlord_phase2_attack_left_1",gp.tileSize * 2 * i, gp.tileSize * i);
            attackLeft2 = setup("/monster/skeletonlord_phase2_attack_left_2",gp.tileSize * 2 * i, gp.tileSize * i);
            attackLeft3 = setup("/monster/skeletonlord_phase2_attack_left_1",gp.tileSize * 2 * i, gp.tileSize * i);
            attackLeft4 = setup("/monster/skeletonlord_phase2_attack_left_2",gp.tileSize * 2 * i, gp.tileSize * i);
            attackRight1 = setup("/monster/skeletonlord_phase2_attack_right_1",gp.tileSize * 2 * i, gp.tileSize * i);
            attackRight2 = setup("/monster/skeletonlord_phase2_attack_right_2",gp.tileSize * 2 * i, gp.tileSize * i);
            attackRight3 = setup("/monster/skeletonlord_phase2_attack_right_1",gp.tileSize * 2 * i, gp.tileSize * i);
            attackRight4 = setup("/monster/skeletonlord_phase2_attack_right_2",gp.tileSize * 2 * i, gp.tileSize * i);
        }
    }
    /*
    public void setDialogue()
    {
        dialogues[0][0] = "No one can steal my treasure.";
        dialogues[0][1] = "You will die here.";
        dialogues[0][2] = "WELCOME TO YOUR DOOM!";


    }

     */
    public void setAction()
    {
        if(inRage==false && life < 30 && life > 15)
        {

            aSetter.setSummonCreeps(MON_SkeletonLord.instance.worldX/gp.tileSize, MON_SkeletonLord.instance.worldY/gp.tileSize+4);
            int i=0;
            i++;
            System.out.println(i);
            System.out.println("1 Boss biến mất");

            /*
            System.out.println(MON_SkeletonLord.instance.worldX/gp.tileSize);
            System.out.println(MON_SkeletonLord.instance.worldY/gp.tileSize);
            System.out.println("inRage:" + inRage);
            System.out.println("life:" + life);

             */

        } else if (inRage == false && life <15 && life >10) {
            System.out.println("2Boss biến mất");
            aSetter.setAreaAttack(gp.player.worldX / gp.tileSize, gp.player.worldY / gp.tileSize);
            System.out.println("life:" + life);

        } else if (inRage == false && life <10){
            inRage = true;
            getImage();
            getAttackImage();
            defaultSpeed++;
            speed = defaultSpeed + 10;
            attack *= 5;
        }
        if(getTileDistance(gp.player) < 10)
        {
            moveTowardPlayer(60);
        }
        else
        {
            getRandomDirection(120);
        }

        //Check if it is attacks
        if(attacking == false)
        {
            checkAttackOrNot(60, gp.tileSize*7, gp.tileSize*5); //Small rate = More agressive
        }
    }

    public void damageReaction() {
        actionLockCounter = 0;
    }
    public void checkDrop()
    {
        gp.bossBattleOn = false;
        Progress.skeletonLordDefeated = true;

        //Restore the previous music
        gp.stopMusic();
        gp.playMusic(19);

        // Remove the iron doors
        for(int i = 0; i < gp.obj[1].length; i++)
        {
            if(gp.obj[gp.currentMap][i] != null && gp.obj[gp.currentMap][i].name.equals(OBJ_Door_Iron.objName))
            {
                gp.playSE(21);
                gp.obj[gp.currentMap][i] = null;
            }
        }

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
