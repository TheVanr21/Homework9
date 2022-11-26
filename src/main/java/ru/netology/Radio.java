package ru.netology;

public class Radio {
    private int volume;
    private int station;

    private void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        setVolume(volume + 1);
    }

    public void decreaseVolume() {
        setVolume(volume - 1);
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }

    public int getStation() {
        return station;
    }

    public void increaseStation() {
        if (station == 9) {
            station = 0;
            return;
        }
        station = station + 1;
    }

    public void decreaseStation() {
        if (station == 0) {
            station = 9;
            return;
        }
        station = station - 1;
    }

}
