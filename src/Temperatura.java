public class Temperatura {    
    public double coverterParaCelsius(double n){
        double c = (n-32)/1.8;
        return c;        
    }   
    
    public double converterParaFahrenheit(double n){
        double f = (n*1.8) + 32;
        return f;         
    }
}
