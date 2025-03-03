import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Currency_con extends JFrame implements ActionListener{
	private Container c;
	private Font f,f2;
	private ImageIcon img,img2;
	private JLabel imglabel,bdt,Output;
	private JButton Clear,IND,USD,CAD,UK,SL,PAK,EURO,AUD;
	private JTextField bdtex,outputtex;
	private JPanel p1,p2;
	
	public Currency_con()
	{
		components();
	}
	
	public void components()
	{
		c=this.getContentPane();
		c.setLayout(null);
		//c.setBackground(Color.black);
		c.setBackground(new Color(252, 253, 255));
		f= new Font("Arial",Font.BOLD,42);
		f2= new Font("Arial",Font.BOLD,24);
		
		//Icon Set.
		img=new ImageIcon(getClass().getResource("icon.png"));
		this.setIconImage(img.getImage());
		img2= new ImageIcon(getClass().getResource("currency.png"));
		
		imglabel= new JLabel(img2);
		imglabel.setBounds(0, 0, 920, 290);
		c.add(imglabel);
		
		bdt=new JLabel("BDT:");
		bdt.setBounds(100, 300, 250, 50);
		bdt.setFont(f);
		c.add(bdt);
		
		bdtex= new JTextField();
		bdtex.setBounds(360, 300, 450, 50);
		bdtex.setFont(f);
		bdtex.setBackground(new Color(238, 241, 255));
		c.add(bdtex);
		
		Output=new JLabel("Output :");
		Output.setBounds(100, 360, 250, 50);
		Output.setFont(f);
		c.add(Output);
		
		outputtex= new JTextField();
		outputtex.setBounds(360, 360, 450, 50);
		outputtex.setFont(f);
		outputtex.setBackground(new Color(238, 241, 255));
		c.add(outputtex);
		
		Clear= new JButton("Clear");
		Clear.setBounds(660, 420, 150, 50);
		Clear.setFont(f2);
		Clear.setBackground(new Color(238, 241, 255));
		Clear.addActionListener(this);
		c.add(Clear);
		
		
		p1= new JPanel();
		p1.setBounds(0, 276, 920, 200);
		p1.setBackground(new Color(170, 196, 255));
		c.add(p1);
		
		//IND,USD,CAD,UK,SL,PAK,Euro,Aud;
		IND = new JButton("IND");
		IND.setBounds(40, 490, 200, 120);
		IND.setFont(f2);
		IND.setBackground(new Color(238, 241, 255));
		IND.addActionListener(this);
		c.add(IND);
		
		USD = new JButton("USD");
		USD.setBounds(250, 490, 200, 120);
		USD.setFont(f2);
		USD.setBackground(new Color(238, 241, 255));
		USD.addActionListener(this);
		c.add(USD);
		
		CAD = new JButton("CAD");
		CAD.setBounds(460, 490, 200, 120);
		CAD.setFont(f2);
		CAD.setBackground(new Color(238, 241, 255));
		CAD.addActionListener(this);
		c.add(CAD);
		
		UK = new JButton("UK");
		UK.setBounds(670, 490, 200, 120);
		UK.setFont(f2);
		UK.setBackground(new Color(238, 241, 255));
		UK.addActionListener(this);
		c.add(UK);
		
		SL = new JButton("SL");
		SL.setBounds(40, 620, 200, 120);
		SL.setFont(f2);
		SL.setBackground(new Color(238, 241, 255));
		SL.addActionListener(this);
		c.add(SL);
		
		PAK = new JButton("PAK");
		PAK.setBounds(250, 620, 200, 120);
		PAK.setFont(f2);
		PAK.setBackground(new Color(238, 241, 255));
		PAK.addActionListener(this);
		c.add(PAK);
		
		EURO = new JButton("EURO");
		EURO.setBounds(460, 620, 200, 120);
		EURO.setFont(f2);
		EURO.setBackground(new Color(238, 241, 255));
		EURO.addActionListener(this);
		c.add(EURO);
		
		AUD = new JButton("AUD");
		AUD.setBounds(670, 620, 200, 120);
		AUD.setFont(f2);
		AUD.setBackground(new Color(238, 241, 255));
		AUD.addActionListener(this);
		c.add(AUD);

		
		
		p2= new JPanel();
		p2.setBounds(0, 476, 920, 400);
		p2.setBackground(new Color(210, 218, 255));
		c.add(p2);
		
		
		
		

		
	}
	
	public static void main(String[] args) {
		Currency_con cur = new Currency_con();
		cur.setVisible(true);
		cur.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cur.setTitle("Currency Converter");
		cur.setResizable(false);
		cur.setBounds(700,200,920,800);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=bdtex.getText();
		if(s.isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Input a Number");
		}
		else if(e.getSource()==Clear)
		{
			
			bdtex.setText("");
			outputtex.setText("");
		}
		else if (e.getSource()==USD)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.0090;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		else if (e.getSource()==IND)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.75;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		
		else if (e.getSource()==CAD)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.012;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		else if (e.getSource()==CAD)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.012;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		else if (e.getSource()==UK)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.0071;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		
		else if (e.getSource()==SL)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*2.97;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		else if (e.getSource()==PAK)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*2.54;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		else if (e.getSource()==EURO)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.0083;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		else if (e.getSource()==AUD)
		{
			String s1 = bdtex.getText();
			double a=Double.parseDouble(s1);
			double result1=a*0.014;
			String rsult2=String.valueOf(result1);
			outputtex.setText(rsult2);
		}
		
		
		
		
	}
	

}
