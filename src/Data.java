public class Data {
    private int dia;
    private int mes;
    private int ano;  
    
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public void setDia(int d){
        this.dia = d;
    }
    public void setMes(int m){
        this.mes = m;
    }
    public void setAno(int a){
        this.ano = a;
    }
    public String imprimir(){
        String data = this.dia + "/" + this.mes + "/" + this.ano;
        return data;
    }
}
