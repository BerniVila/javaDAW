package chatWindow;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class SoundSerializer implements Serializable {

    private byte[] buf;
    private int randomInteger =0;
    private String randomString = "";

    public SoundSerializer() throws FileNotFoundException, IOException {
    	File fx3 = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroUno.wav");

        FileInputStream fis = new FileInputStream(fx3);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        buf = new byte[1024];

        for (int readNum; (readNum = fis.read(buf)) != -1;) {
            bos.write(buf, 0, readNum); //no doubt here is 0
            //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
            System.out.println("read " + readNum + " bytes,");
        }

        buf = bos.toByteArray();
    }


    /**
     *fonction to test the sound after deserialization
     */
    public void playSound(){
        InputStream is = new ByteArrayInputStream(buf);
        AudioInputStream audioInputStream;
        try {
        	audioInputStream = AudioSystem.getAudioInputStream(is);
        	Clip clip = AudioSystem.getClip();
        	clip.open(audioInputStream);
        	clip.start();
        } catch (IOException ex) {
            Logger.getLogger(SoundSerializer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
