import operaciones.Funcion;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton porcentBT;
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
    private JButton piBT;

    private int opcion;

    private ScriptEngineManager scrip = new ScriptEngineManager();
    private ScriptEngine run = scrip.getEngineByName("JavaScript");

    private void agregarNumero(String digito) {
        operacionSC.setText(operacionSC.getText() + digito);
    }

    private String realizarOperacion() {
        double numero = 0;
        String operacion = operacionSC.getText();
        String resultado = "";
        switch (opcion) {
            case 1:
                numero = Integer.parseInt(operacion.substring(4));
                resultado = Funcion.raiz(numero);
                break;
            case 2:
                numero = Integer.parseInt(operacion.substring(0, operacion.length() - 2));
                resultado = Funcion.elevarCuadrado(numero);
                break;
            case 3:
                numero = Integer.parseInt(operacion.substring(0, operacion.length() - 1));
                resultado = Funcion.elevarN(12, 5);
                break;
            case 4:
                numero = Integer.parseInt(operacion.substring(0, operacion.length() - 1));
                resultado= Funcion.factorial(numero);
                break;
            case 5:
                numero = Integer.parseInt(operacion.substring(3));
                resultado = Funcion.obtenerSen(numero);
                break;
            case 6:
                numero = Integer.parseInt(operacion.substring(3));
                resultado = Funcion.obtenerCos(numero);
                break;
            case 7:
                numero = Integer.parseInt(operacion.substring(3));
                resultado = Funcion.obtenerTan(numero);
                break;
            case 8:
                numero = Integer.parseInt(operacion.substring(3));
                resultado = Funcion.obtenerLog(numero);
        }
        return resultado;
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
            }
        });
        dosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("2");
            }
        });
        tresBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("3");
            }
        });
        cuatroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("4");
            }
        });
        cincoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("5");
            }
        });
        seisBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("6");
            }
        });
        sieteBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("7");
            }
        });
        ochoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("8");
            }
        });
        nueveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("9");
            }
        });
        ceroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("0");
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
                agregarNumero("sqrt");
                if (e.getSource() == raizBT) {
                    opcion = 1;
                }
            }
        });
        alcuadradoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("^2");
                if (e.getSource() == alcuadradoBT) {
                    opcion = 2;
                }
                igualBT.doClick();
            }
        });
        alaNBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("^");
                if (e.getSource() == alaNBT) {
                    opcion = 3;
                }
            }
        });
        factorialBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("!");
                if (e.getSource() == factorialBT) {
                    opcion = 4;
                }
                igualBT.doClick();
            }
        });
        sinBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("sin");
                if (e.getSource() == sinBT) {
                    opcion = 5;
                }
            }
        });
        cosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("cos");
                if (e.getSource() == cosBT) {
                    opcion = 6;
                }
            }
        });
        tanBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("tan");
                if (e.getSource() == tanBT) {
                    opcion = 7;
                }
            }
        });
        logBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("log");
                if (e.getSource() == logBT) {
                    opcion = 8;
                }
            }
        });
        piBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarNumero("π");
            }
        });
        igualBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String resultado = "";
                    if ( opcion >= 1 && opcion <= 8) {
                        resultado = realizarOperacion();
                        opcion = 0;
                    }
                    else {
                        resultado = run.eval(operacionSC.getText()).toString();
                    }
                    resultadoSC.setText(resultado);
                } catch (ScriptException ex) {
                    operacionSC.setText("Error");
                } catch (NullPointerException ec) {
                    operacionSC.setText("0");
                }
            }
        });
        retrocederBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operacion = "0";
                try {
                    operacion = operacionSC.getText().substring(0, operacionSC.getText().length() - 1);
                } catch (StringIndexOutOfBoundsException ex) {
                    operacionSC.setText("0");
                }
                operacionSC.setText(operacion);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
