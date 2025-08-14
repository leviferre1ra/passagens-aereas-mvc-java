package Model;

public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private int assentosDisponiveis;

    public Voo(String numeroVoo, String origem, String destino, int assentosDisponiveis) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void realizarReserva(int quantidadeAssentos){
        if (quantidadeAssentos <= assentosDisponiveis){
            assentosDisponiveis -= quantidadeAssentos;
            System.out.println("Reserva de " + quantidadeAssentos + " assento/s Concluída!");
        } else {
            System.out.println("Não há assentos disponíveis para este número!");
        }
    }

    public void verificarDisponibilidade(int quantidadeAssentos){
        if (quantidadeAssentos <= assentosDisponiveis){
            System.out.println("Há assentos disponíveis!");
        } else {
            System.out.println("Não há assentos disponíveis!");
        }
    }

    private double precoViagem;
    public void realizarPagamento(String tipoViagem, boolean pontosTuristicos){
        if (tipoViagem == "ida" & pontosTuristicos == false){
            precoViagem = 1000.0;
        } else if (tipoViagem == "ida" & pontosTuristicos == true) {
            precoViagem = 1500.0;
        } else if (tipoViagem == "ida e volta" & pontosTuristicos == false){
            precoViagem = 2000.0;
        } else if (tipoViagem == "ida e volta" & pontosTuristicos == true) {
            precoViagem = 2500.0;

        }
    }


    public void imprimirPassagem(){
        System.out.println("Número do voo: " + numeroVoo + " | Origem: " + origem + " | Destino: " + destino + " | Valor da passagem: " + precoViagem + " R$");
    }


    @Override
        public String toString() {
        return "Número: " + numeroVoo + " | Origem: " + origem + " | Destino: " + destino + " | Assentos: " + assentosDisponiveis;
    }
}