package chatWindow;

import java.io.File;
import java.io.Serializable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

@SuppressWarnings("serial")

public class AudioSerializable implements Serializable {

	File audioFile;

	public AudioSerializable(File audioFile) {
		super();
		this.audioFile = audioFile;
	}

	public AudioSerializable() {
		super();
	}

	public File getFile() {
		return audioFile;
	}

	public void setFile(File audioFile) {
		this.audioFile = audioFile;
	}


	public void playSound(File soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
	
	
}
