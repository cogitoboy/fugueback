
package dale.is.awesome.fugueback.appender;

import dale.is.awesome.fugueback.model.FugueComposer;
import dale.is.awesome.fugueback.model.composer.RachmaninoffFugueComposer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daleapplegate
 */
public class FugueComposerFactory {
    private static List<FugueComposer> fugueComposers = new ArrayList<>();
    
    static {
        fugueComposers.add(new RachmaninoffFugueComposer());
    }
    
    public static FugueComposer getComposer(String composerName) {
        for (FugueComposer fugueComposer: fugueComposers) {
            if (fugueComposer.isComposer(composerName))
                return fugueComposer;
        }
        return fugueComposers.get(0);
    }
}
