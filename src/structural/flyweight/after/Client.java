package structural.flyweight.after;

import structural.flyweight.before.BulletType;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();

        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);
        bulletRegistry.registerBullet(BulletType.FIVE_MM, fiveMMBullet);


        Bullet sevenMMBullet = new Bullet();
        sevenMMBullet.setBulletType(BulletType.SEVEN_MM);
        bulletRegistry.registerBullet(BulletType.SEVEN_MM, sevenMMBullet);

        Bullet nineMMBullet = new Bullet();
        nineMMBullet.setBulletType(BulletType.NINE_MM);
        bulletRegistry.registerBullet(BulletType.NINE_MM, nineMMBullet);

        List<FlyingBullet> flyingBullets=new ArrayList<>();

        for(int i=0;i<200000;i++){
            FlyingBullet flyingBullet=new FlyingBullet();
            flyingBullet.setSpeed(120);
            //...
            flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            flyingBullets.add(flyingBullet);

        }

        System.out.println("DEMO");

    }
}
