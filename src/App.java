public class App { // Esto es una clase


    public static void main(String[] args) throws Exception { // <--- Esto es una función
        System.out.println("Hola que tal"); // Este es un console.log // Siempre punto y coma al final de una instruccion

        /*
         * 
         * VARIABLE:
         * Es un espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
         * 
         * DECLARACIÓN:
         * Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
         * 
         * DEFINICION:
         * Asignar el tipo de dato y el nombre de la variable dandole o no un valor inicial
         * 
         * ASIGNACIón:
         * Darle un valor a la variable ya declarada
         * 
         */

        
        /*
        * TIPOS DE VARIABLES:
        Variables primitivas: Almacenan valores basicos
        Variables de referencia: Almacenan direcciones de memoria que apuntan a objetos
        */

        /*
         * TIPOS DE DATOS ENTEROS: byte(-128 al 127), short(-32768 al 32767), int, long
         */
        
        int numero = 3;

        /*
         * TIPOS DE DATOS REALES: float (6 decimales) y double
         */
        double decimales = 5.145;

        /*
         * TIPO DE DATOS DE CARACTER
         */

         char letra = 'a';

         /*
          * TIPO DE DATOS BOOLEANO
          */

          boolean v = true;
          boolean f = false;

          String cadena = "Esto es una cadena";


        System.out.println(numero);
        System.out.println(decimales);
        System.out.println(letra);
        System.out.println(v);
        System.out.println(f);
        System.out.println(cadena);
    }
}
