import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class ComboBox extends JFrame implements ActionListener
{    
JLabel as;
JTextField a;
JComboBox cbwk;
JButton b;
JButton b1;
		ComboBox()
	    {
		setLayout(new FlowLayout());
		as=new JLabel("DATA");
		add(as);
		a=new JTextField(10);
		add (a);
		Vector v=new Vector();
		v.add ("monday");
		v.add ("tuesday");
 		v.add ("friday");
		v.add ("satureday");
		
		cbwk=new JComboBox(v);
		cbwk.setMaximumRowCount(2);
		add (cbwk);
		
		b=new JButton("ADD");
		b1=new JButton("DELETE");
		
		b.addActionListener(this);
		b1.addActionListener(this);
		
		add(b);
		add(b1);
		setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			cbwk.addItem(a.getText());
			a.setText("");
		}
		else
		{
			cbwk.removeItemAt(cbwk.getSelectedIndex());
		}
	}
public static void main(String args [])
	{
		ComboBox cbwk=new ComboBox();         
	}
}
