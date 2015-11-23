
package dale.is.awesome.fugueback.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import dale.is.awesome.fugueback.model.FugueComposer;
import dale.is.awesome.fugueback.player.SynchronousFuguePlayer;

/**
 *
 * @author daleapplegate
 */
public class FugueAppender extends AppenderBase<ILoggingEvent> {

    private SynchronousFuguePlayer fuguePlayer = new SynchronousFuguePlayer();
    private FugueComposer fugueComposer = null;
    
    
    public void setComposer(String composer) {
        fugueComposer = FugueComposerFactory.getComposer(composer);
    }

    @Override
    protected void append(ILoggingEvent eventObject) {
        fuguePlayer.play(fugueComposer.compose(eventObject.getFormattedMessage()));
    }
}
