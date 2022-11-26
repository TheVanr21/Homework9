package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 9; i++) { //+9
            radio.increaseVolume();
        }

        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToLimit() {
        Radio radio = new Radio();

        for (int i = 0; i < 10; i++) { //+10
            radio.increaseVolume();
        }

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOverLimit() {
        Radio radio = new Radio();

        for (int i = 0; i < 11; i++) { //+11
            radio.increaseVolume();
        }

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 2; i++) { //+2
            radio.increaseVolume();
        }
        radio.decreaseVolume(); //-1

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToLimit() {
        Radio radio = new Radio();

        radio.increaseVolume(); //+1
        radio.decreaseVolume(); //-1

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOverLimit() {
        Radio radio = new Radio();

        radio.decreaseVolume(); //-1

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverLimit() {
        Radio radio = new Radio();

        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderLimit() {
        Radio radio = new Radio();

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToUpperLimit() {
        Radio radio = new Radio();

        radio.setStation(9);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToLowerLimit() {
        Radio radio = new Radio();

        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();

        for (int i = 0; i <8; i++) { //+8
            radio.increaseStation();
        }

        int expected = 8;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationToLimit() {
        Radio radio = new Radio();

        for (int i = 0; i <9; i++) { //+9
            radio.increaseStation();
        }

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationOverLimitToZero() {
        Radio radio = new Radio();

        for (int i = 0; i <10; i++) { //+10
            radio.increaseStation();
        }

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();

        for (int i = 0; i <2; i++) { //+2
            radio.increaseStation();
        }
        radio.decreaseStation(); //-1

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationToLimit() {
        Radio radio = new Radio();

        radio.increaseStation(); //+1
        radio.decreaseStation(); //-1

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationOverLimitToNine() {
        Radio radio = new Radio();

        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

}
