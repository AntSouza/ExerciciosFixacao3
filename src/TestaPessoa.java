public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.setNome("Red");
        p1.setIdade(19);
        System.out.println("Idade inicial:" + p1.getIdade());
        p1.fazAniversario(p1.getIdade());
        System.out.println("Depois do primeiro aniversario: " + p1.getIdade());
        for(int i = 0; i < 4; i++){
             p1.fazAniversario(p1.getIdade());
        }
        System.out.println("Depois de mais 4 aniversarios: " + p1.getIdade());
    }
    
}
