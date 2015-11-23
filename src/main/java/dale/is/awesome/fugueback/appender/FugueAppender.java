
package dale.is.awesome.fugueback.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import dale.is.awesome.fugueback.player.BasicFugueComposer;
import dale.is.awesome.fugueback.player.FugueComposer;
import dale.is.awesome.fugueback.player.FuguePlayer;

/**
 *
 * @author daleapplegate
 */
public class FugueAppender extends AppenderBase<ILoggingEvent> {

    
    FuguePlayer fuguePlayer = new FuguePlayer();
    FugueComposer composer = new BasicFugueComposer();
            
            
    @Override
    protected void append(ILoggingEvent eventObject) {
        
        fuguePlayer.play(composer, eventObject.getFormattedMessage());
    }
    
}
