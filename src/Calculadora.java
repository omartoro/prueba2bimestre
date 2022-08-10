import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Calculadora {
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
    private JLabel resultadoSC;
    private JLabel operacionSC;
    private JPanel showSC;
    private JButton retrocederBT;

    private ScriptEngineManager scrip = new ScriptEngineManager();
    private ScriptEngine run = scrip.getEngineByName("JavaScript");

    private void agregarNumero(String digito) {
        operacionSC.setText(operacionSC.getText() + digito);
    }
    public Calculadora() {
        borrarBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacionSC.setText("");
                resultadoSC.setText("");
            }
        });
        unoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("1");
                igualBT.doClick();
            }
        });
        dosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("2");
                igualBT.doClick();
            }
        });
        tresBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("3");
                igualBT.doClick();
            }
        });
        cuatroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("4");
                igualBT.doClick();
            }
        });
        cincoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("5");
                igualBT.doClick();
            }
        });
        seisBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("6");
                igualBT.doClick();
            }
        });
        sieteBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("7");
                igualBT.doClick();
            }
        });
        ochoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("8");
                igualBT.doClick();
            }
        });
        nueveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("9");
                igualBT.doClick();
            }
        });
        ceroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("0");
                igualBT.doClick();
            }
        });
        sumaBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("+");
            }
        });
        restaBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("-");
            }
        });
        multiplicacionBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("*");
            }
        });
        divisionBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("/");
            }
        });
        puntoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero(".");
                igualBT.doClick();
            }
        });
        raizBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("√");
            }
        });
        alcuadradoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("^2");
            }
        });
        alaNBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("^");
            }
        });
        factorialBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("!");
            }
        });
        sinBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("sin");
            }
        });
        cosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("cos");
            }
        });
        tanBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("tan");
            }
        });
        logBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("log");
            }
        });
        piBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("π");
                igualBT.doClick();
            }
        });
        igualBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String resultado = run.eval(operacionSC.getText()).toString();
                    resultadoSC.setText(resultado);
                } catch (ScriptException ex) {
                    operacionSC.setText("Error");
                }
            }
        });
        retrocederBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operacion = operacionSC.getText().substring(0, operacionSC.getText().length() - 1);
                operacionSC.setText(operacion);
                igualBT.doClick();
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
