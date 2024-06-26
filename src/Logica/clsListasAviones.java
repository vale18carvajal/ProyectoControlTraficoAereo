/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author valer
 */
public class clsListasAviones {

    private clsListaEnlazada central;
    private clsListaEnlazada vuelo;
    private clsListaEnlazada hangar;
    private clsListaEnlazada pistaDespegue;
    private clsListaEnlazada pistaAterrizaje;

    public clsListasAviones() {
        this.central = new clsListaEnlazada();
    }

    public clsListasAviones (clsListasAviones listaCentral) {
        this.central = listaCentral.getCentral();
        this.vuelo = new clsListaEnlazada();
        this.hangar = new clsListaEnlazada();
        this.pistaDespegue = new clsListaEnlazada();
        this.pistaAterrizaje = new clsListaEnlazada();
    }
    
    //Método que se utiliza la lista central para obtenr la lista creada desde la clase jfrmGenerar aviones
    public clsListaEnlazada getCentral() {
        return central;
    }

    
    //Método que crea la lista central e inicial y método que añade aviones a la lista central desde configuración
    public void aniadirCentral(clsAviones avion) {
        this.central.inserccionFinal(avion);
    }
    
    //Métodos que añaden aviones a las listas desde el módulo de inclusión de aviones (pto 6)
    public void aniadirVuelo(clsAviones avion) {
        this.central.cambiarEstado(avion);
        this.vuelo.inserccionFinal(avion);
        this.vuelo.ordenarAlfabeticamente();
    }
    
    public void aniadirHangar(clsAviones avion) {
        this.central.cambiarEstado(avion);
        this.hangar.inserccionInicio(avion);
    }
    
    public void aniadirPistaDespegue(clsAviones avion){
        this.central.cambiarEstado(avion);
        this.pistaDespegue.inserccionFinal(avion);
    }
    
    public void aniadirPistaAterrizaje(clsAviones avion){
        this.central.cambiarEstado(avion);
        this.pistaAterrizaje.inserccionFinal(avion);
    }
    
 
    //Método de despegue (pto 7) 
    public void despegarAvion() {
        clsAviones avion = this.pistaDespegue.getPrimerAvion();
        if (avion != null) {    //Validamos que el método gerPrimerAvion no nos retorne null
            this.vuelo.inserccionFinal(avion);
            this.vuelo.ordenarAlfabeticamente();
            this.pistaDespegue.borradoInicio();
        }
    }

    //Método de traslado a pista de despegue un avión del hangar (pto 10)
    public void TrasladarAvionPistaDespegue() {
        clsAviones avion = this.hangar.getPrimerAvion(); //Se obtiene el primer avión del hangar porque su insercción es al inicio (Pila)
        if (avion != null) {    //Validamos que el método gerPrimerAvion no nos retorne null
            this.pistaDespegue.inserccionFinal(avion);
            this.hangar.borradoInicio();
        }
    }
    
    //Método de traslado de pista de aterrizaje al hangar (pto 9)
    public void trasladarAvionHangar() {
        clsAviones avion = this.pistaAterrizaje.getPrimerAvion(); //La insercción al hangar es al inicio (Pila)
        if (avion != null) { //Validamos que el método gerPrimerAvion no nos retorne null
            this.hangar.inserccionInicio(avion); 
            this.pistaAterrizaje.borradoInicio();
        }
    }
    
    public void aterrizarAvion(String nombrePiloto) {
        clsAviones avion = this.vuelo.getAvion(nombrePiloto);
        if (avion != null) {
            this.pistaAterrizaje.inserccionFinal(avion);
            this.vuelo.borradoAlMedio(avion);
        }
    }
    
    
   /* //Lo revisamos con el profe el 22 de noviembre, está bien dejarlo así :)
    public void repartoAleatorio() {
        Nodo aux = this.central.getLista();
        int numero = 0;

        while (aux != null) {
            numero = (int) (Math.random() * 4) + 1;
            if (numero == 1) {
                this.vuelo.inserccionFinal(aux.avion);
            } else if (numero == 2) {
                this.hangar.inserccionFinal(aux.avion);
            } else if (numero == 3) {
                this.pistaDespegue.inserccionFinal(aux.avion);
            } else {
                this.pistaAterrizaje.inserccionFinal(aux.avion);
            }

            aux = aux.siguiente;
        }
        this.vuelo.ordenarAlfabeticamente();
    }*/
    
    //Sugerencia profe 22/11/23
    public void repartoAleatorio (){
        int aleatorio; //Variable que define la aleatoriedad de insercción en las listas vuelo-hangar-despegue-aterrizaje.
        clsAviones [] aviones= this.central.obtenerVector();
        for (clsAviones avion : aviones) {
            aleatorio = (int) (Math.random() * 4) + 1;
            
            if (aleatorio == 1) {
                this.vuelo.inserccionFinal(avion);
            } else if (aleatorio == 2){
                this.hangar.inserccionFinal(avion);
            } else if (aleatorio == 3 ){
                this.pistaDespegue.inserccionFinal(avion);
            } else {
                this.pistaAterrizaje.inserccionFinal(avion);
            }
        }
        this.vuelo.ordenarAlfabeticamente();
    }
    
    //Sugerencia profe 22/11/23
    public clsAviones[] obtenerCentral() {
        if (this.central == null) {
            return null;
        } else {
            return this.central.obtenerVector();
        }
    }
    
    public clsAviones[] obtenerAvionesEnVuelo() {
        if (this.vuelo == null) {
            return null;
        } else {
            return this.vuelo.obtenerVector();
        }
    }

    public clsAviones[] obtenerAvionesEnHangar() {
        if (this.hangar == null) {
            return null;
        } else {
            return this.hangar.obtenerVector();
        }
    }

    public clsAviones[] obtenerrAvionesPistaDespegue() {
        if (this.pistaDespegue == null) {
            return null;
        } else {
            return this.pistaDespegue.obtenerVector();
        }
    }

    public clsAviones[] obtenerAvionesPistaAterrizaje() {
        if (this.pistaAterrizaje == null) {
            return null;
        } else {
            return this.pistaAterrizaje.obtenerVector();
        }
    }

    /*//Método termporal para pruebas
    public void imprimirTodo(){
        System.out.println("Aviones en vuelo:");
        this.vuelo.imprimirLista();
        System.out.println("Aviones en hangar:");
        this.hangar.imprimirLista();
        System.out.println("Aviones en pista de despegue:");
        this.pistaDespegue.imprimirLista();
        System.out.println("Aviones en pista de aterrizaje:");
        this.pistaAterrizaje.imprimirLista();
        System.out.println("Central de aviones:");
        this.central.imprimirLista();
    }*/

}
