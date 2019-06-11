/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author VSRobot
 */
public class metodosClasse {
    public static void novoMetodo(){
        System.out.println("Mensagem do metodo novo");
    }
    
    public static void multiplicar(int numero1, int numero2){
        int resultado = 0;
        
        resultado = numero1 * numero2;
        System.out.println("Resultado: " + resultado);
    }
    
    public static int multiplicar2(int numero1, int numero2){
        int resultado1 = 0;
        
        resultado1 = numero1 * numero2;
        return resultado1;
    }
}
