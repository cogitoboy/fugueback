
package dale.is.awesome.fugueback.model;

/**
 *
 * @author daleapplegate
 */
public interface FugueComposer {
    
    public boolean isComposer(String composerName);
    
    public FugueMusic compose(int instrument, String loggerName, String logString);
    
}
