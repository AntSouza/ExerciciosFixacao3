public class TestaEsfera {
    public static void main(String[] args){
        Esfera esfera = new Esfera();
        esfera.setRaio(5.0);
        double resultado = esfera.volume(esfera.getRaio());
        System.out.println("Uma esfera de raio " + esfera.getRaio() + " tem " + resultado + " de volume em cm³");
    }
}
