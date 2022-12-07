package negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juliana
 */
public class TesteBomba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel("gasolina", 5.5, 200);
        BombaCombustivel bomba2 = new BombaCombustivel("alcool", 3.8, 100);
        
        System.out.println(bomba1.toString());
        System.out.println(bomba2.toString());
        
        bomba1.abasteceCliente(201);
        System.out.println(bomba1.toString());
        bomba1.abasteceCliente(100);
        System.out.println(bomba1.toString());
        
        bomba1.setPrecoAtual(6.0);
        bomba1.abasteceCliente(100);
        System.out.println(bomba1.toString());
        System.out.println(bomba1.mediaPreco());
    }
    
}
