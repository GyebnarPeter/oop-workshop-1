public class Rectangle {

    private int width;
    private int height;
    private int size;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle (int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSize() {
        return size;
    }

    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Width: ")
                .append(getWidth())
                .append(", Height: ")
                .append(getHeight());
        return sb.toString();
    }
}
