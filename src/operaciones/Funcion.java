package operaciones;

public class Funcion
{
    public static String factorial(double n) {
        double factorial = 1;
        for (double i = n; i > 0; i--) {
            factorial = factorial * i;
        }
        return String.valueOf(factorial);
    }

    public static String raiz(double n) {
        double raiz = Math.sqrt(n);
        return String.valueOf(raiz);
    }
    public static String elevarCuadrado(double n) {
        double cudrado = Math.pow(n, 2);
        return String.valueOf(cudrado);
    }
    public static String elevarN(double x, double n) {
        double exp = Math.pow(x, n);
        return String.valueOf(exp);
    }
    public static String obtenerSen(double n) {
        double seno = Math.sin(n);
        return String.valueOf(seno);
    }
    public static String obtenerCos(double n) {
        double cos = Math.cos(n);
        return String.valueOf(cos);
    }
    public static String obtenerTan(double n) {
        double tan = Math.tan(n);
        return String.valueOf(tan);
    }
    public static String obtenerLog(double n) {
        double log = Math.log(n);
        return String.valueOf(log);
    }
}
