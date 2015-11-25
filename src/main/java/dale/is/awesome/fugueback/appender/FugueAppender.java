
package dale.is.awesome.fugueback.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import dale.is.awesome.fugueback.model.FugueComposer;
import dale.is.awesome.fugueback.player.FuguePlayer;
import dale.is.awesome.fugueback.player.SyncFuguePlayer;

/**
 *
 * @author daleapplegate
 */
public class FugueAppender extends AppenderBase<ILoggingEvent> {

    private FuguePlayer fuguePlayer = new SyncFuguePlayer();
    private FugueComposer fugueComposer = null;
    
    
    public void setComposer(String composer) {
        fugueComposer = FugueComposerFactory.getComposer(composer);
    }

    @Override
    protected void append(ILoggingEvent eventObject) {
        if (eventObject.getMessage().contains(".Exception")) {
            fuguePlayer.play(fugueComposer.compose(123, eventObject.getLoggerName(), eventObject.getMessage()));
        } else if(eventObject.getLoggerName().contains("com.itsoninc"))
            fuguePlayer.play(fugueComposer.compose(0, eventObject.getLoggerName(), eventObject.getMessage()));
        else if(eventObject.getLoggerName().contains("broadleaf"))
            fuguePlayer.play(fugueComposer.compose(10, eventObject.getLoggerName(), eventObject.getMessage()));
        else
           fuguePlayer.play(fugueComposer.compose(115, eventObject.getLoggerName(), eventObject.getMessage()));
    }
    
       @Override
    protected void finalize(){
        fuguePlayer.stop();
    }
}
