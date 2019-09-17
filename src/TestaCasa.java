public class TestaCasa {
    public static void main(String[] args){
        Casa casa = new Casa();
        Porta porta1 =  new Porta();
        Porta porta2 =  new Porta();
        Porta porta3 =  new Porta();
        casa.setCor("Azul");
        porta1.setDimensaoX(1.3);
        porta1.setDimensaoY(1.5);
        porta1.setDimensaoZ(0.3);
        porta1.setAberta(true);
        porta2.setDimensaoX(1.5);
        porta2.setDimensaoY(1.7);
        porta2.setDimensaoZ(0.9);
        porta2.setAberta(true);
        porta3.setDimensaoX(1.9);
        porta3.setDimensaoY(1.6);
        porta3.setDimensaoZ(0.4);
        porta3.setAberta(true);
        casa.setPorta1(porta1);
        casa.setPorta2(porta2);
        casa.setPorta3(porta3);
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
