/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author valer
 */
public class clsListaEnlazada {
    private Nodo Lista;
    
    public clsListaEnlazada() {
        this.Lista = null;
    }
    
    //Las listas siempre están ordenadas del avión más próximo a trasladarse/salir hasta el menos próximo (a excepción de los aviones en vuelo)
    public clsAviones getPrimerAvion(){
        if (this.Lista != null) {
            return this.Lista.avion;
        } else {
            return null;
        }
    }
    
    //Se utiliza para el aterrizaje de un avión
    public clsAviones getAvion(String nombre) {
        try {
            if (this.Lista == null) {
                return null;
            } else {
                Nodo aux = this.Lista;
                while (aux.avion.getNombrePiloto() != nombre){
                    aux = aux.siguiente;
                }
                return aux.avion;
            }
        } catch (Exception e) {
            System.err.println("Error");
            return null;
        }
    }
    
    //Métodos de insercción
    public boolean inserccionInicio(clsAviones avion) {
        Nodo nuevo = new Nodo();
        nuevo.avion = avion;
        nuevo.siguiente = null;

        try {
            if (this.Lista == null) {
                this.Lista = nuevo;
                return true;
            } else {
                nuevo.siguiente = this.Lista;
                this.Lista = nuevo;
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error");
            return false;
        }
    }

    public boolean inserccionFinal(clsAviones avion) {
        Nodo nuevo = new Nodo();
        nuevo.avion = avion;
        nuevo.siguiente = null;

        try {
            if (this.Lista == null) {
                this.Lista = nuevo;
                return true;
            } else {
                Nodo aux = this.Lista;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error");
            return false;
        }
    }
    
    //Métodos de borrado
    public boolean borradoInicio() {
        try {
            if (this.Lista == null) {
                return false;
            } else {
                this.Lista = this.Lista.siguiente;
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error");
            return false;
        }
    }
    
    public boolean borradoFinal () {
        try {
            if (this.Lista == null) {
                return false;
            } else {
                Nodo aux = this.Lista;
                
                while(aux.siguiente.siguiente != null){
                    aux = aux.siguiente;
                }
                aux.siguiente = null;
                return true;
            }
        } catch (Exception e){
            System.err.println("Error");
            return false;
        }
    }
    
    public boolean borradoAlMedio(clsAviones avion) {
        try {
            if (this.Lista == null) {
                return false;
            } else {
                //Se valida si se debe hacer un borrado al inicio
                if (this.Lista.avion == avion) {
                    borradoInicio();
                    return true;
                } else {
                    Nodo aux = this.Lista;
                    while (aux.siguiente.avion != avion) {
                        aux = aux.siguiente;
                    }
                    //Se valida si se debe hacer un borrado al medio o al final
                    if (aux.siguiente.siguiente != null) {
                        aux.siguiente = aux.siguiente.siguiente;
                        return true;
                    } else {
                        borradoFinal();
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error");
            return false;
        }
    }
    
    
    //Algoritmo de ordenamiento burbuja
    public void ordenarAlfabeticamente() {
        if (this.Lista != null) { // Validamos que la lista no se encuentre vacía.
            if (this.Lista.siguiente != null) { //Validamos que la lista tenga más de un elemento, para hacer una revisión y ordenar.
                boolean intercambiado = true; //Esta variable nos indica si ha ocurrido un intercambio para seguir revisando si hay que hacer más intercambios
                while (intercambiado) {
                    intercambiado = false;
                    Nodo aux = this.Lista;
                    while (aux.siguiente != null) {
                        if (aux.avion.getNombrePiloto().compareToIgnoreCase(aux.siguiente.avion.getNombrePiloto()) > 0) {
                            //Intercambio de valores de los nodos
                            clsAviones temporal = aux.avion; //temporalmente se almacena el valor del primer nodo
                            aux.avion = aux.siguiente.avion; //Se cambia el valor del segundo nodo por el que sigue
                            aux.siguiente.avion = temporal; //el segundo nodo se le cambia el valor por el valor anterior.
                            intercambiado = true;
                        }

                        aux = aux.siguiente;
                    }
                }
            }
        }
    }
    
    //Sugerencia del profesor (22/11/23) para obtener tamaño y crear vector que sirva de lectura para recorrer la lista fuera del TAD.
    public int obtenerTamanio() {
        try {
            if (this.Lista == null) {
                return 0;
            } else {
                Nodo aux = this.Lista;
                int tamanio = 0;
                while (aux != null) {
                    tamanio++;
                    aux = aux.siguiente;
                }
                return tamanio;
            }
        } catch (Exception e) {
            System.err.println("Error");
            return 0;
        }
    }
    
    public clsAviones [] obtenerVector (){
        if (this.Lista == null) {
            return null;
        } else {
            Nodo aux = this.Lista;
            clsAviones [] aviones = new  clsAviones[obtenerTamanio()];
            int indice = 0;
            while (aux != null){
                clsAviones avion = aux.avion;
                aviones [indice] = avion;
                aux = aux.siguiente;
                indice++;
            }
            
            return aviones;
        }
    }
    
    //Método para cambiar el valor del estado de un avion en una lista. Ocurrirá cuando una avión de estar inactivo en la lista central
    public void cambiarEstado(clsAviones avion){
        Nodo aux = this.Lista;
        while (aux != null) {            
            if (aux.avion.getNombrePiloto() == avion.getNombrePiloto()) {
                aux.avion.setActivo(true);
            }
            aux = aux.siguiente;
        }
    }
    
    /*//El siguiente método de impresión es para pruebas
    public void imprimirLista (){
        Nodo aux = this.Lista;
        
        while (aux != null) {            
            System.out.println(aux.avion.getModelo() + "\t" + aux.avion.getCantidadPasajeros() +
                    "\t" + aux.avion.getCantidadSobrecargos()+ "\t" + aux.avion.getNombrePiloto() +  "\t" + aux.avion.isActivo());
            aux = aux.siguiente;
        }
    }*/
}
