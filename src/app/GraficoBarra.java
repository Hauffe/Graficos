/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.HashMap;

/**
 *
 * @author alexandre.hauffe
 */
public class GraficoBarra implements Observador{

    private final FonteDados fonteDados;
    public GraficoBarra(FonteDados fonte) {
        this.fonteDados = fonte;
    }
    
    public void Plotar(){
        HashMap<String, Integer> dados;
        dados = fonteDados.obter();
        for(String chave : dados.keySet()){
            Integer dado;
            dado = fonteDados.obter().get(chave);
            System.out.print(chave + "-");
            for(int i = 0; i < dado; i++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    @Override
    public void atualizar() {
        Plotar();
    }
    
}
