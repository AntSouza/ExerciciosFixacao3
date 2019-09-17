public class Produto {
    private String nome;
    private double preço;
    
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preço;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setPreco(double p){
        this.preço = p;
    }
     public double diminuir10(double p){
         return this.preço*0.9;
     }
     
     public double aumenta25(double p){
         return this.preço*1.25;
     }
}
