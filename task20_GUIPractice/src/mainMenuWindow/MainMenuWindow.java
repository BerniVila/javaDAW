package mainMenuWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import calculator.CalculatorGUI;
import fileReading.FileReading;
import rgbSliders.RGBSliders;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MainMenuWindow {

	private JFrame frmMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuWindow window = new MainMenuWindow();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenuWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.getContentPane().setMaximumSize(new Dimension(550, 550));
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setBounds(100, 100, 552, 454);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 91, 91, 91, 91, 91, 91 };
		gridBagLayout.rowHeights = new int[] { 50, 110, 110, 110, 50 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
		frmMainMenu.getContentPane().setLayout(gridBagLayout);

		JButton btn_ColourChooser = new JButton("Colour Chooser");
		btn_ColourChooser.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/colourChooserIcon.png")));
		btn_ColourChooser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btn_ColourChooser = new GridBagConstraints();
		gbc_btn_ColourChooser.fill = GridBagConstraints.BOTH;
		gbc_btn_ColourChooser.gridheight = 3;
		gbc_btn_ColourChooser.gridwidth = 2;
		gbc_btn_ColourChooser.insets = new Insets(0, 0, 5, 5);
		gbc_btn_ColourChooser.gridx = 0;
		gbc_btn_ColourChooser.gridy = 1;
		frmMainMenu.getContentPane().add(btn_ColourChooser, gbc_btn_ColourChooser);

		JButton btn_Calculator = new JButton("Calculator");
		btn_Calculator.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/colourChooserIcon.png")));
		btn_Calculator.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btn_Calculator = new GridBagConstraints();
		gbc_btn_Calculator.fill = GridBagConstraints.BOTH;
		gbc_btn_Calculator.gridheight = 3;
		gbc_btn_Calculator.gridwidth = 2;
		gbc_btn_Calculator.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Calculator.gridx = 2;
		gbc_btn_Calculator.gridy = 1;
		frmMainMenu.getContentPane().add(btn_Calculator, gbc_btn_Calculator);

		JButton btn_TextEditor = new JButton("Text Editor");
		btn_TextEditor.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/colourChooserIcon.png")));
		btn_TextEditor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btn_TextEditor = new GridBagConstraints();
		gbc_btn_TextEditor.fill = GridBagConstraints.BOTH;
		gbc_btn_TextEditor.gridheight = 3;
		gbc_btn_TextEditor.gridwidth = 2;
		gbc_btn_TextEditor.insets = new Insets(0, 0, 5, 5);
		gbc_btn_TextEditor.gridx = 4;
		gbc_btn_TextEditor.gridy = 1;
		frmMainMenu.getContentPane().add(btn_TextEditor, gbc_btn_TextEditor);

		JToolBar toolBar_Messages = new JToolBar();
		toolBar_Messages.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		toolBar_Messages.setName("Messages");
		GridBagConstraints gbc_toolBar_Messages = new GridBagConstraints();
		gbc_toolBar_Messages.gridwidth = 6;
		gbc_toolBar_Messages.insets = new Insets(0, 0, 0, 5);
		gbc_toolBar_Messages.gridx = 0;
		gbc_toolBar_Messages.gridy = 4;
		frmMainMenu.getContentPane().add(toolBar_Messages, gbc_toolBar_Messages);

		JButton btn_Accept = new JButton("Accept");
		toolBar_Messages.add(btn_Accept);

		JButton btn_AcceptTitle = new JButton("Accept w/Title");
		toolBar_Messages.add(btn_AcceptTitle);

		JButton btn_Error = new JButton("Error");
		toolBar_Messages.add(btn_Error);

		JButton btn_Warning = new JButton("Warning");
		toolBar_Messages.add(btn_Warning);

		JButton btn_ImputingData = new JButton("Imputing Data");
		toolBar_Messages.add(btn_ImputingData);

		JButton btn_ImputingCombo = new JButton("Imputing Data w/ ComboBox");
		toolBar_Messages.add(btn_ImputingCombo);

		JMenuBar menuBar = new JMenuBar();
		frmMainMenu.setJMenuBar(menuBar);

		JMenu mn_BerniMenu = new JMenu("Berni's Multi App");
		mn_BerniMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(mn_BerniMenu);

		JMenuItem mntm_About = new JMenuItem("About");
		mn_BerniMenu.add(mntm_About);

		JMenu mn_File = new JMenu("File");
		mn_File.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(mn_File);

		JMenu mn_Edit = new JMenu("Edit");
		mn_Edit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(mn_Edit);

		JMenu mn_Help = new JMenu("Help");
		mn_Help.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(mn_Help);

		// message events

		btn_Accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame.getContentPane(), "Hello World");
			}
		});

		btn_AcceptTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Hello my 	friends", "Greeting", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		btn_Error.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Hello with error", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		btn_Warning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Hello with warning", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		});

		btn_ImputingData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				String name = JOptionPane.showInputDialog(frame, "What's your name?");
			}
		});

		btn_ImputingCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				String[] provinces = { "Castellón", "Valencia", "Alicante" };
				String province = (String) JOptionPane.showInputDialog(frame, "In which province do you live?",
						"Province", JOptionPane.QUESTION_MESSAGE, null, provinces, provinces[1]);
			}
		});

		// central button events
		btn_ColourChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RGBSliders window = new RGBSliders();
				window.getFrmRgbColorChooser().setVisible(true);
			}
		});
		
		btn_Calculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculatorGUI window = new CalculatorGUI();
				window.getFrmCalculatorGUI().setVisible(true);

			}
		});
		
		btn_TextEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileReading window = new FileReading();
				window.getFrmSelectAText().setVisible(true);
			}
		});
	}

}
