/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**@see Proyecto :https://github.com/PacoIESJM/ExamDistancia.git
 * 
 *@version revision inicial examen
 * 
 * @author Sergio Rodriguez
 */
public class Pakemon {
/** 
 * en esta clase se programa la funcionalidad de un juego de pokemon
 * se capturan pokemon, se comprueban pokeballs, se comprueba pokemons capturados
 * y se programa una clave para avanzar en el juego
 * @param 
 * estos son los atributos que se usan para los metodos
 * nombrejugador se usa para pedir el nombre de jugador
 * juegoPesado devuelve un booleano
 * PokemonsCapturados te muestra el numero de pokemons que has capturado
 * pokeballs representa el numero de pokeballs que tienes actualmente
 * 
 */
    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons

    
    public Pakemon(String nombreIn) {
        if (nombreIn.equals("")) {
            this.nombreJugador = "Vago/a";
        } else {
            this.nombreJugador = nombreIn;
        }
        this.juegoPasado = false;
        this.pakemonCapturados = 0;
    }

    /**
     * 
     * 
     * 
     * @param nombrePakemon
     * aqui se usa nombrepokemon para identificar el pokemon a capturar
     * 
     * @return 
     * Este metodo se encarga de indicar que cuando te quedas sin pokeballs no puedes capturar ningun pokemon y devolvera false
     * tambien indica que si el pokemon a capturar es mew te dira que es casi imposible y devolvera false
     * si no estan capturando a mew y tienes pokeballas te dira capturado y devolvera true capturando al pokemon
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.pakeballs == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.pakeballs--;
            return true;

        }
    }
/**
 * estee metodo sirve para indicar cuando el jugador ha encontrado pokeballs y se suman al inventario con las pokeballs
 * que ya tenia
 */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
/**
 * 
 * @param claveFin
 * este parametro indica el codigo a introducir en el dialogo con un npc para avanzar en el juego
 * @return 
 * Lo que hace el metodo es: cuandoel usuario introduzca una clave que es la correcta le dira el nps has ganado
 * si no le dira Chicos hay que estudiar mas
 */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    public int getPakeballs() {
        return pakeballs;
    }

    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
