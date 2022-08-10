import javax.swing.*;
import java.awt.*;

public class Programa
{
    private static Calculadora app = new Calculadora();

    public static Image insertIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("assets/calculadora.png"));
        return retValue;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(app.getMainPanel());
        frame.setSize(400,475);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setIconImage(insertIconImage());
    }
}
