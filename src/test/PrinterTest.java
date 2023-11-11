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

