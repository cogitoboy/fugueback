
package dale.is.awesome.fugueback.player;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jfugue.player.Player;
/**
 *
 * @author daleapplegate
 */
public class FuguePlayer {
    
    Player player = new Player();
    ExecutorService executor = Executors.newCachedThreadPool();
    private static int delay = 0;
    
    public void play(FugueComposer composer, String logString) {
        executor.submit(new CallablePlayer(composer.compose(logString)));
        
    }
    
    public class CallablePlayer implements Callable{
        
        String note;
        public CallablePlayer(String note) {
            this.note = note;
        }

        @Override
        public Object call() throws Exception {
            player.play(note);

            return null;
        }
        
    }

}
