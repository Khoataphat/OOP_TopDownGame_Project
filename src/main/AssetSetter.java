package main;


import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.*;
import object.OBJ_BlueHeart;

import java.util.Random;


public class AssetSetter {
    private static AssetSetter instance;

    GamePanel gp;
    MON_SkeletonLord boss;

    private AssetSetter(GamePanel gp)
    {
        this.gp = gp;
    }

    private int i_Mon = 1;
    private int countTime = 0;

    public static AssetSetter getInstance(GamePanel gp) {
        if (instance == null) {
            instance = new AssetSetter(gp); // Only create a new instance if one doesn't exist
        }
        return instance;
    }
    public void setObject()
    {
        int mapNum = 0;
        int i = 0;
/*
        gp.obj[mapNum][i] = new OBJ_Axe(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 33;
        gp.obj[mapNum][i].worldY = gp.tileSize * 7;
        i++;
        gp.obj[mapNum][i] = new OBJ_Lantern(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 31;
        gp.obj[mapNum][i].worldY = gp.tileSize * 12;
        i++;
        gp.obj[mapNum][i] = new OBJ_Tent(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 26;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 14;
        gp.obj[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 12;
        gp.obj[mapNum][i].worldY = gp.tileSize * 12;
        i++;
        gp.obj[mapNum][i] = new OBJ_Key(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 22;
        gp.obj[mapNum][i].worldY = gp.tileSize * 41;
        i++;
        gp.obj[mapNum][i] = new OBJ_Key(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 38;
        gp.obj[mapNum][i].worldY = gp.tileSize * 40;
        i++;

        mapNum = 1;//adding object to second map
        i=0;
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 10;
        gp.obj[mapNum][i].worldY = gp.tileSize * 10;
        i++;

        mapNum = 2;
        i = 0;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Pickaxe(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 40;
        gp.obj[mapNum][i].worldY = gp.tileSize * 41;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 13;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 26;
        gp.obj[mapNum][i].worldY = gp.tileSize * 34;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 27;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door_Iron(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 18;
        gp.obj[mapNum][i].worldY = gp.tileSize * 23;
        i++;

        mapNum = 3;
        i = 0;
        gp.obj[mapNum][i] = new OBJ_Door_Iron(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 25;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
*/

        //Khoa
        gp.obj[mapNum][i] = new OBJ_BlueHeart(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 91;
        gp.obj[mapNum][i].worldY = gp.tileSize * 9;
        //i++;


    }

    public void setNPC()
    {
        int mapNum = 0;
        int i = 0;

        //MAP = 0
        gp.npc[mapNum][i] = new NPC_OldMan(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*9;
        gp.npc[mapNum][i].worldY = gp.tileSize*7;
        i++;

        //MAP = 1
        //mapNum = 1;
        //i = 0;

        gp.npc[mapNum][i] = new NPC_Merchant(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*42;
        gp.npc[mapNum][i].worldY = gp.tileSize*44;
        i++;
/*
        mapNum = 2;
        i = 0;

        gp.npc[mapNum][i] = new NPC_BigRock(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*20;
        gp.npc[mapNum][i].worldY = gp.tileSize*25;
        i++;
        gp.npc[mapNum][i] = new NPC_BigRock(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*11;
        gp.npc[mapNum][i].worldY = gp.tileSize*18;
        i++;
        gp.npc[mapNum][i] = new NPC_BigRock(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize*23;
        gp.npc[mapNum][i].worldY = gp.tileSize*14;
        i++;
*/
    }
    public void setMonster()
    {
        int mapNum = 0;
        //Banh
        gp.monster[mapNum][i_Mon] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*23;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*10;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*31;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*10;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*27;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*6;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*21;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*6;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*26;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*6;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_Orc(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*25;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*75;
        i_Mon++;


        gp.monster[mapNum][i_Mon] = new MON_RedSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*24;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*30;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_RedSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*23;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*33;
        i_Mon++;

        gp.monster[mapNum][i_Mon] = new MON_RedSlime(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*27;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*26;
        i_Mon++;
        gp.monster[mapNum][i_Mon] = MON_SkeletonLord.getInstance(gp);
        gp.monster[mapNum][i_Mon].worldX = gp.tileSize*24;
        gp.monster[mapNum][i_Mon].worldY = gp.tileSize*29;
        i_Mon++;

        //Khoa




        //mapNum = 2
        //i = 0;
/*
        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*43;
        gp.monster[mapNum][i].worldY = gp.tileSize*47;
        i++;

        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*39;
        gp.monster[mapNum][i].worldY = gp.tileSize*47;
        i++;

        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*47;
        gp.monster[mapNum][i].worldY = gp.tileSize*7;
        i++;
/*
        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*28;
        gp.monster[mapNum][i].worldY = gp.tileSize*11;
        i++;

        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize*10;
        gp.monster[mapNum][i].worldY = gp.tileSize*19;
        i++;

        //mapNum = 3;
        //i = 0;

        //if(Progress.skeletonLordDefeated == false)
        //{
            gp.monster[mapNum][i] = new MON_SkeletonLord(gp);
            gp.monster[mapNum][i].worldX = gp.tileSize*24;
            gp.monster[mapNum][i].worldY = gp.tileSize*29;
            i++;
        //}
*/

    }
    private static int[] randomLocation(int a, int b) {
        Random generator = new Random();
        int worldX = generator.nextInt(5) + a;
        int worldY = generator.nextInt(5) + b;
        int[] coordinates = {worldX, worldY};
        return coordinates;
    }
    public void setSummonCreeps(int worldX, int worldY) {
        if(countTime == 30) {
            if (i_Mon <= 50) {
                int mapNum = 0;
                int[] location = randomLocation(worldX, worldY);
                Random random = new Random();
                int monsterType = random.nextInt(3); // Generate a random number between 0 and 2

                switch (monsterType) {
                    case 0:
                        gp.monster[mapNum][i_Mon] = new MON_GreenSlime(gp);
                        break;
                    case 1:
                        gp.monster[mapNum][i_Mon] = new MON_Orc(gp);
                        break;
                    case 2:
                        gp.monster[mapNum][i_Mon] = new MON_RedSlime(gp);
                        break;
                }

                gp.monster[mapNum][i_Mon].worldX = gp.tileSize * location[0];
                gp.monster[mapNum][i_Mon].worldY = gp.tileSize * location[1];
                i_Mon++;
                countTime = 0;
            } else {
                countTime =0;
            }
        }else{
            countTime++;
        }
    }
    public void setInteractiveTile()
    {
/*        int mapNum = 0;
        int i = 0;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,27,12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,28,12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,29,12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,30,12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,32,12);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,33,12);i++;

        gp.iTile[mapNum][i] = new IT_DryTree(gp,18,40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,17,40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,16,40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,15,40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,14,40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,13,40);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,10,40);i++;

        gp.iTile[mapNum][i] = new IT_DryTree(gp,13,41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,12,41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,11,41);i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp,10,41);i++;

        mapNum = 2;
        i = 0;

        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,18,30);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,17,31);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,17,32);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,17,34);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,18,34);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,10,33);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,10,22);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,38,24);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,38,18);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,38,19);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,38,21);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,18,13);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,18,14);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,22,28);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,30,28);i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall(gp,32,28);i++;

        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,20,22);i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,8,17);i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,39,31);i++;

*/
    }
}
