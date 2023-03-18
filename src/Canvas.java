import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Canvas extends JPanel {
    private Model model;
    private Image imageGamer;
    private Image imageWall;
    private Image imageGoal;
    private Image imageBox;
    private Image imageFields;
    private Image imageBackground;

    public Canvas(Model model) {
        this.model = model;
        setBackground(new Color(202, 255, 202));
        setOpaque(true);
        File fileNameGamer = new File("images/gamer.png");
        File fileNameWall = new File("images/wall.png");
        File fileNameGoal = new File("images/goal.png");
        File fileNameBox = new File("images/box.png");
        File fileNameFields = new File("images/fields.png");
        File fileNameBackground = new File("images/background.png");
        try {
            imageGamer = ImageIO.read(fileNameGamer);
            imageWall = ImageIO.read(fileNameWall);
            imageGoal = ImageIO.read(fileNameGoal);
            imageBox = ImageIO.read(fileNameBox);
            imageFields = ImageIO.read(fileNameFields);
            imageBackground = ImageIO.read(fileNameBackground);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        boolean flag = model.isReady();
        if (flag) {
            drawDesktop(g);
        } else {
            drawError(g);
        }
    }

    private void drawError(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Inpact", Font.BOLD, 50));
        g.drawString("initialization Error", 200, 250);
    }

    private void drawDesktop(Graphics g) {
        int[][] desktop = model.getDesktop();


        int x = 300;
        int y = 50;
        int width = 40;
        int height = 40;
        int offset = 0;

        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
                if (desktop[i][j] == 6) {
                    g.drawImage(imageBackground, x, y, null);
                } else if(desktop[i][j] == 0) {
                    g.drawImage(imageFields, x, y, null);
                } else if (desktop[i][j] == 1) {
                    g.drawImage(imageGamer, x, y, null);
                } else if (desktop[i][j] == 2) {
                    g.drawImage(imageWall, x, y, null);
                } else if (desktop[i][j] == 3) {
                    g.drawImage(imageBox, x, y, null);
                } else if (desktop[i][j] == 4) {
                    g.drawImage(imageGoal, x, y, null);
                }
                x = x + width + offset;
            }
            x = 300;
            y = y + height + offset;
        }

    }
}
