package views;

import Models.Persona;

public class ViewConsole {

    public void printPersonsArrays(Persona[] personas){
        for(Persona persona : personas){
            System.out.println(persona + "||");
        }
        System.out.println();
    }

    public void printMessage(String message, boolean main){
        if (main) {
            System.out.println("\n***"+ message+ "***");
        } else {
            System.out.println(message);
        }
    }
}
