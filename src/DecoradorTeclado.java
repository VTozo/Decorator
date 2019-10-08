class DecoradorTeclado extends ComputadorDecorator {

    private String cor = ConsoleColors.WHITE;

    DecoradorTeclado(Computador computadorDecorado) {
        super(computadorDecorado);
    }

    DecoradorTeclado(Computador computadorDecorado, String cor) {
        super(computadorDecorado);
        this.cor = cor;
    }

    public void draw() {
        computadorDecorado.draw();
        drawTeclado();
    }

    private void drawTeclado() {
        System.out.println(cor +
                "     __________________\n" +
                "  _-'----.-.-..-.---.--`-_\n" +
                " --------------------------" +
                ConsoleColors.RESET
        );
    }

}
