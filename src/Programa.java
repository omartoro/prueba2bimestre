import javax.swing.*;

public class Programa
{
    private static Calculadora app = new Calculadora();

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(app.getMainPanel());
        frame.setSize(400,475);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
