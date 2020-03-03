import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SushiGoGUI {

	private JFrame frmSushigo;
	private JLayeredPane MasterPanel;
	private JPanel ButtonPanel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JButton ResetButton;
	private JTextField Score1;
	private JTextField Score2;
	private JTextField Maki1;
	private JTextField Maki2;
	private JTextField Pudding1;
	private JTextField Pudding2;
	int roundCount = 1;
	int playerCount;
	private JLabel player21;
	private JLabel player22;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private int recordMover;
	ArrayList<Integer> points = new ArrayList<>();
	ArrayList<Integer> Maki = new ArrayList<>();
	ArrayList<Integer> Puddings = new ArrayList<>();
	ArrayList<String> playerNames = new ArrayList<>();
	private JPanel namePanel;
	private JTextField nameField;
	private JTextField score51;
	private JTextField maki51;
	private JTextField pudding51;
	private JTextField score52;
	private JTextField maki52;
	private JTextField pudding52;
	private JTextField score53;
	private JTextField maki53;
	private JTextField pudding53;
	private JTextField score54;
	private JTextField maki54;
	private JTextField pudding54;
	private JTextField score55;
	private JTextField maki55;
	private JTextField pudding55;
	private JButton btnNewButton_2;
	private JLabel player51;
	private JLabel player52;
	private JLabel player53;
	private JLabel player54;
	private JLabel player55;
	private JLabel lblNewLabel_12;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SushiGoGUI window = new SushiGoGUI();
					window.frmSushigo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public SushiGoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmSushigo = new JFrame();
		frmSushigo.setTitle("SushiGo!");
		frmSushigo.getContentPane().setBackground(Color.DARK_GRAY);
		frmSushigo.setBackground(Color.DARK_GRAY);
		frmSushigo.setBounds(100, 100, 450, 300);
		frmSushigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSushigo.getContentPane().setLayout(null);
		
			MasterPanel = new JLayeredPane();
			MasterPanel.setBounds(0, 51, 434, 199);
			MasterPanel.setForeground(Color.DARK_GRAY);
			MasterPanel.setBackground(Color.WHITE);
			frmSushigo.getContentPane().add(MasterPanel);
			MasterPanel.setLayout(new CardLayout(0, 0));
		
				ButtonPanel = new JPanel();
				ButtonPanel.setBorder(new LineBorder(Color.RED, 3, true));
				ButtonPanel.setBackground(Color.DARK_GRAY);
				MasterPanel.add(ButtonPanel, "name_21972846531900");
				ButtonPanel.setLayout(null);
		
					JLabel lblNewLabel_1 = new JLabel("Select Number of Players");
					lblNewLabel_1.setForeground(new Color(0, 100, 0));
					lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 13));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setBounds(126, 11, 190, 29);
					ButtonPanel.add(lblNewLabel_1);
		
					JButton btnNewButton = new JButton("2Players");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frmSushigo.getContentPane().add(ResetButton);
							playerCount = 2;
							setPlayerCount(playerCount);
							recordMover = 0;
							setRecordMover(recordMover);
							switchPanel(namePanel, playerCount);
						}
					});
								btnNewButton.setBackground(Color.LIGHT_GRAY);
								btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
								btnNewButton.setBounds(25, 51, 115, 36);
								ButtonPanel.add(btnNewButton);
		
					JButton btnplayers = new JButton("3Players");
					btnplayers.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frmSushigo.getContentPane().add(ResetButton);
							playerCount = 3;
							setPlayerCount(playerCount);
							switchPanel(panel_2, playerCount);
						}
					});
								btnplayers.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
								btnplayers.setBackground(Color.LIGHT_GRAY);
								btnplayers.setBounds(150, 51, 115, 36);
								ButtonPanel.add(btnplayers);
						
					JButton btnplayers_1 = new JButton("4Players");
					btnplayers_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frmSushigo.getContentPane().add(ResetButton);
							playerCount = 4;
							setPlayerCount(playerCount);
							switchPanel(panel_3, playerCount);
						}
					});
								btnplayers_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
								btnplayers_1.setBackground(Color.LIGHT_GRAY);
								btnplayers_1.setBounds(277, 51, 115, 36);
								ButtonPanel.add(btnplayers_1);
		
					JButton btnplayers_2 = new JButton("5Players");
					btnplayers_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frmSushigo.getContentPane().add(ResetButton);
							playerCount = 5;
							setPlayerCount(playerCount);
							recordMover = 0;
							setRecordMover(recordMover);
							switchPanel(namePanel, playerCount);
						}
					});
								btnplayers_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
								btnplayers_2.setBackground(Color.LIGHT_GRAY);
								btnplayers_2.setBounds(93, 110, 115, 36);
								ButtonPanel.add(btnplayers_2);
		
					JButton btnplayers_3 = new JButton("6Players");
					btnplayers_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frmSushigo.getContentPane().add(ResetButton);
							playerCount = 6;
							setPlayerCount(playerCount);
							recordMover = 0;
							setRecordMover(recordMover);
							switchPanel(namePanel, playerCount);
						}
					});
								btnplayers_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
								btnplayers_3.setBackground(Color.LIGHT_GRAY);
								btnplayers_3.setBounds(218, 110, 115, 36);
								ButtonPanel.add(btnplayers_3);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		panel_1.setBackground(Color.DARK_GRAY);
		MasterPanel.add(panel_1, "name_21972860553200");
		panel_1.setLayout(null);
		
		Score1 = 
				new JTextField();
		Score1.setBounds(121, 95, 86, 20);
		panel_1.add(Score1);
		Score1.setColumns(10);
		
		Score2 = new JTextField();
		Score2.setColumns(10);
		Score2.setBounds(229, 95, 86, 20);
		panel_1.add(Score2);
		
		Maki1 = new JTextField();
		Maki1.setColumns(10);
		Maki1.setBounds(121, 126, 86, 20);
		panel_1.add(Maki1);
		
		Maki2 = new JTextField();
		Maki2.setColumns(10);
		Maki2.setBounds(229, 126, 86, 20);
		panel_1.add(Maki2);
		
		Pudding1 = new JTextField();
		Pudding1.setColumns(10);
		Pudding1.setBounds(121, 157, 86, 20);
		panel_1.add(Pudding1);
		
		Pudding2 = new JTextField();
		Pudding2.setColumns(10);
		Pudding2.setBounds(229, 157, 86, 20);
		panel_1.add(Pudding2);
		
		JLabel lblNewLabel_3 = new JLabel("Round "+getRoundCount());
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_3.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(104, 7, 238, 52);
		panel_1.add(lblNewLabel_3);
		
		player21 = new JLabel("Player 1");
		player21.setBounds(144, 70, 46, 14);
		panel_1.add(player21);
		
		player22 = new JLabel("Player 2");
		player22.setBounds(252, 70, 46, 14);
		panel_1.add(player22);
		
		lblNewLabel_2 = new JLabel("Score:");
		lblNewLabel_2.setBounds(65, 98, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("Maki:");
		lblNewLabel_4.setBounds(65, 129, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Pudding:");
		lblNewLabel_5.setBounds(65, 160, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JButton btn2PlayerCollect = new JButton("Collect");
		btn2PlayerCollect.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					recordMover = getRecordMover();
					playerCount = getPlayerCount();
					roundCount = getRoundCount();
					playerNames = getPlayerNames();
					int MakiSet = 0;
					int P1points;
					int P2points;
		
				if(roundCount < 5) {
						try {
							
							points.add(recordMover,Integer.parseInt(Score1.getText()));
							points.add((recordMover+1),Integer.parseInt(Score2.getText()));
							Score1.setText("");
							Score2.setText("");
							
							Maki.add(MakiSet,Integer.parseInt(Maki1.getText()));
							Maki.add(MakiSet+1,Integer.parseInt(Maki2.getText()));
							Maki1.setText("");
							Maki2.setText("");
							int MakiWinner = scoreMaki(Maki);
							
							Puddings.add(recordMover, Integer.parseInt(Pudding1.getText()));
							Puddings.add(recordMover+1, Integer.parseInt(Pudding2.getText()));
							Pudding1.setText("");
							Pudding2.setText("");
							
	
							
							if(MakiWinner == Maki.get(MakiSet) && MakiWinner != Maki.get(MakiSet+1)&&MakiWinner!=0) {
								points.set(recordMover, points.get(recordMover)+6);
							}
							if(MakiWinner == Maki.get(MakiSet+1) && MakiWinner != Maki.get(MakiSet)&&MakiWinner!=0) {
								points.set(recordMover+1, points.get(recordMover+1)+6);
							}
							if(MakiWinner == Maki.get(MakiSet) && MakiWinner == Maki.get(MakiSet+1)&&MakiWinner!=0) {
								points.set(recordMover, points.get(recordMover)+3);
								points.set(recordMover+1, points.get(recordMover+1)+3);
							}
						}
						catch(Exception v) {
							JOptionPane.showMessageDialog(null,"Invalid Score Please Enter a Valid Score");
							points.remove(recordMover);
							points.remove(recordMover+1);
							
							Puddings.remove(recordMover);
							Puddings.remove(recordMover+1);
							
							
							int MakiWinner = scoreMaki(Maki);
							if(MakiWinner == Maki.get(MakiSet) && MakiWinner != Maki.get(MakiSet+1)&&MakiWinner!=0) {
								points.set(recordMover, points.get(recordMover)-6);
							}
							if(MakiWinner == Maki.get(MakiSet+1) && MakiWinner != Maki.get(MakiSet)&&MakiWinner!=0) {
								points.set(recordMover+1, points.get(recordMover+1)-6);
							}
							if(MakiWinner == Maki.get(MakiSet) && MakiWinner == Maki.get(MakiSet+1)&&MakiWinner!=0) {
								points.set(recordMover, points.get(recordMover)+3);
								points.set(recordMover+1, points.get(recordMover+1)-3);
							}
								
							recordMover = recordMover-playerCount;
							roundCount = roundCount -1;
							points.remove(recordMover);
							points.remove(recordMover+1);
						}
;
					
						recordMover = recordMover+playerCount;
						setRecordMover(recordMover);
						
						if(roundCount<4) {
							roundCount++;
							if(roundCount<=3) {
								setRoundCount(roundCount);
								lblNewLabel_3.setText("Round"+roundCount);
							}
						}
						
						
						
						
				}
				if(roundCount == 4) {
					
					int P1puddings = Puddings.get(0)+Puddings.get(2)+Puddings.get(4);
					int P2puddings = Puddings.get(1)+Puddings.get(3)+Puddings.get(5);
					
					P1points = points.get(0)+points.get(2)+points.get(4);
					P2points = points.get(1)+points.get(3)+points.get(5);
					
					if(P1puddings>P2puddings) {
						P1points = P1points+6;
					}
					if(P2puddings>P1puddings) {
						P2points = P2points+6;
					}
					if(P1puddings==P2puddings && P1puddings != 0) {
						P1points = P1points+3;
						P2points = P2points+3;
					}
					

					
					if(P1points>P2points) {
						JOptionPane.showMessageDialog(null, player21.getText() + " Wins with " + P1points + " Points!");
					}
					if(P1points<P2points) {
						JOptionPane.showMessageDialog(null, player22.getText() +" Wins with " + P2points + " Points!");
					}
					if(P1points==P2points) {
						JOptionPane.showMessageDialog(null, "Its a Tie!");
					}
					
					JOptionPane.showConfirmDialog(null, "Play Again?");
				}
			}
		});
		btn2PlayerCollect.setBounds(325, 125, 89, 23);
		panel_1.add(btn2PlayerCollect);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		MasterPanel.add(panel_2, "name_21972875002700");
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		MasterPanel.add(panel_3, "name_21972891348400");
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.RED, 3));
		panel_4.setBackground(Color.DARK_GRAY);
		MasterPanel.add(panel_4, "name_21972905713700");
		panel_4.setLayout(null);
		
		score51 = new JTextField();
		score51.setColumns(10);
		score51.setBounds(36, 92, 50, 20);
		panel_4.add(score51);
		
		maki51 = new JTextField();
		maki51.setColumns(10);
		maki51.setBounds(36, 123, 50, 20);
		panel_4.add(maki51);
		
		pudding51 = new JTextField();
		pudding51.setColumns(10);
		pudding51.setBounds(36, 154, 50, 20);
		panel_4.add(pudding51);
		
		score52 = new JTextField();
		score52.setColumns(10);
		score52.setBounds(96, 92, 50, 20);
		panel_4.add(score52);
		
		maki52 = new JTextField();
		maki52.setColumns(10);
		maki52.setBounds(96, 123, 50, 20);
		panel_4.add(maki52);
		
		pudding52 = new JTextField();
		pudding52.setColumns(10);
		pudding52.setBounds(96, 154, 50, 20);
		panel_4.add(pudding52);
		
		score53 = new JTextField();
		score53.setColumns(10);
		score53.setBounds(156, 92, 50, 20);
		panel_4.add(score53);
		
		maki53 = new JTextField();
		maki53.setColumns(10);
		maki53.setBounds(156, 123, 50, 20);
		panel_4.add(maki53);
		
		pudding53 = new JTextField();
		pudding53.setColumns(10);
		pudding53.setBounds(156, 154, 50, 20);
		panel_4.add(pudding53);
		
		score54 = new JTextField();
		score54.setColumns(10);
		score54.setBounds(216, 92, 50, 20);
		panel_4.add(score54);
		
		maki54 = new JTextField();
		maki54.setColumns(10);
		maki54.setBounds(216, 123, 50, 20);
		panel_4.add(maki54);
		
		pudding54 = new JTextField();
		pudding54.setColumns(10);
		pudding54.setBounds(216, 154, 50, 20);
		panel_4.add(pudding54);
		
		score55 = new JTextField();
		score55.setColumns(10);
		score55.setBounds(276, 92, 50, 20);
		panel_4.add(score55);
		
		maki55 = new JTextField();
		maki55.setColumns(10);
		maki55.setBounds(276, 123, 50, 20);
		panel_4.add(maki55);
		
		pudding55 = new JTextField();
		pudding55.setColumns(10);
		pudding55.setBounds(276, 154, 50, 20);
		panel_4.add(pudding55);
		
		btnNewButton_2 = new JButton("Collect");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recordMover = getRecordMover();
				playerCount = getPlayerCount();
				roundCount = getRoundCount();
				int MakiSet = 0;
				int P1points;
				int P2points;
				int P3points;
				int P4points;
				int P5points;
				
				if(roundCount < 5) {
					try {

						points.add(recordMover,Integer.parseInt(score51.getText()));
						points.add(recordMover+1,Integer.parseInt(score52.getText()));
						points.add(recordMover+2,Integer.parseInt(score53.getText()));
						points.add(recordMover+3,Integer.parseInt(score54.getText()));
						points.add(recordMover+4,Integer.parseInt(score55.getText()));
						score51.setText("");
						score52.setText("");
						score53.setText("");
						score54.setText("");
						score55.setText("");
						
						Maki.add(MakiSet, Integer.parseInt(maki51.getText()));
						Maki.add(MakiSet+1, Integer.parseInt(maki52.getText()));
						Maki.add(MakiSet+2, Integer.parseInt(maki53.getText()));
						Maki.add(MakiSet+3, Integer.parseInt(maki54.getText()));
						Maki.add(MakiSet+4, Integer.parseInt(maki55.getText()));
						maki51.setText("");
						maki52.setText("");
						maki53.setText("");
						maki54.setText("");
						maki55.setText("");
						
						int makiPoints = CalculatorTools.makiCalc(Maki, playerCount);
						for(int j=0;j<playerCount;j++) {
							if(Maki.get(j) == Collections.max(Maki)) {
								points.set(j,(points.get(j)+makiPoints));
							}
						}

						
						Puddings.add(recordMover, Integer.parseInt(pudding51.getText()));
						Puddings.add(recordMover+1, Integer.parseInt(pudding52.getText()));
						Puddings.add(recordMover+2, Integer.parseInt(pudding53.getText()));
						Puddings.add(recordMover+3, Integer.parseInt(pudding54.getText()));
						Puddings.add(recordMover+4, Integer.parseInt(pudding55.getText()));
						pudding51.setText("");
						pudding52.setText("");
						pudding53.setText("");
						pudding54.setText("");
						pudding55.setText("");
					}
					catch(Exception b) {
						JOptionPane.showMessageDialog(null, "Invalid Score Please Enter a Valid Score.");
						points.remove(recordMover);
						points.remove(recordMover+1);
						points.remove(recordMover+2);
						points.remove(recordMover+3);
						points.remove(recordMover+4);
						
						Puddings.remove(recordMover);
						Puddings.remove(recordMover+1);
						Puddings.remove(recordMover+2);
						Puddings.remove(recordMover+3);
						Puddings.remove(recordMover+4);
						
						int makiPoints = CalculatorTools.makiCalc(Maki, playerCount);
						for(int j=0;j<playerCount;j++) {
							if(Maki.get(j) == Collections.max(Maki)) {
								points.set(j,(points.get(j)-makiPoints));
							}
						}
						recordMover = recordMover-playerCount;
						setRecordMover(recordMover);
						roundCount = roundCount--;
						setRoundCount(roundCount);
					}
					JOptionPane.showMessageDialog(null, Maki);
					recordMover = recordMover+playerCount;
					setRecordMover(recordMover);
					
					if(roundCount<4) {
						roundCount++;
						if(roundCount <= 3) {
							setRoundCount(roundCount);
							lblNewLabel_12.setText("Round"+roundCount);
						}
					}
				}
				if(roundCount == 4) {

					int puddingPoints = CalculatorTools.PuddingCalc(Puddings, playerCount);
					
					for(int j=0;j<playerCount;j++) {
						if(Puddings.get(j) == Collections.max(Puddings)) {
							points.set(j,(points.get(j)+puddingPoints));
						}
					}
					P1points = points.get(0)+points.get(5)+points.get(10);
					P2points = points.get(1)+points.get(6)+points.get(11);
					P3points = points.get(2)+points.get(7)+points.get(12);
					P4points = points.get(3)+points.get(8)+points.get(13);
					P5points = points.get(4)+points.get(9)+points.get(14);
					
					ArrayList<Integer> finalPoints = new ArrayList<>();
					finalPoints.add(P1points);
					finalPoints.add(P2points);
					finalPoints.add(P3points);
					finalPoints.add(P4points);
					finalPoints.add(P5points);
					JOptionPane.showMessageDialog(null, finalPoints);
					ArrayList<Integer> scoreBoard = new ArrayList<>();
					scoreBoard.add(P1points);
					scoreBoard.add(P2points);
					scoreBoard.add(P3points);
					scoreBoard.add(P4points);
					scoreBoard.add(P5points);
					scoreBoard = CalculatorTools.scoreBoard(scoreBoard);

					for(int i = 0; i<playerCount; i++) {
						if(Collections.max(finalPoints)==finalPoints.get(i)) {
							JOptionPane.showMessageDialog(null, playerNames.get(i)+" Wins With "+finalPoints.get(i)+" Points!");
						}
					}
					
				}
			}	
		});
		btnNewButton_2.setBounds(335, 122, 89, 23);
		panel_4.add(btnNewButton_2);
		
		player51 = new JLabel("New label");
		player51.setBounds(36, 67, 50, 14);
		panel_4.add(player51);
		
		player52 = new JLabel("New label");
		player52.setBounds(96, 67, 50, 14);
		panel_4.add(player52);
		
		player53 = new JLabel("New label");
		player53.setBounds(156, 67, 50, 14);
		panel_4.add(player53);
		
		player54 = new JLabel("New label");
		player54.setBounds(216, 67, 50, 14);
		panel_4.add(player54);
		
		player55 = new JLabel("New label");
		player55.setBounds(276, 67, 50, 14);
		panel_4.add(player55);
		
		lblNewLabel_12 = new JLabel("Round 1");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setForeground(new Color(0, 100, 0));
		lblNewLabel_12.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(96, 11, 238, 52);
		panel_4.add(lblNewLabel_12);
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.DARK_GRAY);
		MasterPanel.add(panel_5, "name_21972920579000");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_12_1 = new JLabel("Round 1");
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_12_1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblNewLabel_12_1.setBounds(96, 11, 238, 52);
		panel_5.add(lblNewLabel_12_1);
		
		panel_6 = new JPanel();
		panel_6.setBackground(Color.DARK_GRAY);
		MasterPanel.add(panel_6, "name_21972952600400");
		
		namePanel = new JPanel();
		namePanel.setBorder(new LineBorder(Color.RED, 4, true));
		namePanel.setBackground(Color.DARK_GRAY);
		MasterPanel.add(namePanel, "name_831613807569500");
		namePanel.setLayout(null);
		
		nameField = new JTextField();
		nameField.setBounds(83, 96, 154, 39);
		namePanel.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Name");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(110, 61, 96, 32);
		namePanel.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerCount = getPlayerCount();
				

				playerNames.add(nameField.getText());
				nameField.setText("");


				setNames(playerNames);
				

				if(playerCount == 2) {
					
					player21.setText(playerNames.get(0));
					player22.setText(playerNames.get(1));
					switchPanel(panel_1, playerCount);
				}
				if(playerCount == 5) {
					player51.setText(playerNames.get(0));
					player52.setText(playerNames.get(1));
					player53.setText(playerNames.get(2));
					player54.setText(playerNames.get(3));
					player55.setText(playerNames.get(4));
					switchPanel(panel_4, playerCount);
				}
				if(playerCount == 6) {
					player51.setText(playerNames.get(0));
					player52.setText(playerNames.get(1));
					player53.setText(playerNames.get(2));
					player54.setText(playerNames.get(3));
					player55.setText(playerNames.get(4));
					switchPanel(panel_5, playerCount);
				}
			}
		});
		btnNewButton_1.setBounds(276, 104, 72, 23);
		namePanel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("SushiGo!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Cooper Black", Font.BOLD, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 0, 260, 51);
		frmSushigo.getContentPane().add(lblNewLabel);
		
		ResetButton = new JButton("Reset");
		ResetButton.setForeground(Color.YELLOW);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(ButtonPanel, playerCount);
			}
		});
		ResetButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 9));
		ResetButton.setBackground(Color.DARK_GRAY);
		ResetButton.setBounds(10, 11, 72, 29);
		
	}
	public void setNames(ArrayList<String> playerNames) {
		
		this.playerNames = playerNames;
	}
	public ArrayList<String> getPlayerNames() {
		return playerNames;
	}

	public int scoreMaki(ArrayList<Integer> Maki) {
		
		int MakiWinner = Collections.max(Maki);
		return MakiWinner;
	}
	public void setRecordMover(int recordMover) {
		this.recordMover = recordMover;
	}
	public int getRecordMover() {
		return recordMover;
	}
	public void setRoundCount(int roundCount) {
		this.roundCount = roundCount;
	}
	public int getRoundCount() {
		return roundCount;
	}
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	public int getPlayerCount() {
		return playerCount;
	}
	
	public void switchPanel(JPanel panel, int playerCount) {
		
		MasterPanel.removeAll();
		MasterPanel.add(panel);
		MasterPanel.repaint();
		MasterPanel.revalidate();
		
		
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
