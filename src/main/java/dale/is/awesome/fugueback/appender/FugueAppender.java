
package dale.is.awesome.fugueback.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import dale.is.awesome.fugueback.player.LogPlayer;

/**
 *
 * @author daleapplegate
 */
public class FugueAppender extends AppenderBase<ILoggingEvent> {

    private LogPlayer player = new LogPlayer();
    @Override
    protected void append(ILoggingEvent eventObject) {
        player.play(eventObject.getMessage());
    }
    
}
