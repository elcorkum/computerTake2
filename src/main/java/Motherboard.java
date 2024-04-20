public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

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

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        if (ramSlots >= 0){
            this.ramSlots = ramSlots;
        }

    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        if (cardSlots >= 0){
            this.cardSlots = cardSlots;
        }
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }



    public void loadProgram(String program){
        System.out.println(program + " is now running.");
    }

    @Override
    public String toString() {
        return "Motherboard {" +
                "model: " + model +
                ", manufacturer: " + manufacturer +
                ", ramSlots: " + ramSlots +
                ", cardSlots: " + cardSlots +
                ", bios: " + bios +
                '}';
    }
}
