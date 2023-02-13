
public class Movimento {
	KeyHandler key;
	Personaggio pg;
	boolean up, down, right, left,space;

	public Movimento(KeyHandler key, Personaggio pg) {
		this.key = key;
		this.pg = pg;
	}

	void checking() {
		// TODO Auto-generated method stub
		up = key.isUp();
		down = key.isDown();
		right = key.isRight();
		left = key.isLeft();
		space= key.space;
		movepg(up, down, right, left);

	}

	private void movepg(boolean up, boolean down, boolean right, boolean left) {
		// TODO Auto-generated method stub
		
		
	
		
		movimento(up, down, right, left);
		System.out.println("x:  "+pg.x+ "Y:  "+pg.y+"\n\n");
		
	
		

	}

	private void movimento(boolean up, boolean down, boolean right, boolean left) {
		if (up&&left) {
			pg.muovi(Mosse.NW);
		}else if (up&&right) {
			pg.muovi(Mosse.NE);
		}else if (left&&(!down&&!right)) {
			pg.muovi(Mosse.SINISTA);
		}
		else if (right&&(!down&&!left)) {
			pg.muovi(Mosse.DESTRA);
		}else if ((up&&!right)||(up&&!left))   {
			
			pg.muovi(Mosse.SOPRA);
		}else if (down&&left) {
			pg.muovi(Mosse.SW);
		}else if (down&&right) {
			pg.muovi(Mosse.SE);
		}else if((down&&!right)&&(down&&!left)) {
			pg.muovi(Mosse.SOTTO);
		}else  {
			pg.muovi(Mosse.FERMO);
		}
	}

}
