public class TestaProduto {
    public static void main(String[] args){
        Produto produto =  new Produto();
        produto.setNome("Blue");
        produto.setPreco(1000);
        System.out.println("Preço inicial do produto: " + produto.getPreco());
        double resultado = produto.diminuir10(produto.getPreco());
        System.out.println("Preço do produto depois da redução de 10%: " + resultado);
        resultado = produto.aumenta25(produto.getPreco());
        System.out.println("Preço do produto depois do aumento de 25%: "+ resultado);        
    }
    
}
