
package dale.is.awesome.fugueback.player;

import dale.is.awesome.fugueback.model.FugueMusic;
import org.jfugue.player.Player;

/**
 *
 * @author daleapplegate
 */
public class AsyncFuguePlayer implements FuguePlayer {

    protected Player player = new Player();
    
    @Override
    public void play(FugueMusic music) {
        
         player.play(music.getFugueString());
    }

    @Override
    public void stop() {

    }
    
}
