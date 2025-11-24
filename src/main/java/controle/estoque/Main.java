package controle.estoque;

import controle.estoque.menu.Menu;

public class Main {
    public static void main(String[] args) {

        System.out.println(" SISTEMA DE CONTROLE DE ESTOQUE ");

        Menu menu = new Menu();
        menu.iniciar();

        System.out.println("Programa finalizado.");
    }
}
