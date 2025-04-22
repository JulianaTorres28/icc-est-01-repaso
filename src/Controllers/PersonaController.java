package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        int inicio=0;
        int fin = personas.length-1;
        while (inicio<fin) {
            for( int i = inicio; i< fin; i++){
                if (personas[i].getEdad()>personas[i+1].getEdad()) {
                    Persona aux = personas[i];
                    personas[i]= personas[i+1];
                    personas[i+1]= aux;
                }
            }
            fin--;
        }

    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        for(Persona persona : personas){
            if (persona.getEdad()==edad) {
                return persona;
            }
        }
        return null;
    }
}
