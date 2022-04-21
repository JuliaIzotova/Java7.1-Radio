package ru.netology.domain;

public class Radio {
    private int maxRadioStation;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {
        this.maxRadioStation = 9;
    }

    public Radio(int sumRadioStations) {
        this.maxRadioStation = sumRadioStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }


    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}
