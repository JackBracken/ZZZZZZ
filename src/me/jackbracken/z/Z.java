package me.jackbracken.z;

import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Z extends BasicGame {
	public static final String TITLE = "ZZZZZZ";
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static final int TARGET_FPS = 100;
	
	private Image[] playerImage;
	private Animation viridian;
	
	public Z() {
		super(TITLE);
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		viridian.draw(WIDTH / 2, HEIGHT / 2);
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		Image[] playerImage = {
			new Image("res/sprites/viridian_1.png", false, Image.FILTER_NEAREST).getScaledCopy(2),
			new Image("res/sprites/viridian_2.png", false, Image.FILTER_NEAREST).getScaledCopy(2)
		};
		
		viridian = new Animation(playerImage, 120, false);
		
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		viridian.update(delta);
	}
	
	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new Z());
			container.setDisplayMode(WIDTH,  HEIGHT,  false);
			container.setTargetFrameRate(TARGET_FPS);
			container.start();
		} catch(SlickException e) {
			e.printStackTrace();
		}
	}
}
