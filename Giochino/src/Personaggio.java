import java.awt.Image;

public class Personaggio {
	Image spriteImage;
	int x = 0, y = 0, framex = 0, framey = 0, tileSize = 64, speed = 5;
	Mosse ultimaMossa=Mosse.SOTTO;

	public Personaggio(Image spriteImage) {

		this.spriteImage = spriteImage;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void muovi(Mosse mossa) {
		switch (mossa) {
		case SOPRA:
			framey = tileSize * 8;
			anima();
			y -= speed;
			ultimaMossa=mossa;
			break;
		case SOTTO:
			framey = tileSize * 10;
			anima();
			y += speed;
			ultimaMossa=mossa;
			break;
		case DESTRA:
			framey = tileSize * 11;
			anima();

			x += speed;
			ultimaMossa=mossa;
			break;
		case SINISTA:
			framey = tileSize * 9;
			anima();

			x -= speed;
			ultimaMossa=mossa;
			break;
		case NW:
			framey = tileSize * 9;
			anima();

			x -= speed;
			y -= speed;
			break;
		case SW:
			framey = tileSize * 9;
			anima();

			x -= speed;
			y += speed;
			break;
		case NE:
			framey = tileSize * 11;
			anima();

			x += speed;
			y -= speed;
			break;
		case SE:
			framey = tileSize * 11;
			anima();

			x += speed;
			y += speed;
			break;
		case CORRO:
			speed += 3;
			break;

		case RALLENTO:
			speed -= 3;
			break;
		
		case FERMO:
		System.out.println("sono fermo");
			switch (ultimaMossa) {
			case SOPRA:
				framey=tileSize*8;
				framex=0;
				break;
			case SOTTO:
				framey=tileSize*10;
				framex=0;
				break;
			case DESTRA:
				framey=tileSize*11;
				framex=0;
				break;
			case SINISTA:
				framey=tileSize*9;
				framex=0;
				break;
			
			
				
			}
			break;
		case ATTACCO:
			break;
		default:
			break;
		
		}
	}

	public int getFramex() {
		return framex;
	}

	public void setFramex(int framex) {
		this.framex = framex;
	}

	public int getFramey() {
		return framey;
	}

	public void setFramey(int framey) {
		this.framey = framey;
	}

	public void anima() {

		if (framex < tileSize * 8) {

			framex += tileSize;
		} else {
			framex = 0;
		}
	}

}
