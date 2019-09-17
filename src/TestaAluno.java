public class TestaAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        Data data_a1 = new Data();
        a1.setCPF("000.111.222.33");
        a1.setNome("Blue");
        data_a1.setDia(24);
        data_a1.setMes(4);
        data_a1.setAno(2000);
        a1.setDataDeNascimento(data_a1);
        
        String dados = a1.imprimir();
        System.out.println(dados);
        
    }
}
