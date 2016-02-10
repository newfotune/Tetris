/*
 * Nwoke Fortune Chiemeziem
 * Winter 2015- tetris.
 */

package view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * This enum has all the sound effects used in the game.
 * @author n4tunec@uw.edu.
 * @version winter-2015.
 * 
 */
public enum SoundEffects {
    /** When the piece is dropped.*/
    DROP("./music/drop.wav"),
    /** When the piece is moved.*/
    MOVE("./music/move.wav"),
    /** When the game if paused.*/
    PAUSE("./music/pause.wav"),
    /** When a line is cleared.*/
    CLEARED("./music/clear.wav");
    
    /**
     * The clip of each sound effect.
     */
    private Clip myClip;

    /**
     * Constructor to construct each element of the enum with its own sound
     * file.
     * 
     * @param theSoundFileName the path to the sound file.
     */
    // Constructor to construct each element of the enum with its own sound
    // file.
    SoundEffects(final String theSoundFileName) {
        try {

            final File audio = new File(theSoundFileName);
            final AudioInputStream audioIn = AudioSystem.getAudioInputStream(audio);

            // Get a clip resource.
            myClip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            myClip.open(audioIn);
        } catch (final UnsupportedAudioFileException exception) {
        
            exception.printStackTrace();
        } catch (final IOException exception) {
        
            exception.printStackTrace();
        } catch (final LineUnavailableException exception) {
        
            exception.printStackTrace();
        }
    }

    /**
     * play the sound.
     */
    public void play() {

        // Stop the player if it is still running
        if (myClip.isRunning()) {
            myClip.stop();
        }
        myClip.setFramePosition(0); // rewind to the beginning
        myClip.start();

    }

    /**
     * Ininialize clip with all audio files.
     */
    public static void init() {
        values();
    }

    /** Toggle pausing .*/
    public void pause() {
        if (myClip.isRunning()) {
            myClip.stop();
        } else {
            myClip.start();
        }
    }

    /**
     * Stop the music and reset playing position to the beginning.
     */
    public void stop() {
        myClip.stop();
        myClip.setFramePosition(0);
    }
}
