package structural.flyweight.after;

import structural.flyweight.before.BulletStatus;
import structural.flyweight.before.BulletType;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType, Bullet> bullets=new HashMap<>();
    public void registerBullet(BulletType type,Bullet bullet){
        bullets.put(type,bullet);
    }

    public Bullet getBullet(BulletType bulletType){
        return bullets.get(bulletType);
    }
}
