
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)

        };

        vC.printMessage("Personas", true);
        vC.printPersonsArrays(personas);

        vC.printMessage("Personas Ordenadas por edad", true);
        pC.ordenarPorEdad(personas);
        vC.printPersonsArrays(personas);

        vC.printMessage("Buscar persona con edad 40", true);
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB != null) {
            vC.printMessage("La persona con edad 40 es: " + pB, false);
        } else {
            vC.printMessage("No hay persona con esa edad", false);
        }

        vC.printMessage("Buscar persona con edad 90", true);
        Persona p90 = pC.buscarPorEdad(personas, 90);
        if (p90 != null) {
            vC.printMessage("La persona con edad 90 es: " + pB, false);
        } else {
            vC.printMessage("No hay persona con esa edad", false);
        }
    }
}
