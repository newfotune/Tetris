/*
 * Nwoke Fortune Chiemeziem. Winter 2015.
 */

package view;

import com.sun.media.codec.audio.mp3.JavaDecoder;
import javax.media.Codec;
import javax.media.PlugInManager;

/**
 * This kicks start the GUI.
 * 
 * @author n4tunec@uw.edu.
 * @version winter 2015.
 * */
public final class DriverClass {

    /** Private constructor. */
    private DriverClass() {
        // do nothing
    }

    /**
     * The main method creates a new Game frame.
     * 
     * @param theArgs the arguments passed.
     */
    public static void main(final String[] theArgs) {

        final Codec c = new JavaDecoder();
        PlugInManager.addPlugIn("com.sun.media.codec.audio.mp3.JavaDecoder",
                                c.getSupportedInputFormats(),
                                c.getSupportedOutputFormats(null), PlugInManager.CODEC);
        final GameFrame game = new GameFrame();
        game.start();
    }

}