/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Util.ArmazenaCanais;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author renato
 */
public class CarregarLista {
    
    private String      fullPath;
    ArrayList<String> listaNomesCanais = new ArrayList();
    ArrayList<String> listaUrlCanais = new ArrayList();
    
    public CarregarLista(String path) {
        this.fullPath = path;
    }
      public void abrir(){
         
        
        String leitura = "";
        String stringCanais = "";
        String stringURLs = "";
        
        try {
           FileReader arquivo = new FileReader(this.fullPath);
           BufferedReader lerArq = new BufferedReader(arquivo);
           leitura = lerArq.readLine();
           
           while(leitura != null){
               //(#EXTINF:-1 tvg-logo="(.*)")\sgroup-title="(.*)",(.*\n)
              //"(^#EXTINF:-1 tvg-logo=\"(.*)\")\\s(group-title=\"(.*)\"),(.*)(\\n.*)"
              // stringCanais = findRegex(leitura, "(group\\-title=\".*\"),(.*)", 2);
              // System.out.println(leitura);
               stringCanais = findRegex(leitura, "(^#EXTINF:-1 tvg-logo=\"(.*)\")\\s(group-title=\"(.*)\"),(.*)", 5);
               stringURLs   = findRegex(leitura, "^http:\\/\\/(.*)|^https:\\/\\/(.*)", 0); 
    
               
               if (!stringCanais.isEmpty()) {
                   this.listaNomesCanais.add(stringCanais);
               }
               
               if (!stringURLs.isEmpty()) {
                   this.listaUrlCanais.add(stringURLs);
               }
               
               leitura = lerArq.readLine();
           }
            
          ArmazenaCanais.setArrayList(listaNomesCanais, listaUrlCanais);
           
        } catch (IOException ex) {
            Logger.getLogger(CarregarLista.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: "+ ex.getMessage());
        }
        
        
    }
     
     private String findRegex(String texto, String regex, int index){
        
        String retorno = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        if (matcher.find())
        {
           retorno = matcher.group(index);
        }
        
        return retorno;
     }
    
     
   
}
