package fileReading;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

import java.util.Scanner;

public class FileReading {

	private JFrame frmSelectAText;
	private JTextField textFilePath;
	
	
	//added to use from main window
	public JFrame getFrmSelectAText() {
		return frmSelectAText;
	}
	
	public void setFrmSelectAText(JFrame frmSelectAText) {
		this.frmSelectAText = frmSelectAText;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileReading window = new FileReading();
					window.frmSelectAText.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public FileReading() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectAText = new JFrame();
		frmSelectAText.getContentPane().setBackground(Color.GRAY);
		frmSelectAText.setTitle("Select a text file");
		frmSelectAText.setBounds(100, 100, 612, 529);
		frmSelectAText.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSelectAText.getContentPane().setLayout(null);

		JLabel lblFile = new JLabel("File: ");
		lblFile.setBounds(28, 26, 35, 16);
		frmSelectAText.getContentPane().add(lblFile);

		textFilePath = new JTextField();
		textFilePath.setBounds(75, 21, 361, 26);
		frmSelectAText.getContentPane().add(textFilePath);
		textFilePath.setColumns(10);

		JButton btnBrowse = new JButton(" ... ");
		btnBrowse.setBounds(439, 21, 56, 26);
		frmSelectAText.getContentPane().add(btnBrowse);

		JTextArea textArea = new JTextArea();
		textArea.setColumns(60);
		textArea.setRows(20);
		textArea.setBounds(28, 84, 542, 387);
		frmSelectAText.getContentPane().add(textArea);
		
		JButton btnSaveButton = new JButton("Save");
		btnSaveButton.setBounds(505, 21, 65, 25);
		frmSelectAText.getContentPane().add(btnSaveButton);

		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int selectDialog = fileChooser.showOpenDialog(fileChooser);

			//	Scanner fileContent;
				if (selectDialog == JFileChooser.APPROVE_OPTION) {
					File file = new File(fileChooser.getSelectedFile().toString());
					try {
						//textFilePath.setText(fileChooser.getSelectedFile().toString());
						textFilePath.setText(file.getAbsolutePath());
						
						Scanner fileContent = new Scanner(fileChooser.getSelectedFile());

						String currentLine;
						while (fileContent.hasNext()) {
							currentLine = fileContent.nextLine();
							textArea.setText(textArea.getText() + currentLine + "\n");

						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}
}
