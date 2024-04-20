import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {

    @Test
    public void pcConstructorTest(){
        //Given
        Dimension dimension = new Dimension(18, 15, 1);
        Resolution resolution = new Resolution(2100, 1800);

        Monitor expectedMonitor = new Monitor("Matte Vision", "WaveSystems", resolution);
        Motherboard expectedMotherboard = new Motherboard("IdeaPad", "Lenovo", 3,2, "Windows11 Home");
        Case expectedCase = new Case("NitroBlue", "Tronics", "AC/DC", dimension);

        PC pc = new PC(expectedMotherboard, expectedCase , expectedMonitor);

        //When

        Motherboard actualMotherboard = pc.getMotherboard();
        Case actualCase = pc.getComputerCase();
        Monitor actualMonitor = pc.getMonitor();



        //Then
        assertEquals(expectedMotherboard, actualMotherboard);
        assertEquals(expectedCase, actualCase);
        assertEquals(expectedMonitor, actualMonitor);

    }

}