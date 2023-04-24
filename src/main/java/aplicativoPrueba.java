public class aplicativoPrueba {

    public static void main(String[] args) {
        OperacionMatematica suma = new Suma();
        OperacionMatematica resta = new Resta();
        OperacionMatematica multiplicacion = new Multiplicacion();
        OperacionMatematica division = new Division();

        double numero1 = 20;
        double numero2 = 0;

        double resultado = suma.sumar(numero1, numero2);
        System.out.println("La Suma de " + numero1 + " y " + numero2 + " es " + resultado);

        resultado = resta.restar(numero1, numero2);
        System.out.println("La Resta de " + numero1 + " y " + numero2 + " es " + resultado);

        resultado = multiplicacion.multiplicar(numero1, numero2);
        System.out.println("La Multiplicación de " + numero1 + " y " + numero2 + " es " + resultado);

        try {
            resultado = division.division(numero1, numero2);
            System.out.println("La División de " + numero1 + " y " + numero2 + " es " + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
