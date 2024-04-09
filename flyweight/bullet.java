// This can be designed as singleton design pattern
class bullet {
    Image img;
    bulletType type;
    double radius;
    double weight;

    public bullet(Image img, bulletType tp, double rad, double wt) {
        this.img = img;
        type = tp;
        radius = rad;
        weight = wt;
    }
}
