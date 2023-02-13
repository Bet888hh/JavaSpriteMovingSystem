
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Finestra extends JPanel  {

	/**
	 * 
	 */
	static JLayeredPane EverythingButPlayer;
	private static final long serialVersionUID = 1L;
	final int originalTileSize = 22;
	final int scale = 3;

	final int tileSize = 63;

	final int screenHeigth = 700; // 768 pixels;
	final int screenWidth = 1000;// 576 pixels;
   
	Image image,map;
	TimerTask refresh = new TimerTask(){

        public void run() {
        movimento.checking();
      
        repaint();
        }
    };

    
    
    
    
    Timer timer = new Timer("MyTimer");
	Thread gameThread;
	Personaggio pg;
	KeyHandler keys;
	Movimento movimento;
	public Finestra() {
		// TODO Auto-generated constructor stub
		 EverythingButPlayer = new JLayeredPane();
		 try {
				image = ImageIO.read(new File("src/sprite4.png"));
				map = ImageIO.read(new File("src/preview1.png"));
				
			} catch (IOException ex) {
			    ex.printStackTrace();
			}
		 pg= new Personaggio(image);
		this.setPreferredSize(new Dimension( screenWidth,screenHeigth));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
		this.keys = new KeyHandler(pg);
		this.addKeyListener(keys);
		this.movimento= new Movimento(keys, pg);
		
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawImage(image, maxScreenRow, maxScreenCol, EverythingButPlayer);
		System.out.println(map.getWidth(EverythingButPlayer));
		g.drawImage(map,
				0, 
				0,
				screenWidth,
				screenHeigth,
				pg.getX(),
				pg.getY(),
				screenWidth+pg.getX(),
				screenHeigth+pg.getY(),
				EverythingButPlayer);
		
		g.drawImage(pg.spriteImage,
				(screenWidth/2)- tileSize,
				(screenHeigth/2)- tileSize,
				(screenWidth/2)+25,
				(screenHeigth/2)+25,
				pg.framex,
				pg.framey,
				pg.framex+tileSize,
				pg.framey+tileSize,
				EverythingButPlayer);
		g.drawRect((screenWidth/2)- tileSize,(screenHeigth/2)- tileSize, tileSize, tileSize);
	}

	
	
	 void gioca() {
		timer.schedule(refresh,0, 38);
	}


		
		    
		
	

	
	
	
	
	
	
	}


