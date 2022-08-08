import javax.swing.*;

public class calculadora2bi {
    private JButton piBT;
    private JButton raizBT;
    private JButton alcuadradoBT;
    private JButton alaNBT;
    //se denomina alaNBT cuando se eleva un número a la N potencia
    private JButton borrarBT;
    //en el panel el boton esta como CE y se utiliza para borrar una cantidad ingresada
    private JButton factorialBT;
    private JButton sinBT;
    private JButton cosBT;
    private JButton tanBT;
    private JButton logBT;
    // por log se denomina al logaritmo en base diez
    private JButton multiplicacionBT;
    private JButton sumaBT;
    private JButton restaBT;
    private JButton divisionBT;
    private JButton sieteBT;
    private JButton ochoBT;
    private JButton nueveBT;
    private JButton ceroBT;
    private JButton cuatroBT;
    private JButton cincoBT;
    private JButton seisBT;
    private JButton puntoBT;
    private JButton unoBT;
    private JButton dosBT;
    private JButton tresBT;
    private JButton igualBT;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new calculadora2bi().mainPanel);
        frame.setTitle("calculadora");
        frame.setSize(450,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
