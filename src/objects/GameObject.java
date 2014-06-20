package objects;

import java.awt.Graphics;
import camera.Camera;

public interface GameObject {
	public void draw(Graphics g, Camera c);
	public void update();
}
