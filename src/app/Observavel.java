/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexandre.hauffe
 */
public abstract class Observavel {
    private List<Observador> observadores = new ArrayList<>();
    
    public void Anexar(Observador obs){
        observadores.add(obs);
    }
    
    public void desanexar(Observador obs){
        observadores.remove(obs);
    }
    public void notificar(){
        for(Observador obs : observadores){
            obs.atualizar();
        }
    }
}
