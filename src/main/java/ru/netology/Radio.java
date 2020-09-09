package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation < 0) || (currentStation > 9)) return;
        else this.currentStation = currentStation;
    }

    public void next(){
        if (currentStation == 9) currentStation = 0;
        else currentStation++;
    }

    public void prev(){
        if (currentStation == 0) currentStation = 9;
        else currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if ((currentVolume < 0) || (currentVolume > 10)) return;
        else this.currentVolume = currentVolume;
    }

    public void minus(){
        if (currentVolume == 0) return;
        else currentVolume--;
    }

    public void plus(){
        if (currentVolume == 10) return;
        else currentVolume++;
    }

}
