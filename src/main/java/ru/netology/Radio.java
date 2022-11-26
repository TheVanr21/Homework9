package ru.netology;

public class Radio {
    private int volume;
    private int station;
    private int stationsAmount = 10;

    public Radio() {
    }

    public Radio(int stationsAmount) {
        if (stationsAmount < 0) {
            return;
        }
        this.stationsAmount = stationsAmount;
    }

    private void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
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
        if (newStation > stationsAmount - 1) {
            return;
        }
        station = newStation;
    }

    public int getStation() {
        return station;
    }

    public void increaseStation() {
        if (station == stationsAmount - 1) {
            station = 0;
            return;
        }
        station = station + 1;
    }

    public void decreaseStation() {
        if (station == 0) {
            station = stationsAmount - 1;
            return;
        }
        station = station - 1;
    }

}
