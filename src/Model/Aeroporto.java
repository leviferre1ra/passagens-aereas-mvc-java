package Model;

import java.util.ArrayList;

public class Aeroporto {
    private ArrayList<Voo> voos;

    public Aeroporto() {
        this.voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo numeroVoo){
        voos.add(numeroVoo);
    }

    public void removerVoo(Voo numeroVoo){
        voos.remove(numeroVoo);
    }

    public void buscarVoo(String numeroVoo){
        boolean encontrado = false;

        for (Voo v : voos){
            if (v.getNumeroVoo().equals(numeroVoo)) {
                System.out.println("Voo encontrado: " + v);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.println("Voo não encontrado!");
        }
    }

    public void mostrarVoo(){
        for (Voo v : voos) {
            System.out.println("Voos disponíveis: " + v);
        }
    }

}