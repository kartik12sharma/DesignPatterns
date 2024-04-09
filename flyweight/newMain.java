public class newMain {
    public static void main(String[] ar) {
        Image img = new Image();
        bulletType tp = bulletType.round;
        double rad = 1.2d;
        double wt = 550.45d;
        // Creating the intrinsic object
        bullet blt = new bullet(img, tp, rad, wt);
        // Creating extrinsic objects
        double dir = -60.2d;
        double x = 2.1d, y = 3.5d, z = 1.9d;
        double speed = 34.4d;
        flyingBullet flyblt1 = new flyingBullet(dir, x, y, z, speed, blt);

    }
}
