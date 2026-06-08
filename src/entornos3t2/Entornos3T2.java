/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos3t2;

/**
 * Clase principal, sólo sirve para crear objetos y probar
 *
 * @author Sergio Rodriguez
 * 
 * @version revision inicial examen
 */
public class Entornos3T2 {
/**
 * 
 */
    /**
     * estos atributos indican el numero de ramas del git
     * la rama principal sobre la que se trabaja en git suele ser main o master
     * y la ramaevolucionada es la rama con mas commits de todas
     */
    private int numRamas;
    private String ramaPrincipal;
    private String ramaEvolucionada;
    
    
    /**
     * @param args the command line arguments
     * @see aqui se estan utilizando metodos de la clase Pokemon porque este es el programa principal
     * y se van a usar muchos metodos de la clase pokemon
     * lo primero que estamos haciendo es coger pokeballs con juego1.cogerpokeball
     * lo segundo que hace es crear un array de pokemons con String[] listadoPakemon para indicar los pokemons a inetntar capturar
     * luego lo tercero intento ganar es el mensaje que le tiene que devolver si introduze la clave para avanzar bien o mal
     * 
     * lo ultimo es un metodo void para indicar cuando te quedaste sin pokeballs para capturara pokemons
     */
    public static void main(String[] args) {
        Pakemon juego1 = new Pakemon("");
        //primero cojo alguna pakeball
        juego1.cogerPakeball();
        juego1.cogerPakeball();

        
        //intento capturar pakemons
        String[] listadoPakemon = {"Staryu", "Mew", "Pikachu", "Charmander", "Lapras", "Gyarados"};
        capturarLista(listadoPakemon, juego1);

        //intento ganar
        System.out.println(juego1.decirClaveFinal(122344324));
    }

    public static void capturarLista(String[] pakemon, Pakemon juego1) {
        for (int i = 0; i < pakemon.length; i++) {
            if (juego1.getPakeballs() > 0) {
                juego1.capturarPakemon(pakemon[i]);
            } else {
                System.out.println("No tienes Pakeballs");
            }
        }
    }

}
