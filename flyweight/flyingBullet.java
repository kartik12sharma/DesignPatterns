public class flyingBullet {
    double direction;
    double x, y, z;
    double speed;
    private bullet bulletRef;

    public flyingBullet(double dir, double x, double y, double z, double speed, bullet temp) {
        direction = dir;
        this.x = x;
        this.y = y;
        this.z = z;
        this.speed = speed;
        bulletRef = temp;
    }
}
