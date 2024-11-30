
package ejercicio1;

public class Circulo extends Figura {
    // Propiedades
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // Método sobreescrito
    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}
