class ComputadorSimples extends Computador {

    private String cor = ConsoleColors.WHITE;

    ComputadorSimples() {
    }

    ComputadorSimples(String cor) {
        this.cor = cor;
    }

    public void draw() {
        System.out.println(cor +
                "       .--.\n" +
                "       |__| .-------.\n" +
                "       |=.| |.-----.|\n" +
                "       |--| ||     ||\n" +
                "       |  | |'-----'|\n" +
                "       |__|~')_____('" +
                ConsoleColors.RESET
        );
    }
}
