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
public class Tabela implements Observador{
    private final FonteDados fonteDados;
    
    public Tabela(FonteDados fonte){
        this.fonteDados= fonte;
    }
    
    public void desenhar(){
        HashMap<String, Integer> dados;
        dados = fonteDados.obter();
        for(String chave : dados.keySet()){
            System.out.println(
            chave + "-" +dados.get(chave)         
            );
        }
    }

    @Override
    public void atualizar() {
        desenhar();
    }
}
