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
        int pagesPrinted1 = 5;
        int tonerLevel1 = 50;
        boolean duplex1 = true;

        //When
        Printer printer1 = new Printer(tonerLevel1, duplex1);
        int TotalPages1 = printer1.printPages(pagesPrinted1);

        //Then
        assertEquals(3, TotalPages1);
        assertEquals(3, printer1.getPagesPrinted());

        //Given
        int pagesPrinted2 = 5;
        int tonerLevel2 = 50;
        boolean duplex2 = false;

        //When
        Printer printer2 = new Printer(tonerLevel2, duplex2);
        int TotalPages2 = printer2.printPages(pagesPrinted2);

        //Then
        assertEquals(5, TotalPages2);
        assertEquals(5, printer2.getPagesPrinted());




    }
}

