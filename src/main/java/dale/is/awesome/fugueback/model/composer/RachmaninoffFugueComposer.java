
package dale.is.awesome.fugueback.model.composer;

import dale.is.awesome.fugueback.model.FugueComposer;
import dale.is.awesome.fugueback.model.FugueMusic;
import dale.is.awesome.fugueback.model.music.BasicMusic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author daleapplegate
 */
public class RachmaninoffFugueComposer implements FugueComposer {

    private List<String> sheet = new ArrayList<>();
    private HashMap<String, String> trans = new HashMap<>();
    private static Integer lastNote = 4;
    public RachmaninoffFugueComposer() {
        sheet.add("V0 I[Piano] Dq Eq | Cqqq Dq");
        sheet.add("V0 I[Piano] Dq Eq | Eqqq Dq");
        sheet.add("V0 I[Piano] Dq Eq | Gqqq Dq");
        sheet.add("V0 I[Piano] Dq Eq | Dqqq Dq");
        sheet.add("V0 I[Piano] Cq Bq | Bqqq Dq");
        sheet.add("V0 I[Piano] Dq Bq | Aqqq Dq");
        sheet.add("V0 I[Piano] Dq Eq | Fqqq Dq");
        
        
    }
    @Override
    public FugueMusic compose(int instrument, String loggerName, String logString) {
        Integer thisNote = logString.length();
        if(thisNote > 6) 
            thisNote = thisNote%7;
        
        if (lastNote.equals(thisNote)){
            if (thisNote.equals(0))
                thisNote = 6;
            else
                thisNote--;
        }
        lastNote = thisNote;
        
        return new BasicMusic(sheet.get(thisNote));
        
    }
    
    @Override
    public boolean isComposer(String composerName) {
        return "Rachmaninoff".equalsIgnoreCase(composerName);
    }
    
}
