package br.com.zup.EncapsulamentoExercicio2;

public class Elevador_Encap {
    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidadeElevador;
    private int quantPessoasPresentes;

    public Elevador_Encap(int andarAtual, int totalDeAndares, int capacidadeElevador, int quantPessoasPresentes) {
        this.capacidadeElevador = capacidadeElevador;
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.quantPessoasPresentes = quantPessoasPresentes;
    }

    public int getTotalDeAndares(){
        return totalDeAndares;
    }
    public int getAndarAtual(){
        return andarAtual;
    }
    public int getCapacidadeElevador(){
        return capacidadeElevador;
    }
    public int getQuantPessoasPresentes(){
        return quantPessoasPresentes;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public void setQuantPessoasPresentes(int quantPessoasPresentes) {
        this.quantPessoasPresentes = quantPessoasPresentes;
    }

    public void entra(int qtdPessoa) {
        int totalViajantes = qtdPessoa + getQuantPessoasPresentes();
        if (totalViajantes> getCapacidadeElevador()) {
            System.out.println(" O elevador nao comporta a quantidade");
            System.out.println("Quantidade de pessoas excedeu " + (totalViajantes - capacidadeElevador));
        } else {
            setQuantPessoasPresentes(totalViajantes);
        }
    }

    public void sai(int qtdPessoa) {
        int totalViajantes = getQuantPessoasPresentes() - qtdPessoa;

        if(totalViajantes < 0){
            System.out.println("O elevador esta vazio!");
        }else{
            setQuantPessoasPresentes(totalViajantes);

        }
    }

    public void sobe(int qtdAndarSubir) {
        int subirAndar = getAndarAtual() + qtdAndarSubir;

        if(subirAndar>getTotalDeAndares()){
            System.out.println("Voc?? est?? no limite de andares!N??o existem mais andares acima!");
        }else {
            andarAtual = subirAndar;
            System.out.println("Voc?? subiu "+qtdAndarSubir+" andares e est?? no andar " + andarAtual);
        }

    }

    public void desce(int qtdAndaresDescer) {
        int descerAndar = getAndarAtual() - qtdAndaresDescer;
        if (descerAndar > getTotalDeAndares()){
            System.out.println("Voc?? n??o pode descer uma quantidade maior de andares do que existem no predio!N??o temos subsolo!");
        }else{
            andarAtual = descerAndar;
            System.out.println("Voc?? desceu "+ qtdAndaresDescer+ " andares e est?? no andar "+andarAtual);
        }
    }


}