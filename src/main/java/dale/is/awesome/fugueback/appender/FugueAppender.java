
package dale.is.awesome.fugueback.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

/**
 *
 * @author daleapplegate
 */
public class FugueAppender extends AppenderBase<ILoggingEvent> {

    @Override
    protected void append(ILoggingEvent eventObject) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
