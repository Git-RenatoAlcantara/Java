/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Canvas;
import javax.swing.JFrame;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import view.TelaPrincipal;

/**
 *
 * @author renato
 */
public class MediaPlayer {
   
   private EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent(); 
    private MediaPlayerFactory mpf = new MediaPlayerFactory();
   private TelaPrincipal telaprincipal;
   private  EmbeddedMediaPlayer emp;
   
   
   public MediaPlayer(TelaPrincipal view){
       this.telaprincipal = view;
       emp = mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(view));
    }
   
   public void carregarVideo(Boolean play, String url){
       
        Canvas video =  TelaPrincipal.getCanvas();
       
        this.emp.setVideoSurface(mpf.newVideoSurface(video));
        
        //prepare file to read
        this.emp.prepareMedia(url);
        // reade file
       
        if (play) {
           this.emp.play();
       }else{
            this.emp.stop();
        }
      
   }
   
   public void stopVideo(){
       this.emp.stop();
   }
}
