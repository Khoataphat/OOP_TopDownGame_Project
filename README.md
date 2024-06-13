<a name="_hlk155976484"></a><a name="_top"></a>**INTERNATIONAL UNIVERSITY**

**VIETNAM NATIONAL UNIVERSITY – HO CHI MINH CITY**

**School of Computer Science and Engineering**

![](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.002.png)


## SAVING SIR. NGHIA

## OBJECT-ORIENTED PROGRAMMING

**-----\*\*\*-----** 

**Team member**

|No.|Full Name|Student’s ID|
| :-: | :-: | :-: |
|1|Đỗ Thanh Bảo Anh|ITDSIU22175|
|2|Phạm Tuấn Đăng Khoa|ITITIU22087|
|3|Nguyễn Minh Kha|ITITIU22079|
|4|Trần Thiên Phú|ITITIU22124|

## Installation
* Download ZIP and Extract "OOP_TopDownGame_Project-master" to Desktop.

* Open IntelliJ IDEA and Select Open Project.

* Choose "OOP_TopDownGame_Project-master" folder and Select "Yes" to ReUse Module Files.

* At this point, be sure you are opening the root folder (/OOP_TopDownGame_Project-master).

* Go src -> main folder -> Run Main

* Lastly don't forget to Setup SDK if needed.

## Goal
Kill monsters → Get stronger → Buy powerful items → Find the dungeon keys → KILL THE BOSS → Find Sir.Nghia → Win game


## UML Diagram

We provided the UML diagrams for the entire project and each group that was addressed to help you better understand the structure and methods.

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.008.png)

<a name="_toc155996347"></a>*Figure: Entity diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.009.png)

<a name="_toc155996349"></a>*Figure: Class extend from Entity diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.010.png)

<a name="_toc155996350"></a>*Figure: Player diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.011.png)

<a name="_toc155996352"></a>*Figure: Projectile diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.012.png)

<a name="_toc155996351"></a>*Figure: Object diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.013.png)

*Figure: Monster diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.014.png)

*Figure: NPC diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.015.png)

*Figure: Map diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.016.png)

*Figure: Path finding algorithm diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.017.png)

<a name="_toc155996346"></a>*Figure 12. InteractiveTile diagram*


![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.018.png)

<a name="_toc155996353"></a>*Figure 13: Main diagram*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.019.png)

*Figure: Panel diagram*

## ENTITY, NPCs, OTHER OBJECT DESIGN

1. **<a name="_toc16992"></a><a name="_toc17979"></a>Player**

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.040.png)

*Figure: Main Characters*

The above characters are used for players during the game. With the purpose of diversifying characters and enhancing player experience, we have created 3 characters with 3 completely different formats so players can freely choose their favorite character.

2. **<a name="_toc15434"></a><a name="_toc10732"></a>Enemy**

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.041.png)

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.042.png)

*Figure: Enemy Characters*

- BAT: has a high ability in movement that is difficult for player to defeat. 
- MINIGROOT: is weakest monster in this game, but the amount of monster is a problem. Player need to handle strong boss while a lot of MINIGROOT is around.
- ORC: is one the the strongest monster with high damage, but restricted movement.
- ONEEYECANFLY: have widely damage that increases challenging and emotion of playing game.
- SKELETON LORD:the final boss with massive damage and dynamic movement. Player need to defeat the final to finish game and save Mr Nghia.

3. **<a name="_toc11978"></a><a name="_toc15643"></a>NPCs**

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.043.png)

*Figure: NPCs*

- The Old Man is a character who provides guidance and direction to the player's character.
- The Merchant is a character who sells items, such as potions or other supplies, to the player.
4. **<a name="_toc11320"></a><a name="_toc25925"></a>Other Object**

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.044.png)

*Figure: Other Object*

- Chest: Grants reward to the player whether it will be a coin, weapon,... the first time the player comes in contact.
- Door: Restricts players from entering other areas when they have not found the key.
- Key: To open door.
- Lantern: Helps players see in areas with limited light.
- Heart: Helps players to recovery their missing health.
- Mana-Crystal: Helps players to recovery their missing mana.


## MAP DESIGN


![](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.048.png)

*Figure: Overview Map 100x100*

## Game Play

Player Controls:

The following figure illustrates the input to control the player. We use keyboards key such as A,W,S,D to move the player and Enter to attack the enemies.

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.050.png)

*Figure: Player Controls*

Game Controls:

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.051.png)

*Figure: Game Controls*


## Some Screen

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.063.png)

*Figure: Select player*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.064.png)

*Figure: Inventory*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.065.png)

*Figure: Level up*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.066.png)

*Figure: Game pause*

![](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.067.png)

*Figure: Game options*

![IMG_256](screenshot_report/Aspose.Words.ac39a8bf-f1d8-481b-8bb5-3f90e7a1d3a6.068.png)

*Figure: Game over*


## DEMO

[Click here to view](https://drive.google.com/file/d/1CLsoQxugP8uQHXMjLca8d3_UI-HAwY3w/view?usp=sharing)



