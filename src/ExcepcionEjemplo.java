import com.excepciones.Aritmetica;
import com.runtimeException.AritmeticaUno;

public class ExcepcionEjemplo {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.divicion(10, 0);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Error en el valor ");
        } finally {
            System.out.println("Proceso finalizado");
        }
        //resultado = AritmeticaUno.divicion(10, 0);
    }
}
