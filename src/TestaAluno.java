public class TestaAluno {
    public static void main(String[] args){        
        Data data_a1 = new Data(24,4,2000);
        Aluno a1 = new Aluno("Blue","000.111.222.33",data_a1);
        String dados = a1.imprimir();
        System.out.println(dados);
        
    }
}
