public class Casa {
    private String cor;
    private boolean aberta;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    public String getCor(){
        return this.cor;
    }
    public boolean isAberta(){
        return this.aberta;
    }
    public Porta getPorta1(){
        return this.porta1;
    }
    public Porta getPorta2(){
        return this.porta2;
    }
    public Porta getPorta3(){
        return this.porta3;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public void setAberta(boolean a){
        this.aberta = a;
    }
    public void setPorta1(Porta a){
        this.porta1 = a;
    }
    public void setPorta2(Porta b){
        this.porta2 = b;
    }
    public void setPorta3(Porta c){
        this.porta3 = c;
    }
    public void pinta(String s){
        this.cor = s;
    }
    public void Abre(){
        this.aberta = true;
    }
    public void Fecha(){
        this.aberta = false;
    }
    
    
    public int quantasPortasEstaoAbertas(){
        int cont = 0;        
        if(porta1.isAberta() == true){
            cont++;
        }
        if(porta2.isAberta() ==  true){
            cont++;
        }
        if(porta3.isAberta() == true){
            cont++;
        }
        return cont;}
    }