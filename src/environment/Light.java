//package environment;
//
//import entity.Entity;
//import main.GamePanel;
//import object.OBJ_Torch;
//import tile.Tile;
//import tile.TileManager;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//import static java.awt.AWTEventMulticaster.add;
//
//public class Light extends EnvironmentManager {
//    private BufferedImage worldImage;
//    private BufferedImage lightMap;
//    public List torchList;
//    private static final int LIGHT_RADIUS = 100;  // Adjust the light radius as needed
//    private static final Color LIGHT_COLOR = new Color(255, 255, 255, 128);
//     public Light(GamePanel gp){
//         super(gp);
////         InputStream is = getClass().getResourceAsStream("/maps/tiledata.txt");
////         BufferedReader br = new BufferedReader(new InputStreamReader(is));
//
////     }
//
//   try {
//        // Load the world image
//        InputStream is = getClass().getResourceAsStream("/maps/tiledata.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));
//
//        torchList = new ArrayList<>(entityList);
//
//        // Initial darkening of the light map
//        updateLightMap();
//} catch (IOException e) {
//        e.printStackTrace();
//        }
//
//// Set up the JFrame
//setTitle("World Size Darkness Filter with Dynamic Light Map");
//torchList.setSize(800, 600);  // Screen size
//setTitle(String.valueOf(JFrame.EXIT_ON_CLOSE));
//setLocationRelativeTo(null);
//add(new OBJ_Torch(GamePanel gp));
//        }
//
//    private void setLocationRelativeTo(Object o) {
//    }
//
//    private void setTitle(String s) {
//    }
//
//    private void updateLightMap() {
//    Graphics2D g2d = lightMap.createGraphics();
//    // Fill the light map with darkness
//    g2d.setColor(new Color(0, 0, 0, 255));
//    g2d.fillRect(0, 0, lightMap.getWidth(), lightMap.getHeight());
//
//    // Draw each light source
//    for (Point light : torchList) {
//        drawLight(g2d, light.x, light.y, LIGHT_RADIUS);
//    }
//
//    g2d.dispose();
//}
//
//private void drawLight(Graphics2D g2d, int x, int y, int radius) {
//    GradientPaint gp = new GradientPaint(x, y, LIGHT_COLOR, x, y + radius, new Color(0, 0, 0, 255), true);
//    g2d.setPaint(gp);
//    g2d.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
//}
//
//public void addLightSource(int x, int y) {
//    torchList.add(String.valueOf(new Point(x, y)));
//    updateLightMap();
//    torchList.repaint();
//}
//
////private class ImagePanel extends JPanel {
////    @Override
////    protected void paintComponent(Graphics g) {
////        super.paintComponent(g);
////        // Draw the portion of the world image and light map that fits within the screen
////        int screenWidth = getWidth();
////        int screenHeight = getHeight();
////        int offsetX = (worldImage.getWidth() - screenWidth) / 2;
////        int offsetY = (worldImage.getHeight() - screenHeight) / 2;
////
////        BufferedImage croppedWorldImage = worldImage.getSubimage(offsetX, offsetY, screenWidth, screenHeight);
////        BufferedImage croppedLightMap = lightMap.getSubimage(offsetX, offsetY, screenWidth, screenHeight);
////
////        g.drawImage(croppedWorldImage, 0, 0, null);
////        g.drawImage(croppedLightMap, 0, 0, null);
////    }
//
//
//}
