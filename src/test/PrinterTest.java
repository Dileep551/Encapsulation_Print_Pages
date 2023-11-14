import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void addToner() {
        //Give
        int tonerLevel = 50;
        boolean duplex = true;
        int tonerAmount = 50;


        //When
        Printer printer = new Printer(tonerLevel, duplex);
        int toner = printer.addToner(tonerAmount);

        //Then
        assertEquals(100, toner);


        //Given
        int tonerLevel_max = 1;
        int tonerAmount_max = 100;

        //When
        Printer printer_max = new Printer(tonerLevel_max, duplex);
        int toner_max = printer_max.addToner(tonerAmount_max);

        //Then
        assertEquals(-1, toner_max);

        //Given
        int tonerLevel_min = -9;
        int tonerAmount_min = 1;

        //When
        Printer printer_min = new Printer(tonerLevel_min, duplex);
        int toner_min = printer_min.addToner(tonerAmount_min);

        //Then
        assertEquals(0, toner_min);

    }

    @Test
    void printPages() {

        //Given
        int pagesPrinted = 5;
        int tonerLevel = 50;
        boolean duplex = true;

        //When
        Printer printer = new Printer(tonerLevel, duplex);
        int TotalPages = printer.printPages(pagesPrinted);

        //Then
        assertEquals(3, TotalPages);


    }
}

