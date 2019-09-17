public class Aluno {
    private String nome;
    private String cpf;
    private Data dataDeNascimento;
    
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public void setDataDeNascimento(Data d){
        this.dataDeNascimento = d;
    }
    public String imprimir(){
        String dados = this.nome + "\n" + this.cpf + "\n" + this.dataDeNascimento.imprimir();
        return dados;
    }
}
