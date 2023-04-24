abstract class  OperacionesMatematicasImple implements OperacionMatematica {


    @Override
    public double sumar(double a, double b) {
        return a+b;
    }

    @Override
    public double restar(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) throws Exception {
        if (b == 0) {
            throw new RuntimeException("No se puede dividir por cero");
        }
        return a/b;
    }
}
