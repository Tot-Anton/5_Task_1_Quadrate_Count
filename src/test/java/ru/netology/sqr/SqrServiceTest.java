package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {

    @org.junit.jupiter.api.Test

    void squaresInTheRange1() {
        SqrService service = new SqrService();
        int lowerBound = 0;
        int upperBound = 100;
        int expected = 1;
        int actual = service.squaresInTheRange(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество квадратов, тест 1: " + SqrService.squaresInTheRange(lowerBound , upperBound));
    }

    @org.junit.jupiter.api.Test

    void squaresInTheRange2() {
        SqrService service = new SqrService();
        int lowerBound = 100;
        int upperBound = 500;
        int expected = 13;
        int actual = service.squaresInTheRange(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество квадратов, тест 2: " + SqrService.squaresInTheRange(lowerBound , upperBound));
    }

    @org.junit.jupiter.api.Test

    void squaresInTheRange3() {
        SqrService service = new SqrService();
        int lowerBound = 500;
        int upperBound = 8000;
        int expected = 67;
        int actual = service.squaresInTheRange(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество квадратов, тест 3: " + SqrService.squaresInTheRange(lowerBound , upperBound));
    }

}


