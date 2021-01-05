import static java.lang.Math.PI;

public class RoundedRectangle extends Rectangle {

    public RoundedRectangle(int width, int height) {
        super(width, height);
    }

    public RoundedRectangle(int size) {
        super(size);
    }

    private int roundRadius = 2;

    public int getRoundRadius() {
        return roundRadius;
    }

    @Override
    public double calculateArea() {
        return (getWidth() * getHeight()) - (4 * (roundRadius * roundRadius)) + (roundRadius * roundRadius * PI);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Width: ")
                .append(getWidth())
                .append(", Height: ")
                .append(getHeight())
                .append(", Round radius: ")
                .append(roundRadius)
                .append(", Area: ")
                .append(calculateArea());
        return sb.toString();
    }

}
