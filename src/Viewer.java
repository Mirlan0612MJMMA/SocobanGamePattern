import javax.swing.*;
import java.awt.*;

public class Viewer {

    private Canvas canvas;
    private JFrame frame;

    public Viewer() {
        Controller controller = new Controller(this);
        Model model = controller.getModel();
        canvas = new Canvas(model);
        frame = new JFrame("Socoban Game AUCA");
        frame.setSize(1300, 700);
        frame.setLocation(20, 10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
        frame.addKeyListener(controller);
    }
    public void update() {
        canvas.repaint();
    }
    public JFrame getFrame() {
        return frame;
    }
}
