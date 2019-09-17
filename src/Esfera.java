public class Esfera {
   private double raio;
   
   public double getRaio(){
       return this.raio;
   }
   public void setRaio(double r){
       this.raio = r;
   }
   
   public double volume(double r){
       return (4*3.14*this.raio*this.raio*this.raio)/3;
   }
}
