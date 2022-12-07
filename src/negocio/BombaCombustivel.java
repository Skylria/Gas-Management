/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author juliana
 */
public class BombaCombustivel {
    private String tipo;
    private double precoLitro;
    private double quantidadeAtual;
    private double quantidadeVendida;
    private double valorVendido;
    
    public BombaCombustivel(String t, double pL, double qA){
        tipo = t;
        precoLitro = pL;
        quantidadeAtual = qA;
        double quantidadeVendida = 0;
        double valorVendido = 0;
    }
    
    public boolean abasteceCliente(double l){
        //Retorna true se a quantidade atual na bomba é suficiente para 
        //abastecer, isto é, se o valor de l é menor ou igual a quantidadeAtual. 
        if(l <= quantidadeAtual ) {
            //Diminui a quantidade atual de litros do tanque subtraindo a 
            //quantidade atual pela quantidade pedida pelo cliente e retorna true. 
            this.quantidadeAtual -= l;

            //Incrementa quantidadeVendida adicionando o valor abastecido.
            this.quantidadeVendida=l;

            //Incrementa valorVendido com a quantidade vendida 
            //multiplicada pelo preço do litro.
            double vendidoAtual = quantidadeVendida * precoLitro;
            this.quantidadeVendida+=l;
            this.valorVendido += vendidoAtual;
        
            return true;
        }
        else{
            return false;
        }  
    }
    
    public void setPrecoAtual(double novoPreco){
        
        //atualiza o preço do litro a partir do valor recebido como parâmetro. 
        this.precoLitro = novoPreco;
    }
    
    public double mediaPreco() {
        //calcula e retorna a média do preço do combustível vendido a partir dos
        //valores de quantidadeVendida e valorVendido. 
        double media = valorVendido / quantidadeVendida;
        return media;
    }
    
    public double getQuantidadeAtual(){
        //retorna a quantidade atual
        return this.quantidadeAtual;
    }
    
    public double getQuantidadeVendida(){   
        //retorna a quantidadeVendida
        return this.quantidadeVendida;
    }
    
    public String getTipo(){
        //retorna o tipo do combustivel
        return this.tipo;
    }
    
    /**retorna uma string cujo conteúdo é formado pela concatenação dos
     * valores dos atributos tipo, preço, quantidade atual, quantidade
     * vendida e o valor vendido, nesta ordem.
     */
    @Override
    public String toString(){ 
       return getTipo() + ", " + this.precoLitro + ", " + getQuantidadeAtual() + ", " + getQuantidadeVendida() + ", " + this.valorVendido;
    }
}
