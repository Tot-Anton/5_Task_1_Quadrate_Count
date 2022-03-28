package ru.netology.sqr;

public class SqrService {
    public static int sqrOfRange(int lowerBound, int upperBound) {
        int numberCounter = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerBound <= i * i && i * i <= upperBound) {
                numberCounter++;
            }
        }
        return numberCounter;
    }
}

