
public class FastEnemy extends Enemy{
	public void draw(MyFrame f) {
		f.setColor(100, 100, 100);
		f.fillRect(x+18, y, 20, 15);
		f.fillRect(x+30, y+100, 10, 15);
	}
	public FastEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,GameWorld.stage);
		life=4+GameWorld.stage;
	}
}