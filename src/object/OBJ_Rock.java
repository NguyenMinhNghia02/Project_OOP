package object;

import entity.Entity;
import entity.Projectile;
import main.GamePanel;

public class OBJ_Rock extends Projectile{

	GamePanel gp;
	
	public OBJ_Rock(GamePanel gp) {
		super(gp);
		this.gp = gp;
		
		name = "Rock";
		speed = 8; 
		maxLife = 80;
		life = maxLife;
		attack = 3;
		useCost = 1;
		alive = false;
		getImage();
	}
	public void getImage() {
		up1 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		up2 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		down1 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		down2 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		left1 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		left2 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		right1 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
		right2 = setup("/Projectile/rock_down_1", gp.tileSize, gp.tileSize);
	}
}
