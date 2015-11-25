
package dale.is.awesome.fugueback.player;
import dale.is.awesome.fugueback.model.FugueMusic;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jfugue.player.Player;
/**
 *
 * @author daleapplegate
 */
public class SyncFuguePlayer implements FuguePlayer {
    
    
    protected ExecutorService executor = Executors.newCachedThreadPool();
    
    @Override
    public void play(FugueMusic music) {
        executor.submit(new CallablePlayer(music.getFugueString()));
    }

    @Override
    public void stop() {
        executor.shutdownNow();
    }
    
    protected class CallablePlayer implements Callable<String>{
        protected Player player = new Player();
        String music;
        
        public CallablePlayer(String music) {
            this.music = music;
        }

        @Override
        public String call() throws Exception {
            player.play(music);
            return music;
        }
        
    }

}
