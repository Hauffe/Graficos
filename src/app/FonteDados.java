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
public class FonteDados extends Observavel{
    private HashMap<String, Integer>
            dados = new HashMap<>();
    
    public void adicionar(String chave, Integer valor){
        dados.put(chave, valor);
        notificar();
    }
    public HashMap<String, Integer> obter(){
        return dados;
    }
    
}
