/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;

/**
 *
 * @author renato
 * 
 *###############################################################################################################
 *#     Classe responsável por obter a lista IPTV vinda do FileReader da classe                                 # 
 *#     "CarragarLista" e tratada pela mesma usando regex, após isso, ela alimenta a classe ListaCanais         #
 *#     para preencher a JTable.                                                                                #
 *###############################################################################################################
 */
public class ArmazenaCanais {
    
    private static ArrayList<String> listaCanais;
    private static ArrayList<String> listaURLCanais;
    
    public ArmazenaCanais(){
        
    }
    
    
    
    public static void setArrayList(ArrayList<String> canais, ArrayList<String> url){
        listaCanais = canais;
        listaURLCanais = url;
    }
    public static ArrayList<String> getListaNomeCanais(){
        return listaCanais;
    }
     
    public static ArrayList<String> getListaURLCanais(){
        return listaURLCanais;
    }
}
