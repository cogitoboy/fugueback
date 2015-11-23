
package dale.is.awesome.fugueback.player;
import org.jfugue.player.Player;
/**
 *
 * @author daleapplegate
 */
public class FuguePlayer {
    
    Player player = new Player();
    
    public void play(FugueComposer composer, String logString) {
        player.play(composer.compose(logString));
    }
}
