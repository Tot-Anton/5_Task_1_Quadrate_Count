package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {


    @org.junit.jupiter.api.Test


    void squaresInTheRange() {
        SqrService service = new SqrService();
        int lowerBound = 200;
        int upperBound = 300;
        int expected = 3;
        int actual = service.squaresInTheRange(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество квадратов, тест 1: " + SqrService.squaresInTheRange(lowerBound , upperBound));
    }

}