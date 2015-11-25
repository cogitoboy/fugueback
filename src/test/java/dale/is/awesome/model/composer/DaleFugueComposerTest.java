package dale.is.awesome.model.composer;

import dale.is.awesome.fugueback.model.FugueMusic;
import dale.is.awesome.fugueback.model.composer.DaleFugueComposer;
import dale.is.awesome.fugueback.player.AsyncFuguePlayer;
import dale.is.awesome.fugueback.player.FuguePlayer;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author daleapplegate
 */
@RunWith(MockitoJUnitRunner.class)
public class DaleFugueComposerTest {

    private FuguePlayer fuguePlayer = new AsyncFuguePlayer();

    private List<String> testLogMessages = new ArrayList<>();
    private List<String> testLogNames = new ArrayList<>();

    @InjectMocks
    DaleFugueComposer composer;

    int instrument = 30;

    @Before
    public void setup() {
        testLogMessages.add("015-11-24 18:26:08,298 INFO  [org.springframework.orm.jpa.LocalContainerEException FactoryBean][localhost-startStop-2] [AbstractEntityManagerFactoryBean.java:462] request-id: Closing JPA EntityManagerFactory for persistence unit 'blSecurePU'");

        testLogNames.add("org.springframework.orm.jpa.One");
        testLogNames.add("org.springframework.orm.jpa.Two");
        testLogNames.add("org.springframework.orm.jpa.Three");
        testLogNames.add("org.springframework.orm.jpa.Four");
        testLogNames.add("org.springframework.orm.jpa.Five");
        testLogNames.add("org.springframework.orm.jpa.Six");

    }

    @Test
    public void testMusic() {
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(1), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(2), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(3), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(4), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(5), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));

        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(3), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(2), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(2), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(2), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(5), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));

    }

    @Test
    public void testMusicSameNote() {
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
    }

    @Test
    public void testDifferentNote() {

        testPlay(composer.compose(instrument, testLogNames.get(0), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(1), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(2), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(3), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(4), testLogMessages.get(0)));
        testPlay(composer.compose(instrument, testLogNames.get(5), testLogMessages.get(0)));
    }

    private void testPlay(FugueMusic music) {
        fuguePlayer.play(music);
    }

    @Override
    protected void finalize() {
        fuguePlayer.stop();
    }
}
