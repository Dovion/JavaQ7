package ru.netology.sqr;

public class SQRService {

    public int SQRCalc(int squareUnder, int squareOver) {
        int result = 0;
        int x = 0;
        while (x * x < squareUnder) {
            x++;
        }
        while (x * x <= squareOver) {
            result++;
            x++;
        }
        return result;

    }
}





