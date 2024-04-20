public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(2010, 1825);
        Dimension dimension = new Dimension(21, 16, 1);
        Monitor monitor = new Monitor("Notebook", "Chrome", resolution);
        Case computerCase = new Case("Case500", "Chrome", "AC", dimension);
        Motherboard motherboard = new Motherboard("M1", "Compsytems", 2, 1, "Windows10");
        PC pc = new PC(motherboard, computerCase, monitor);
        pc.description();
        pc.powerUp("Slack", 28, 10, "Green");

    }
}
