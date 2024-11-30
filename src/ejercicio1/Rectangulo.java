
package ejercicio1;

public class Rectangulo extends Figura {
    // Propiedades
    private double longitud;
    private double ancho;
    
    // Constructor
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }
    
    // Método abstracto sobreescrito
    @Override
    public void calcularArea() {
        double area = longitud * ancho;
        System.out.println("El área del rectángulo es: " + area);
    }
}
