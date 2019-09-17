public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    public boolean isAberta(){
        return this.aberta;
    }
    public String getCor(){
        return this.cor;
    }
    public double getDimensaoX(){
        return this.dimensaoX;
    }
    public double getDimensaoY(){
        return this.dimensaoY;
    }
    public double getDimensaoZ(){
        return this.dimensaoZ;
    }
    public void setAberta(boolean a){
        this.aberta = a;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public void setDimensaoX(double x){
        this.dimensaoX = x;
    }
    public void setDimensaoY(double y){
        this.dimensaoY = y;
    }
    public void setDimensaoZ(double z){
        this.dimensaoZ = z;
    }
    public void Abre(){
         this.aberta = true;
    }
    public void Fecha(){
         this.aberta = false;
    }
    public void pinta(String s){
        this.cor = s;
    }
    public boolean estaAberta(){
        if(this.aberta == true){
            return true;            
        }
        else 
            return false;
    }
}
