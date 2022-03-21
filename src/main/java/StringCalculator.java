import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String cadena) throws Exception{
        Pattern empty = Pattern.compile("");
        Matcher mat = empty.matcher(cadena);
        if(mat.matches()){
           return 0;
        }
        if(Integer.parseInt(cadena) < 0){
            throw new Exception("No se puede sumar porque es negativo");
        }
        if(Integer.parseInt(cadena) > 1000){
            throw new Exception("El valor es mayor a mil ");
        }
        return Integer.parseInt(cadena);

//
    }

    public int sumaNumerosPorComaOSalto (String cadena){
        String[] listaStrings = cadena.split("[,|\n]");
        int suma = 0;
        for (String elemento:listaStrings) {
            suma += Integer.parseInt(elemento);
        }
        return suma;
    }

    public int separarYSumar(String cadena, String delimitador) throws Exception{
        cadena = cadena.replace(" ","");
        delimitador = delimitador.replace(" ","");
        Pattern pat = Pattern.compile(".*"+delimitador+".*");
        Matcher mat = pat.matcher(cadena);
        int suma = 0;
        if(mat.matches()){
            String[] listaModificada = null;
            listaModificada = cadena.split(delimitador);
            for (String elemento:listaModificada) {
                suma += Integer.parseInt(elemento);
            }
            return suma;

        } else{
            throw new IllegalArgumentException("El delimitador debe ser el mismo");
        }
    }
}
