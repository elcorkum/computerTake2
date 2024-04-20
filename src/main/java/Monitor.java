public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution resolution;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer, Resolution resolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;


    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor {" +
                "model: " + model +
                ", manufacturer: " + manufacturer +
                ", resolution: " + resolution +
                '}';
    }
}
