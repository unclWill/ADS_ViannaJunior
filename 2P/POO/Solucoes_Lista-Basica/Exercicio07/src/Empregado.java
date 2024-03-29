public class Empregado {
    private String nome;
    private int idade;
    private int tempoDeServico;

    public Empregado() {
        this.nome = "";
        this.idade = 0;
        this.tempoDeServico = 0;
    }

    public Empregado(String nome, int idade, int tempoDeServico) {
        this.nome = nome;
        this.idade = idade;
        this.tempoDeServico = tempoDeServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(int tempoDeServico) {
        if (tempoDeServico >= 0) {
            this.tempoDeServico = tempoDeServico;
        }
    }

    public String exibeInformacoes() {
        return String.format("Nome: %s %nIdade: %d anos de idade %nTempo de Serviço: %d anos", nome, idade,
                tempoDeServico);
    }

    public boolean verificaSituacaoAposentadoria() {
        return podeAposentarPorIdade() || podeAposentarPorTempoDeServico();
    }

    public boolean podeAposentarPorIdade() {
        return idade >= 65 && tempoDeServico >= 30;
    }

    public boolean podeAposentarPorTempoDeServico() {
        return idade >= 60 && tempoDeServico >= 25;
    }
}