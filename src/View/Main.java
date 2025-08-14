package View;

import Model.*;

public class Main {
    public static void main(String[] args){

    Voo voo1 = new Voo("1", "Guarulhos", "Canadá", 180 );
    voo1.realizarReserva(2);
    voo1.verificarDisponibilidade(50);
    voo1.realizarPagamento("ida e volta", true);
    voo1.imprimirPassagem();

    System.out.println(" ");

    Voo voo2 = new Voo("2", "Galeão", "Lisboa", 200);
    voo2.realizarReserva(200);
    voo2.verificarDisponibilidade(1);
    voo2.realizarPagamento("ida", false);
    voo2.imprimirPassagem();

    System.out.println(" ");

    Voo voo3 = new Voo("3", "Praia Grande", "EUA", 190);
    voo3.realizarReserva(200);
    voo3.verificarDisponibilidade(190);
    voo3.realizarPagamento("ida e volta", false);
    voo3.imprimirPassagem();
    System.out.println(" ");

    Aeroporto aeroporto = new Aeroporto();
    aeroporto.adicionarVoo(voo1);
    aeroporto.adicionarVoo(voo2);

    aeroporto.removerVoo(voo3);

    aeroporto.buscarVoo(voo2.getNumeroVoo());
    System.out.println(" ");
    aeroporto.mostrarVoo();

    }
}
