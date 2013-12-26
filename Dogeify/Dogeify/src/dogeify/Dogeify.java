import javax.swing.JFrame;
import java.awt.Container;

public class Dogeify extends JFrame
{
	private Container contents;
	private int paneW = 300;
	private int paneH = 200;
	public Dogeify ()
	{
	super("Wow such toolbar");
		contents = getContentPane();
		setSize(paneW, paneH);
		setVisible(true);
	}
	public static void main (String[] args)
	{
			Dogeify doge = new Dogeify();
			doge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}