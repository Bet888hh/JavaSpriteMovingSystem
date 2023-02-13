



import javax.swing.JFrame;


public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Personaggio pg= new Personaggio(null);
	Finestra panel;
	
	public Window(Finestra panel) {
		// TODO Auto-generated constructor stub
		this.panel=panel;
		setLocationRelativeTo(null);
		setTitle("2D Adventure!");
		add(panel);
		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		panel.gioca();
		
		
	   
	   
	}

	


}
