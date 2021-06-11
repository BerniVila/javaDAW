package chatWindow;

import java.io.File;
import java.io.Serializable;

@SuppressWarnings("serial")

public class AudioSerializable implements Serializable {

	File audioFile;
	int edad;

	public AudioSerializable(File audioFile) {
		super();
		this.audioFile = audioFile;
	}

	public AudioSerializable() {
		super();
	}

	public File getNombre() {
		return audioFile;
	}

	public void setNombre(File audioFile) {
		this.audioFile = audioFile;
	}


}
