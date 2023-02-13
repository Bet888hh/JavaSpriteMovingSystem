import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	boolean up, down, left, right,space;
	Personaggio pg;
	public KeyHandler(Personaggio pg) {
		super();
		this.pg = pg;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		switch (Character.toLowerCase(e.getKeyChar())) {
		case 'w':
			up = true;
			break;
		case 'a':
			left = true;
			break;
		case 's':
			down = true;
			break;
		case 'd':
			right = true;
			break;
		case ' ':
			pg.speed=8;
			
			break;

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (Character.toLowerCase(e.getKeyChar())) {
		case 'w':
			up = true;
			break;
		case 'a':
			left = true;
			break;
		case 's':
			down = true;
			break;
		case 'd':
			right = true;
			break;
		case ' ':
			pg.speed=8;
			
			break;

		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (Character.toLowerCase(e.getKeyChar())) {
		case 'w':
			up = false;
			break;
		case 'a':
			left = false;
			break;
		case 's':
			down = false;
			break;
		case 'd':
			right = false;
			break;
		case ' ':
			space = true;
			pg.speed=5;
			break;

		}

	}
	public boolean isUp() {
		return up;
	}

	public boolean isDown() {
		return down;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

}
