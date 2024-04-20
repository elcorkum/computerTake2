public class PC {
    private Motherboard motherboard;
    private Case computerCase;
    private Monitor monitor;


    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Case getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(Case computerCase) {
        this.computerCase = computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public PC(Motherboard motherboard, Case computerCase, Monitor monitor){
        this.motherboard = motherboard;
        this.computerCase = computerCase;
        this.monitor = monitor;
    }

    private void drawLogo(int x, int y, String color){
        monitor.drawPixel(x,y,color);
    }



    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today:" +
                "\n" + motherboard.toString() +
                "\n" + monitor.toString() +
                "\n" + computerCase.toString());
    }

    public void powerUp(String program, int x, int y, String color){
        computerCase.pressPowerButton();
        drawLogo(x,y,color);
        motherboard.loadProgram(program);
    }
}
