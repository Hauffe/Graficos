/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author alexandre.hauffe
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FonteDados fonte;
        fonte = new FonteDados();
        fonte.adicionar("Maçã", 10);
        fonte.adicionar("Banana", 20);
        fonte.adicionar("Kiwi", 30);
        
        Tabela tabela = new Tabela(fonte);
        GraficoBarra grafico = new GraficoBarra(fonte);
        
        fonte.Anexar(tabela);
        fonte.Anexar(grafico);
        
        fonte.adicionar("Abacaxi", 40);
    }
    
}
