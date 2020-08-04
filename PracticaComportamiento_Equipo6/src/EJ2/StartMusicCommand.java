/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;


/**
 *
 * @author jorge
 */
public class StartMusicCommand implements Command{

    private Receiver music;

    public StartMusicCommand(Receiver music) {
        this.music = music;
    }
    
    @Override
    public void execute() {
        music.execute();
    }
    
}
