class DecoradorMouse extends ComputadorDecorator {

    private String cor = ConsoleColors.WHITE;

    DecoradorMouse(Computador computadorDecorada) {
        super(computadorDecorada);
    }

    DecoradorMouse(Computador computadorDecorada, String cor) {
        super(computadorDecorada);
        this.cor = cor;
    }

    public void draw() {
        computadorDecorado.draw();
        drawTeclado();
    }

    private void drawTeclado() {
        System.out.println(cor +
                "                            __|_\n" +
                "                           |____|\n" +
                "                           |    |\n" +
                "                           \\____/" +
                ConsoleColors.RESET
        );
    }

}
