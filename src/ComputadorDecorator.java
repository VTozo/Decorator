class ComputadorDecorator extends Computador {
    Computador computadorDecorado;

    ComputadorDecorator(Computador computadorDecorado) {
        this.computadorDecorado = computadorDecorado;
    }

    void draw() {
    }
}
