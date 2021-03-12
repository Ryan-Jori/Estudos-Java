package basico;

class prod{

    int cod;
    String nome;
    String data;
    float preco;

    String getPriceReais(){
        return String.format("R$ %.2f", this.preco);
    }
}