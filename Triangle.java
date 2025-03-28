public class Triangle extends Shape {

    private int sideA, sideB, sideC;

    private Point point;


    public Triangle(Point point, int sideA, int sideB) {
        super(point);
        setSideA(sideA);
        setSideB(sideB);
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public double area() {
        return (sideA*sideB)/2;
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", point=" + point +
                '}';
    }

    public double setSideA(int sideA) {
        if (sideA < 0) {
            throw new IllegalArgumentException("Side can't be negative.");
        } else {
            this.sideA = sideA;
        }

        public void setSideB(int sideB) {
            if (sideB < 0) {
                throw new IllegalArgumentException("Side can't be negative");
            } else {
                this.sideB = sideB;
            }
        }

    }
}
