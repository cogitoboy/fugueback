
package dale.is.awesome.fugueback.model.music;

import dale.is.awesome.fugueback.model.FugueMusic;

/**
 *
 * @author daleapplegate
 */
public class BasicMusic implements FugueMusic {
    private String basicFugueString;
    
    public BasicMusic(String musicString) {
        this.basicFugueString = musicString;
    }
    @Override
    public String getFugueString() {
        return basicFugueString;
                
    }
    
}
