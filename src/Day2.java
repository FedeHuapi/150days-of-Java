public class Day2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola todo bien");

        String texto = "Este es un texto asignado a una variable String";
        System.out.println(texto);

        int longitud = texto.length(); //  cuenta la cant de caracteres que tiene el text
        System.out.println(longitud);

        char caracter = texto.charAt(0); // agarra la letra por el parametro index
        System.out.println(caracter);

        String subString = texto.substring(5, 16); // corta un fragmento del texto
        System.out.println(subString);

        String minuscula = texto.toLowerCase(); // Convierte todo el texto en minuscula
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase(); // convierte todo el texto en mayus
        System.out.println(mayuscula);

        int index = texto.indexOf("variable"); // busca el index de la palabra
        System.out.println(index);

        String reemplazo = texto.replace("texto", "parrafo");
        System.out.println(reemplazo);

        boolean contiene = texto.contains("asignado");
        System.out.println("Tiene la palabra asignado?" + contiene);

        String sinEspacios = texto.trim(); // quita los espacios del input
        System.out.println(sinEspacios);

    }
}
