public class Circle extends Shape{

    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }



    public int getRadius() {
        return radius;
    }

    @Override
    public String toString () {
        return "Circle{" +
                "location=" + getLocation() +
                ", radius=" + radius +
                '}';
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius can't be negative.");
        } else {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI*radius*radius;
        }
    }
}
