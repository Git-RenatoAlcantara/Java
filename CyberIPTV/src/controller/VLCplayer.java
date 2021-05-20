/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javafx.scene.media.MediaView;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.FullScreenStrategy;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;

/**
 *
 * @author renato
 */
public class VLCplayer implements Runnable{
    public VLCplayer(){

    }
 
    @Override
    public  void run() {
        JFrame frame = new JFrame();
        System.out.println("View aberta");
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MediaPlayerFactory mpf = new MediaPlayerFactory();
         EmbeddedMediaPlayer emp = mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(frame));
        frame.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e) {
                emp.release();
                System.out.println("Fechou!");
                System.exit(0);
            }
         });
        emp.prepareMedia(CanalAtual.getCanal());
        emp.play();
    }
    
  
}
