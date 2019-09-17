public class TestaPorta {
    public static void main(String[] args){
        Porta porta = new Porta();
        porta.setDimensaoX(1.1);
        porta.setDimensaoY(1.9);
        porta.setDimensaoZ(0.7);
        porta.setCor("Vermelha");
        porta.setAberta(true);        
        System.out.println("Informações iniciais: " + "\n" + "Dimensoes X, Y e Z: " + porta.getDimensaoX() + "," + porta.getDimensaoY() + ","
        + porta.getDimensaoZ() + "\n" + "Cor: " + porta.getCor());  
        
        if(porta.estaAberta() == true){
            System.out.println("A porta esta aberta.");            
        }
        else{
            System.out.println("A porta esta fechada.");
        }
        
        porta.Fecha();
        
        if(porta.estaAberta() == true){
            System.out.println("A porta esta aberta.");            
        }
        else{
            System.out.println("A porta esta fechada.");
        }
        
        porta.setDimensaoX(1.4);
        porta.setDimensaoY(2.4);
        porta.setDimensaoZ(0.9);
        porta.pinta("Azul");
        porta.pinta("Verde");
        porta.pinta("Amarela");
        
        porta.Abre();
       
        System.out.println("Informações depois de trocadas: " + "\n" + "Dimensoes X, Y e Z: " + porta.getDimensaoX() + "," + porta.getDimensaoY() + ","
        + porta.getDimensaoZ() + "\n" + "Cor: " + porta.getCor());  
        
        if(porta.estaAberta() == true){
            System.out.println("A porta esta aberta.");            
        }
        else{
            System.out.println("A porta esta fechada.");
        }
        
        
        
        
    }
}
