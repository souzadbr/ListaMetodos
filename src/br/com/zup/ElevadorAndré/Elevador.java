package br.com.zup.ElevadorAndré;

public class Elevador {
    int andarAtual =0;
    int totalDeAndares;
    int capacidadeElevador;
    int quantPessoasPresentes;

    public Elevador(int andarAtual, int totalDeAndares, int capacidadeElevador, int quantPessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.quantPessoasPresentes = quantPessoasPresentes;

    }

    public void entra(int qtdPessoa) {
        int totalViajantes = qtdPessoa + quantPessoasPresentes;
        if (totalViajantes> capacidadeElevador) {
            System.out.println(" O elevador nao comporta a quantidade");
            System.out.println("Quantidade de pessoas excedeu " + (totalViajantes - capacidadeElevador));
        } else {
            quantPessoasPresentes = totalViajantes;
        }
    }

    public void sai(int qtdPessoa) {
        int totalViajantes = quantPessoasPresentes - qtdPessoa;

        if(totalViajantes < 0){
            System.out.println("O elevador esta vazio!");
        }else{
            quantPessoasPresentes = totalViajantes;

        }
    }

    public void sobe(int qtdAndarSubir) {
        int subirAndar = andarAtual + qtdAndarSubir;

        if(subirAndar>totalDeAndares){
            System.out.println("Você está no limite de andares!Não existem mais andares acima!");
        }else {
            andarAtual = subirAndar;
            System.out.println("Você subiu "+qtdAndarSubir+" andares e está no andar " + andarAtual);
        }

    }

    public void desce(int qtdAndaresDescer) {
        int descerAndar = andarAtual - qtdAndaresDescer;
       if (descerAndar > totalDeAndares){
           System.out.println("Você não pode descer uma quantidade maior de andares do que existem no predio!Não temos subsolo!");
       }else{
           andarAtual = descerAndar;
           System.out.println("Você DESCEU "+ qtdAndaresDescer+ " andares e está no andar "+andarAtual);
       }
    }
}
