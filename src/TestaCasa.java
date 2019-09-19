public class TestaCasa {
    public static void main(String[] args){        
        Porta porta1 =  new Porta(true, "Azul", 1.3, 1.5, 0.3);
        Porta porta2 =  new Porta(true, "Branco", 1.5, 1.7, 0.9);
        Porta porta3 =  new Porta(true, "Rosa", 1.9, 1.6, 0.4);
        Casa casa = new Casa(true, porta1, porta2, porta3);
        casa.pinta("Azul");
        
        System.out.println("Cor inicial da casa: " + casa.getCor() + "\n" + "Quantas portas estao abertas: " + casa.quantasPortasEstaoAbertas());
        casa.pinta("Rosa");
        porta1.Fecha();
        porta2.Fecha();
        System.out.println("Cor depois da primeira mudança: " + casa.getCor() + "\n" 
         + "Quantas portas estao abertas agora: " + casa.quantasPortasEstaoAbertas());
        
        porta3.Fecha();
        casa.pinta("Branco");
        System.out.println("Cor depois da segunda mudança: " + casa.getCor() + "\n" 
         + "Quantas portas estao abertas agora: " + casa.quantasPortasEstaoAbertas());
    }
}
