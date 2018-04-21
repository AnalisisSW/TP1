package entidades;

/**
 * Clase Triangulo
 * @author Facundo
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    /**
     * Constructor parametrizado
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * Determinar si es triangulo
     * @param lado1
     * @param lado2
     * @param lado3
     * @return
     */
    public boolean esTriangulo(int lado1, int lado2, int lado3){
        return ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2));
    }
    
    /**
     * Determinar que tipo de triangulo es
     * @param lado1
     * @param lado2
     * @param lado3
     * @return String
     */
    public String tipoTriangulo(int lado1, int lado2, int lado3){
        if((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)){
            return "equilatero";
        }else if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            return "isosceles";
        }else
            return "escaleno";
    }

    /**
     * Get Lado
     * @return
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * Set Lado
     * @param lado1
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * Get Lado2
     * @return
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * Set Lado2
     * @param lado2
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * Get lado3
     * @return
     */
    public int getLado3() {
        return lado3;
    }

    /**
     * Set lado3
     * @param lado3
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
}
