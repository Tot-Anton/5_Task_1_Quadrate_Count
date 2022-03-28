package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {


    @org.junit.jupiter.api.Test
    void sqrOfRange1() {
        int lowerBound = 0;
        int upperBound = 99;
        SqrService service = new SqrService();
        System.out.println("Количество квадратов, тест 1: " + SqrService.sqrOfRange(lowerBound , upperBound));

    }

    @org.junit.jupiter.api.Test
    void sqrOfRange2() {
        int lowerBound = 100;
        int upperBound = 300;
        SqrService service = new SqrService();
        System.out.println("Количество квадратов, тест 2: " + SqrService.sqrOfRange(lowerBound , upperBound));

    }

    @org.junit.jupiter.api.Test
    void sqrOfRange3() {
        int lowerBound = 301;
        int upperBound = 600;
        SqrService service = new SqrService();
        System.out.println("Количество квадратов, тест 3: " + SqrService.sqrOfRange(lowerBound , upperBound));

    }

    @org.junit.jupiter.api.Test
    void sqrOfRange4() {
        int lowerBound = 601;
        int upperBound = 1000;
        SqrService service = new SqrService();
        System.out.println("Количество квадратов, тест 4: " + SqrService.sqrOfRange(lowerBound , upperBound));

    }

    @org.junit.jupiter.api.Test
    void sqrOfRange5() {
        int lowerBound = 1001;
        int upperBound = 1500;
        SqrService service = new SqrService();
        System.out.println("Количество квадратов, тест 5: " + SqrService.sqrOfRange(lowerBound , upperBound));

    }
}