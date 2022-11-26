package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Test for Default Radio
    Radio radio = new Radio();

    @Test
    public void shouldIncreaseVolume() {
        for (int i = 0; i < 99; i++) { //+99
            radio.increaseVolume();
        }

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToLimit() {
        for (int i = 0; i < 100; i++) { //+100
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOverLimit() {
        for (int i = 0; i < 101; i++) { //+101
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
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
        radio.increaseVolume(); //+1
        radio.decreaseVolume(); //-1

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOverLimit() {
        radio.decreaseVolume(); //-1

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation() {
        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverLimit() {
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderLimit() {
        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToUpperLimit() {
        radio.setStation(9);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToLowerLimit() {
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        for (int i = 0; i < 8; i++) { //+8
            radio.increaseStation();
        }

        int expected = 8;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationToLimit() {
        for (int i = 0; i < 9; i++) { //+9
            radio.increaseStation();
        }

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationOverLimitToZero() {
        for (int i = 0; i < 10; i++) { //+10
            radio.increaseStation();
        }

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        for (int i = 0; i < 2; i++) { //+2
            radio.increaseStation();
        }
        radio.decreaseStation(); //-1

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationToLimit() {
        radio.increaseStation(); //+1
        radio.decreaseStation(); //-1

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationOverLimitToAmountMinusOne() {
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    //Test for modified Radio
    Radio radio2 = new Radio(5);

    @Test
    public void shouldIncreaseVolume2() {
        for (int i = 0; i < 99; i++) { //+99
            radio2.increaseVolume();
        }

        int expected = 99;
        int actual = radio2.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToLimit2() {
        for (int i = 0; i < 100; i++) { //+100
            radio2.increaseVolume();
        }

        int expected = 100;
        int actual = radio2.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOverLimit2() {
        for (int i = 0; i < 101; i++) { //+101
            radio2.increaseVolume();
        }

        int expected = 100;
        int actual = radio2.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() {
        for (int i = 0; i < 2; i++) { //+2
            radio2.increaseVolume();
        }
        radio2.decreaseVolume(); //-1

        int expected = 1;
        int actual = radio2.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToLimit2() {
        radio2.increaseVolume(); //+1
        radio2.decreaseVolume(); //-1

        int expected = 0;
        int actual = radio2.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOverLimit2() {
        radio2.decreaseVolume(); //-1

        int expected = 0;
        int actual = radio2.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation2() {
        radio2.setStation(2);

        int expected = 2;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverLimit2() {
        radio2.setStation(5);

        int expected = 0;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderLimit2() {
        radio2.setStation(-1);

        int expected = 0;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToUpperLimit2() {
        radio2.setStation(4);

        int expected = 4;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToLowerLimit2() {
        radio2.setStation(0);

        int expected = 0;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation2() {
        for (int i = 0; i < 3; i++) { //+3
            radio2.increaseStation();
        }

        int expected = 3;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationToLimit2() {
        for (int i = 0; i < 4; i++) { //+4
            radio2.increaseStation();
        }

        int expected = 4;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationOverLimitToZero2() {
        for (int i = 0; i < 5; i++) { //+5
            radio2.increaseStation();
        }

        int expected = 0;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation2() {
        for (int i = 0; i < 2; i++) { //+2
            radio2.increaseStation();
        }
        radio2.decreaseStation(); //-1

        int expected = 1;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationToLimit2() {
        radio2.increaseStation(); //+1
        radio2.decreaseStation(); //-1

        int expected = 0;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationOverLimitToAmountMinusOne2() {
        radio2.decreaseStation();

        int expected = 4;
        int actual = radio2.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationsAmountAboveZero() {
        Radio radio3 = new Radio(-1);

        for (int i = 0; i < 10; i++){
            radio3.increaseStation();
        }

        int expected = 0;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);
    }

}
