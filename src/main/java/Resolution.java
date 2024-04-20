public class Resolution {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0){
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        }
    }

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width: " + width +
                ", height: " + height +
                '}';
    }
}
