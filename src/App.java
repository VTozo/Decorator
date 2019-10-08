class App {
    public static void main(String[] args) {

        Computador computadorDecorado = new ComputadorSimples(ConsoleColors.BLUE);
        computadorDecorado = new DecoradorTeclado(computadorDecorado, ConsoleColors.RED);
        computadorDecorado = new DecoradorMouse(computadorDecorado, ConsoleColors.YELLOW);

        computadorDecorado.draw();

        Computador computadorDecorado_2 = new ComputadorSimples(ConsoleColors.GREEN);
        computadorDecorado_2 = new DecoradorTeclado(computadorDecorado_2, ConsoleColors.BLUE);
        computadorDecorado_2 = new DecoradorMouse(computadorDecorado_2, ConsoleColors.RED);

        computadorDecorado_2.draw();

        Computador computadorDecorado_3 = new ComputadorSimples();
        computadorDecorado_3 = new DecoradorTeclado(computadorDecorado_3);
        computadorDecorado_3 = new DecoradorMouse(computadorDecorado_3);

        computadorDecorado_3.draw();

    }
}
