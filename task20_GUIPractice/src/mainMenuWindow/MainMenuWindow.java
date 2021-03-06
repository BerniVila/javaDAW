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
import javax.swing.JSeparator;
import java.awt.event.KeyEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

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
		frmMainMenu.setBounds(100, 100, 552, 475);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(frmMainMenu.getContentPane(), popupMenu);
		
		JMenuItem mntmPopAbout = new JMenuItem("About");
		mntmPopAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame.getContentPane(), "Coded & Designed by Berni Vila");	
			}
		});
		
		JMenuItem mntmPopColourChooser = new JMenuItem("Colour Chooser");
		mntmPopColourChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RGBSliders window = new RGBSliders();
				window.getFrmRgbColorChooser().setVisible(true);	
			}
		});
		
		JMenuItem mntmPopCalculator = new JMenuItem("Calculator");
		mntmPopCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculatorGUI window = new CalculatorGUI();
				window.getFrmCalculatorGUI().setVisible(true);	
			}
		});
		
		JMenuItem mntmPopFileReader = new JMenuItem("File Reader");
		mntmPopFileReader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileReading window = new FileReading();
				window.getFrmSelectAText().setVisible(true);	
			}
		});
		
		popupMenu.add(mntmPopAbout);
		popupMenu.add(mntmPopColourChooser);
		popupMenu.add(mntmPopCalculator);
		popupMenu.add(mntmPopFileReader);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 91, 91, 91, 91, 91, 91 };
		gridBagLayout.rowHeights = new int[] { 50, 110, 110, 110, 50 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
		frmMainMenu.getContentPane().setLayout(gridBagLayout);

	
		

		JButton btn_ColourChooser = new JButton("");
		btn_ColourChooser.setToolTipText("Colour Chooser");
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

		JButton btn_Calculator = new JButton("");
		btn_Calculator.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/calculatorIcon.png")));
		btn_Calculator.setToolTipText("Calculator");
		//btn_Calculator.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/calculatorIcon.png")));
		btn_Calculator.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btn_Calculator = new GridBagConstraints();
		gbc_btn_Calculator.fill = GridBagConstraints.BOTH;
		gbc_btn_Calculator.gridheight = 3;
		gbc_btn_Calculator.gridwidth = 2;
		gbc_btn_Calculator.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Calculator.gridx = 2;
		gbc_btn_Calculator.gridy = 1;
		frmMainMenu.getContentPane().add(btn_Calculator, gbc_btn_Calculator);

		JButton btn_TextEditor = new JButton("");
		btn_TextEditor.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/TextEditorIcon.png")));
		btn_TextEditor.setToolTipText("Text Editor");
		//btn_TextEditor.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/TextEditorIcon.png")));
		btn_TextEditor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btn_TextEditor = new GridBagConstraints();
		gbc_btn_TextEditor.fill = GridBagConstraints.BOTH;
		gbc_btn_TextEditor.gridheight = 3;
		gbc_btn_TextEditor.gridwidth = 2;
		gbc_btn_TextEditor.insets = new Insets(0, 0, 5, 0);
		gbc_btn_TextEditor.gridx = 4;
		gbc_btn_TextEditor.gridy = 1;
		frmMainMenu.getContentPane().add(btn_TextEditor, gbc_btn_TextEditor);

		JToolBar toolBar_Messages = new JToolBar();
		toolBar_Messages.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		toolBar_Messages.setName("Messages");
		GridBagConstraints gbc_toolBar_Messages = new GridBagConstraints();
		gbc_toolBar_Messages.gridwidth = 6;
		gbc_toolBar_Messages.gridx = 0;
		gbc_toolBar_Messages.gridy = 4;
		frmMainMenu.getContentPane().add(toolBar_Messages, gbc_toolBar_Messages);

		JButton btn_Accept = new JButton("");
		btn_Accept.setToolTipText("Accept");
		btn_Accept.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Accept.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/Good-mark.png")));
		toolBar_Messages.add(btn_Accept);

		JButton btn_AcceptTitle = new JButton("");
		btn_AcceptTitle.setToolTipText("Accept w/Message");
		btn_AcceptTitle.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/About.png")));
		toolBar_Messages.add(btn_AcceptTitle);

		JButton btn_Error = new JButton("");
		btn_Error.setToolTipText("Error ");
		btn_Error.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/Turn off.png")));
		toolBar_Messages.add(btn_Error);

		JButton btn_Warning = new JButton("");
		btn_Warning.setToolTipText("Warning");
		btn_Warning.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/Warning.png")));
		toolBar_Messages.add(btn_Warning);

		JButton btn_ImputingData = new JButton("");
		btn_ImputingData.setToolTipText("Input Data");
		btn_ImputingData.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/Report.png")));
		toolBar_Messages.add(btn_ImputingData);

		JButton btn_ImputingCombo = new JButton("");
		btn_ImputingCombo.setToolTipText("Input w/Combo Box");
		btn_ImputingCombo.setIcon(new ImageIcon(MainMenuWindow.class.getResource("/images/Home.png")));
		toolBar_Messages.add(btn_ImputingCombo);

		JMenuBar menuBar = new JMenuBar();
		frmMainMenu.setJMenuBar(menuBar);
		menuBar.setSize(300, 20);

		JMenu mn_BerniMenu = new JMenu("Berni's Multi App");
		mn_BerniMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(mn_BerniMenu);
		
		JMenuItem mntmColourChooser = new JMenuItem("Colour Chooser");
		mntmColourChooser.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mntmColourChooser.setMnemonic(KeyEvent.VK_CONTROL);
		mn_BerniMenu.add(mntmColourChooser);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mntmCalculator.setMnemonic(KeyEvent.VK_CONTROL);
		mn_BerniMenu.add(mntmCalculator);
		
		JMenuItem mntmFileEditor = new JMenuItem("File Editor");
		mntmFileEditor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmFileEditor.setMnemonic(KeyEvent.VK_CONTROL);
		mn_BerniMenu.add(mntmFileEditor);
		
		JSeparator separator = new JSeparator();
		mn_BerniMenu.add(separator);

		JMenuItem mntm_About = new JMenuItem("About");
		mntm_About.setFocusable(true);
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
		
		
		
		//menu events
		mntm_About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame.getContentPane(), "Coded & Designed by Berni Vila");
			}
		});
		
		
		mntmColourChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RGBSliders window = new RGBSliders();
				window.getFrmRgbColorChooser().setVisible(true);
			}
		});
		
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculatorGUI window = new CalculatorGUI();
				window.getFrmCalculatorGUI().setVisible(true);

			}
		});
		
		mntmFileEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileReading window = new FileReading();
				window.getFrmSelectAText().setVisible(true);
			}
		});
		
		

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
				String[] provinces = { "Castell??n", "Valencia", "Alicante" };
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


	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
					
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		

		

	}
}
