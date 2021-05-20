/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author renato
 */
public class CanalAtual {
    private static String canalAtual;
    
    public CanalAtual(){
        
    }
    
    public static void setCanal(String canal){
         canalAtual = canal;
    }
    
    public static String getCanal(){
        return canalAtual;
    }
    
    
}
