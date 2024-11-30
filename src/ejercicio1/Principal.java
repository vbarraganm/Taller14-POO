
package ejercicio1;

public class Principal {

    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 8);
        Figura figuragenerica = new Figura();
        
        circulo.calcularArea();
        rectangulo.calcularArea();
        figuragenerica.calcularArea();
    }
}
