import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;



	public class RPSGui extends JFrame implements ActionListener
{
	public RPS rps = new RPS();	
	
	
	//Creating the label before the buttons.
	public JLabel lblType = new JLabel("Pick one: ");	
	public JLabel lblVs = new JLabel("   VS   ");	
	public JLabel lblOutcome = new JLabel("");	
	//Making a new button group.
	ButtonGroup bgType=new ButtonGroup();	
	//Seelct for the user to pick 
	String[] optionStrings = {"Rock","Paper","Scissors" };
	JComboBox optionList = new JComboBox(optionStrings);
	//Labels to hold the user and cpu input
	public JLabel lblUser = new JLabel("");
	public JLabel lblCpu = new JLabel("");
	
	//Creating the play button.
	public JButton btnPlay=new JButton("Play");
	private RPSGame g = new RPSGame();
	
	public static void main(String args[]) 
	{
		new RPSGui();	
	}
	
	RPSGui()
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//main panel
		JPanel pMain = new JPanel();
		JPanel pChoice = new JPanel();
		JPanel pGame = new JPanel();
		JPanel pButton = new JPanel();
		JPanel pOutcome = new JPanel();
		btnPlay.addActionListener(this);		
			
		//add to main panel
		pChoice.add(lblType);
		pChoice.add(optionList);
		pMain.add(pChoice);	
		
		pButton.add(btnPlay);
		pMain.add(pButton);
		
		//add a panel to hold the user and cpu choices
		pGame.add(lblUser);
		pGame.add(lblVs);
		pGame.add(lblCpu);	
		
		pGame.setLayout(new BoxLayout(pGame,BoxLayout.X_AXIS));
		pMain.add(pGame);
		
		pOutcome.add(lblOutcome);
		pMain.add(pOutcome);
		
		pMain.setLayout(new BoxLayout(pMain,BoxLayout.Y_AXIS));
		this.getContentPane().add (pMain);
		this.setSize(600, 600);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		try{
			int userChoice;
			int game;

			userChoice=optionList.getSelectedIndex();
			userChoice=userChoice;
			
			game=g.play(userChoice);
			
			//0 = loss, 1 = win, 2 = draw.
			if(game == 0)
			{			
				lblOutcome.setText("You lose");
			}
			else if(game == 1)
			{			
				lblOutcome.setText("You win");
			}
			else
			{			
				lblOutcome.setText("The game was a draw");
			}
		
			String imageName1;
			String imageName2;
			
			imageName1= userChoice + ".jpg";
			imageName2= g.getCpuValue()- 1 + ".jpg";
			
			BufferedImage img1 = ImageIO.read(new File(imageName1));
			ImageIcon icon1 = new ImageIcon(img1);
			lblUser.setIcon(icon1);
			BufferedImage img2 = ImageIO.read(new File(imageName2));
			ImageIcon icon2 = new ImageIcon(img2);
			lblCpu.setIcon(icon2);
		
		}
		catch (Exception exc){
			lblOutcome.setText(exc.toString());
		}
	}
		
		
		
		
}
