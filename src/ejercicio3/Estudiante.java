
package ejercicio3;

public class Estudiante extends Persona {
    public void matricularse() {
        System.out.println("Esta es una matricula.");
    }
    
    @Override
    public void presentarse() {
        super.presentarse();
    }
}
